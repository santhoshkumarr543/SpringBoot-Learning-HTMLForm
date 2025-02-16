package com.example.GetPostForm.controller;

import com.example.GetPostForm.model.Student;
import com.example.GetPostForm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500/")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }

    @PostMapping("/add/students")
    public void addStudent(@RequestParam("rno") int rno,
                           @RequestParam("name") String name,
                           @RequestParam("technology") String technology)
    {
        studentService.addStudent(rno,name,technology);
    }
}
