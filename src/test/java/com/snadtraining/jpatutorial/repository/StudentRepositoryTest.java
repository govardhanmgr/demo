package com.snadtraining.jpatutorial.repository;


import com.snadtraining.jpatutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest

class StudentRepositoryTest {

    @Autowired
    private StudentRepository sr;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("test2@gmail.com")
                .firstName("test")
                .lastName("test last")
                .guardianName("testcard")
                .guardianEmail("test@guard.com")
                .guardianMobile("900586958")
                .build();

        sr.save(student);

    }
    public  void printAllStudents(){
        List<Student> studList = sr.findAll();
        System.out.println("Student List = "+ studList);
    }


}