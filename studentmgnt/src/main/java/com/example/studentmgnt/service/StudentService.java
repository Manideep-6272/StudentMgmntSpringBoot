package com.example.studentmgnt.service;


import com.example.studentmgnt.entities.Student;
import com.example.studentmgnt.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public List<Student> findAll(){
        return studentRepo.findAll();
    }

    public void addStudent(Student student){
        studentRepo.save(student);
    }

    public Student getStudentById(int id){
        return studentRepo.findById(id).get();
    }

    public void deleteStudent(int id){
        studentRepo.deleteById(id);
    }

    public void update(int id,Student std){
        Student student = studentRepo.findById(id).get();
        student.setName(std.getName());
        student.setAge(std.getAge());
        student.setCgpa(std.getCgpa());
        studentRepo.save(student);
    }
}
