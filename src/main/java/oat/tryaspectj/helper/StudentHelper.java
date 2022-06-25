package oat.tryaspectj.helper;

import lombok.SneakyThrows;
import oat.tryaspectj.entity.Student;
import oat.tryaspectj.exception.StudentIdInvalidException;
import oat.tryaspectj.exception.StudentNotFoundException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class StudentHelper {

    @AfterReturning(pointcut = "execution(* oat.tryaspectj.service.StudentServiceImpl.getStudent(..))",returning = "result")
    @SneakyThrows
    public void checkStudentExist(JoinPoint joinPoint,Object result){
        Object[] objects = joinPoint.getArgs();
        String id = objects[0].toString();
        if(result == null){
            throw new StudentNotFoundException(id);
        }
    }
}

