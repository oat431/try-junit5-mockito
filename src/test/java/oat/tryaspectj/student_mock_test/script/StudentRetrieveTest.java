package oat.tryaspectj.student_mock_test.script;

import oat.tryaspectj.entity.Student;
import oat.tryaspectj.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("Test Script for StudentRetrieveTest on Junit5")
public class StudentRetrieveTest {
    @Mock
    Student student;

    @InjectMocks
    StudentService studentService;

    @BeforeEach
    void setUp(){
        when(student.getFirstname()).thenReturn("John");
        when(student.getLastname()).thenReturn("Doe");
    }

    @Test
    @DisplayName("Normal case")
    void retrieveStudentNormalCase(){
        studentService.getStudent("5039");
    }

    @Test
    @DisplayName("Not found case")
    void retrieveStudentNotFoundCase(){
    }

}
