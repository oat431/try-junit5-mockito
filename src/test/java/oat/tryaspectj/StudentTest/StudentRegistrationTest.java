package oat.tryaspectj.StudentTest;

import oat.tryaspectj.entity.Student;
import oat.tryaspectj.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
@DisplayName("Test Script for Student Registration on Junit5")
public class StudentRegistrationTest {
    @Autowired
    StudentService studentService;
    Student student1,student2,student3;

    @BeforeEach
    void setUp(){
        student1 = Student.builder()
                .studentId("5000")
                .firstname("studentOne")
                .lastname("numberOne")
                .build();
        student2 = Student.builder()
                .studentId("622115000")
                .firstname("studentTwo")
                .lastname("numberTwo")
                .build();
        student3 = Student.builder()
                .studentId("5039")
                .firstname("studentThree")
                .lastname("numberThree")
                .build();
    }

    @Test
    @DisplayName("Normal Case")
    void RegistrationNormalCase(){
        studentService.addStudent(student1);
        assertNotNull(studentService.getStudent("5000"));
        assertEquals("studentOne", studentService.getStudent("5000").getFirstname());
        assertEquals("numberOne", studentService.getStudent("5000").getLastname());
        studentService.deleteStudent("5000");
    }

    @Test
    @DisplayName("Student ID Is Invalid")
    void RegistrationButStudentIdIsInvalid(){
        ResponseStatusException exception = assertThrows(ResponseStatusException.class, () -> {
            studentService.addStudent(student2);
        });
        assertEquals(HttpStatus.BAD_REQUEST,exception.getStatus());
    }

    @Test
    @DisplayName("Student Data is duplicate")
    void RegistrationButStudentDataIsDuplicate(){
        ResponseStatusException exception = assertThrows(ResponseStatusException.class, () -> {
            studentService.addStudent(student3);
        });
        assertEquals(HttpStatus.BAD_REQUEST,exception.getStatus());
    }
}
