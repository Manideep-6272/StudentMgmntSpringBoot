package com.example.studentmgnt.controller;


import com.example.studentmgnt.entities.Student;
import com.example.studentmgnt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {


    @Autowired
    StudentService studentService;


    @GetMapping("/getStudents")
    public List<Student> getAllStudents(){
        return studentService.findAll();
    }

    @PostMapping("/addstudent")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id){
        return studentService.getStudentById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id,@RequestBody Student student){
        studentService.update(id,student);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        studentService.deleteStudent(id);
    }
}
