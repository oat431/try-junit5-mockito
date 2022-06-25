package oat.tryaspectj.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class StudentIdInvalidException extends Exception {
    public StudentIdInvalidException(String id){
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"require only 4 digit,but you gave " + id.length() + " digit");
    }
}
