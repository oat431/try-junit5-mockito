package oat.tryaspectj.repository;


import oat.tryaspectj.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findByStudentId(String studentId);
    Student findByFirstnameAndLastname(String firstname,String lastname);
}
