package oat.tryaspectj.StudentTest;

import oat.tryaspectj.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("Test Script for Student Registration on Junit5")
public class StudentRegistrationTest {
    @BeforeEach
    void setUp(){

    }

    @Test
    @DisplayName("Normal Case")
    void RegistrationNormalCase(){

    }

    @Test
    @DisplayName("Student ID Is Invalid")
    void RegistrationButStudentIdIsInvalid(){

    }

    @Test
    @DisplayName("Student Data is duplicate")
    void RegistrationButStudentDataIsDuplicate(){

    }
}
