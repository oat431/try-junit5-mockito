package oat.tryaspectj.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class StudentNameAlreadyExist extends Throwable {
    public StudentNameAlreadyExist(String firstname, String lastname) {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"name: " + firstname + " " + lastname + " had been taken");
    }
}
