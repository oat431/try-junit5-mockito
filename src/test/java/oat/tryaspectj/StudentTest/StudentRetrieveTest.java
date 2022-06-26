package oat.tryaspectj.StudentTest;

import oat.tryaspectj.dao.StudentDao;
import oat.tryaspectj.dao.StudentDaoImpl;
import oat.tryaspectj.entity.Student;
import oat.tryaspectj.repository.StudentRepository;
import oat.tryaspectj.service.StudentService;
import oat.tryaspectj.service.StudentServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("Test Script for StudentRetrieveTest on Junit5")
public class StudentRetrieveTest {
    @BeforeEach
    void setUp(){
    }

    @Test
    @DisplayName("Normal case")
    void retrieveStudentNormalCase(){
    }

    @Test
    @DisplayName("Not found case")
    void retrieveStudentNotFoundCase(){
    }

}
