package oat.tryaspectj.StudentTest;

import oat.tryaspectj.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("Test Script for StudentRetrieveTest on Junit5")
public class StudentDeleteTest {
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
