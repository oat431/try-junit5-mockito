package oat.tryaspectj.student_mock_test.script;

import oat.tryaspectj.entity.Student;
import oat.tryaspectj.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
@DisplayName("Test Script for StudentRetrieveTest on Junit5")
public class StudentDeleteTest {

    @Mock
    StudentService studentService;

    Student student1,student2;

    @BeforeEach
    void setUp(){

    }

    @Test
    @DisplayName("Normal case")
    void deleteStudentNormalCase(){

    }

    @Test
    @DisplayName("Not found case")
    void deleteStudentNotFoundCase(){

    }
}
