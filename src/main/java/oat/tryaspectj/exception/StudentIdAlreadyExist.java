package oat.tryaspectj.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class StudentIdAlreadyExist extends Throwable {
    public StudentIdAlreadyExist(String studentId) {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"studentId: " + studentId + " already exist");
    }
}
