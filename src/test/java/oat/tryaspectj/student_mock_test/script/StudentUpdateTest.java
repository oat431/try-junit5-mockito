package oat.tryaspectj.student_mock_test.script;

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

@ExtendWith(MockitoExtension.class)
@DisplayName("Test Script for StudentRetrieveTest on Junit5")
public class StudentUpdateTest {

    @Mock
    StudentService studentService;

    @BeforeEach
    void setUp(){
    }

    @Test
    @DisplayName("Normal Case")
    void updateStudentNormalCase(){
    }

    @Test
    @DisplayName("Student ID Not found")
    void updateStudentButIdNotFound(){
    }

    @Test
    @DisplayName("Student Data is duplicate")
    void updateStudentButDataIsDuplilcate(){
    }
}
