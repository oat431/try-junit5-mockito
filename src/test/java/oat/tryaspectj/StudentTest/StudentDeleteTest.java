package oat.tryaspectj.StudentTest;

import oat.tryaspectj.entity.Student;
import oat.tryaspectj.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
@DisplayName("Test Script for StudentRetrieveTest on Junit5")
public class StudentDeleteTest {
    @Autowired
    StudentService studentService;

    Student student1,student2;

    @BeforeEach
    void setUp(){
        student1 = Student.builder()
                .studentId("5006")
                .firstname("Tar")
                .lastname("SK-man")
                .build();
        student2 = Student.builder()
                .studentId("622115000")
                .firstname("studentTwo")
                .lastname("numberTwo")
                .build();
    }

    @Test
    @DisplayName("Normal case")
    void deleteStudentNormalCase(){
        studentService.deleteStudent(student1.getStudentId());
        ResponseStatusException exception = assertThrows(ResponseStatusException.class, () -> {
            studentService.getStudent(student1.getStudentId());
        });
        assertEquals(HttpStatus.NOT_FOUND,exception.getStatus());
        studentService.addStudent(student1);
    }

    @Test
    @DisplayName("Not found case")
    void deleteStudentNotFoundCase(){
        ResponseStatusException exception = assertThrows(ResponseStatusException.class, () -> {
            studentService.deleteStudent(student2.getStudentId());
        });
        assertEquals(HttpStatus.NOT_FOUND,exception.getStatus());
    }
}
