package oat.tryaspectj.helper;

import lombok.SneakyThrows;
import oat.tryaspectj.dao.StudentDao;
import oat.tryaspectj.entity.Student;
import oat.tryaspectj.exception.StudentIdAlreadyExist;
import oat.tryaspectj.exception.StudentIdInvalidException;
import oat.tryaspectj.exception.StudentNameAlreadyExist;
import oat.tryaspectj.exception.StudentNotFoundException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class StudentHelper {
    @Autowired
    StudentDao studentDao;

    @Before("execution(* oat.tryaspectj.service.StudentServiceImpl.addStudent(..))")
    @SneakyThrows
    public void checkStudentDataDuplicate(JoinPoint joinPoint){
        Object[] objects = joinPoint.getArgs();
        Student student = (Student) objects[0];
        Student checkDuplicateId = studentDao.getStudentById(student.getStudentId());
        Student checkDuplicateName = studentDao.getStudentByStudentName(student.getFirstname(),student.getLastname());
        if(checkDuplicateId != null) {
            throw new StudentIdAlreadyExist(student.getStudentId());
        }
        if(checkDuplicateName != null) {
            throw new StudentNameAlreadyExist(student.getFirstname(),student.getLastname());
        }
        if(student.getStudentId().length() != 4){
            throw  new StudentIdInvalidException(student.getStudentId());
        }
    }

    @Before("execution(* oat.tryaspectj.service.StudentServiceImpl.updateStudent(..))")
    @SneakyThrows
    public void checkStudentDataDuplicateWhenUpdate(JoinPoint joinPoint){
        Object[] objects = joinPoint.getArgs();
        Student student = (Student) objects[0];
        Student checkDuplicateName = studentDao.getStudentByStudentName(student.getFirstname(),student.getLastname());
        if(checkDuplicateName != null) {
            throw new StudentNameAlreadyExist(student.getFirstname(),student.getLastname());
        }
    }

    @Before("execution(* oat.tryaspectj.service.StudentServiceImpl.*(String,..))")
    @SneakyThrows
    public void checkStudentExist(JoinPoint joinPoint){
        Object[] objects = joinPoint.getArgs();
        String id = objects[0].toString();
        Student student = studentDao.getStudentById(id);
        if(student == null) {
            throw new StudentNotFoundException(id);
        }
    }
}

