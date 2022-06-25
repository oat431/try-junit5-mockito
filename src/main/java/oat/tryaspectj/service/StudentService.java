package oat.tryaspectj.service;

import oat.tryaspectj.entity.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    Student updateStudent(String id,Student student);
    Student deleteStudent(String id);
    List<Student> getAllStudents();
    Student getStudent(String id);
}
