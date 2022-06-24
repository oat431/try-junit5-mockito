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
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @Override
    public Student getStudent(String id){
        for(Student student : studentDao.getAllStudents()){
            if(id.equals(student.getId())){
                return student;
            }
        }
        return null;
    }
}
