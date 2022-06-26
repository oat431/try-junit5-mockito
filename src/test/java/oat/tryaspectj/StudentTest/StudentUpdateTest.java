package oat.tryaspectj.StudentTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("Test Script for StudentRetrieveTest on Junit5")
public class StudentUpdateTest {
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
