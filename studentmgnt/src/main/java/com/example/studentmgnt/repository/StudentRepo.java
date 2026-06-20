package com.example.studentmgnt.repository;

import com.example.studentmgnt.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
}
