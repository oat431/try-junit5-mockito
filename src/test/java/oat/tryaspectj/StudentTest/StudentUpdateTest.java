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
@DisplayName("Test Script for StudentRetrieveTest on Junit5")
public class StudentUpdateTest {

    @Autowired
    StudentService studentService;
    Student student1,student2,student3,student4;

    @BeforeEach
    void setUp(){
        student1 = Student.builder()
                .studentId("5017")
                .firstname("studentOn1")
                .lastname("numberOn1")
                .build();
        student2 = Student.builder()
                .studentId("622115000")
                .firstname("studentTwo")
                .lastname("numberTwo")
                .build();
        student3 = Student.builder()
                .studentId("5039")
                .firstname("Oat")
                .lastname("Oralita")
                .build();
        student4 = Student.builder()
                .studentId("5017")
                .firstname("Pun")
                .lastname("Donut")
                .build();
    }

    @Test
    @DisplayName("Normal Case")
    void updateStudentNormalCase(){
        assertNotNull(studentService.getStudent("5017"));
        studentService.updateStudent("5017",student1);
        assertEquals("studentOn1", studentService.getStudent("5017").getFirstname());
        assertEquals("numberOn1", studentService.getStudent("5017").getLastname());
        studentService.deleteStudent("5017");
        studentService.addStudent(student4);
    }

    @Test
    @DisplayName("Student ID Not found")
    void updateStudentButIdNotFound(){
        ResponseStatusException exception = assertThrows(ResponseStatusException.class, () -> {
            studentService.updateStudent(student2.getStudentId(),student2);
        });
        assertEquals(HttpStatus.NOT_FOUND,exception.getStatus());
    }

    @Test
    @DisplayName("Student Data is duplicate")
    void updateStudentButDataIsDuplilcate(){
        ResponseStatusException exception = assertThrows(ResponseStatusException.class, () -> {
            studentService.updateStudent(student1.getStudentId(),student3);
        });
        assertEquals(HttpStatus.BAD_REQUEST,exception.getStatus());
    }
}
