package oat.tryaspectj.dao;

import oat.tryaspectj.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao{
    Student[] students = {
            new Student("5006","SK","Man"),
            new Student("5010","Tle","Vector"),
            new Student("5011","DJ","LnRabbit"),
            new Student("5017","Pun","Dounut"),
            new Student("5018","Teetanic","Teem"),
            new Student("5023","Plunk","Pisuo"),
            new Student("5026","Fax","Domdae"),
            new Student("5028","Kong","Pazum"),
            new Student("5039","Oat","Oralita")
    };
    @Override

    public List<Student> getAllStudents() {
        return Arrays.stream(students).toList();
    }

}
