package oat.tryaspectj.controller;

import oat.tryaspectj.entity.Student;
import oat.tryaspectj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
        return ResponseEntity.ok(studentService.addStudent(student));
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<?> updateStudent(
            @RequestBody Student student,
            @PathVariable("id") String id
    ){
        return ResponseEntity.ok(studentService.updateStudent(student,id));
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable("id") String id){
        return ResponseEntity.ok(studentService.deleteStudent(id));
    }

    @GetMapping("/")
    public ResponseEntity<?> showAllStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> showStudent(@PathVariable("id") String id){
        return ResponseEntity.ok(studentService.getStudent(id));
    }


}
