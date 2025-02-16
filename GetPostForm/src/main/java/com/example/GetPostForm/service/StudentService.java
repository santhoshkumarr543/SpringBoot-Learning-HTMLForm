package com.example.GetPostForm.service;

import com.example.GetPostForm.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> ls = new ArrayList<>(Arrays.asList(
            new Student(1,"Santhosh Kumar R","JAVA FULLSTACK"),
            new Student(2,"Santhana Sanjay G S","Blockchain"),
            new Student(3,"Prasanna V","Bank"))
    );
    public List<Student> getAllStudents() {
        return ls;
    }

    public void addStudent(int rno, String name, String technology) {
        Student st = new Student(rno,name,technology);
        ls.add(st);
    }
}
