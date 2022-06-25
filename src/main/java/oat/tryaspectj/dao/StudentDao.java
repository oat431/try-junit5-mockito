package oat.tryaspectj.dao;

import oat.tryaspectj.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getAllStudents();
    Student addStudent(Student student);
    Student updateStudent(Student student);
    Student getStudentById(String id);
    Student getStudentByStudentName(String firstname, String lastname);
    void deleteStudent(Student id);
}
