package com.student.api.Student.API.repository;

import com.student.api.Student.API.models.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

// @Repository annotation tells springboot it is your repository layer
@Repository
public class StudentRepository {
    // Repository layer is something that can perform database related operation
    // StudentID vs Student Object
    HashMap<String, Student> studentDb = new HashMap<>();

    public void saveStudent(Student student){
        System.out.println("Request recieved repository layer");
        String id = student.getId();
        // save into the db
        System.out.println("Adding student object in repository layer");
        studentDb.put(id, student);
        System.out.println(studentDb);
        System.out.println("Student got added into the system");
        // student got inserted into the db
    }

    public Student getStudentById(String id){
        return studentDb.get(id);
    }

    // "Somendra" : "QA"

    // map.put("Somendra", "QA")

    public Student updateStudentById(String id, Student student){
        if(!studentDb.containsKey(id)){
            return null;
        }
        studentDb.put(id, student);
        System.out.println(studentDb);

        return studentDb.get(id);
    }
}

