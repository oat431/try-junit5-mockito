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
public class StudentRetrieveTest {
    @Autowired
    StudentService studentService;

    @BeforeEach
    void setUp(){
    }

    @Test
    @DisplayName("Normal case")
    void retrieveStudentNormalCase(){
        Student student = studentService.getStudent("5039");
        assertEquals("Oat", student.getFirstname());
    }

    @Test
    @DisplayName("Not found case")
    void retrieveStudentNotFoundCase(){
        ResponseStatusException exception = assertThrows(ResponseStatusException.class, () -> {
            studentService.getStudent("9999");
        });
        assertEquals(HttpStatus.NOT_FOUND,exception.getStatus());
    }

}
