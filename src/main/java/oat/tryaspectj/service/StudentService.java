package oat.tryaspectj.service;

import oat.tryaspectj.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudent(String id);
}
