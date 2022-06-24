package oat.tryaspectj.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String id){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Not found Student id:" + id);
    }
}
