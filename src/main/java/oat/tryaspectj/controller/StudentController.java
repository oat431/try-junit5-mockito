package oat.tryaspectj.controller;

import oat.tryaspectj.entity.Student;
import oat.tryaspectj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
        return ResponseEntity.ok(student);
    }

    @GetMapping("/student")
    public ResponseEntity<?> showAllStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<?> showStudent(@PathVariable("id") String id){
        return ResponseEntity.ok(studentService.getStudent(id));
    }


}
