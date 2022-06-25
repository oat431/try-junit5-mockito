package oat.tryaspectj.service;

import oat.tryaspectj.dao.StudentDao;
import oat.tryaspectj.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentDao studentDao;

    @Override
    public Student addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public Student updateStudent(Student student, String id) {
        Student update = studentDao.getStudentById(id);
        update.setFirstname(student.getFirstname());
        update.setLastname(student.getLastname());
        return studentDao.updateStudent(update);
    }

    @Override
    public Student deleteStudent(String id) {
        Student delete = studentDao.getStudentById(id);
        studentDao.deleteStudent(delete);
        return delete;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @Override
    public Student getStudent(String id){
        return studentDao.getStudentById(id);
    }
}
