package com.student.api.Student.API.controller;

import com.student.api.Student.API.models.Student;
import com.student.api.Student.API.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    // 1. If you are creating controller then you have to tell springboot this is a
    // a controller class.
    // You need to use @RestController annotation to let spring know this is a controller class

    StudentService studentService = new StudentService();

    @GetMapping("/student/details")
    public String getStudents(){
        return "Hello";
    }


    // PostMapping -> Whenever this endpoint will get hit user should send some details
    // of stun
    // Springboot is going to convert json into java object
    // If we are passing any requestbody then we need to tell springboot that this is a springboot
    @PostMapping("/student/upload")
    public String uploadStudent(@RequestBody Student student){
        // controller will call the service layer
        System.out.println("request recieved in controller layer");
        studentService.saveStudent(student);
        return "Student got saved";
    }

    // I want to get paryicular student details

    @GetMapping("/student/detail")
    public Student getStudentDetailsById(@RequestParam String id){
        return studentService.getStudentById(id);
    }

    @PutMapping("/student/details/update")
    public Student updateStudentById(@RequestParam String id, @RequestBody Student student){
        // We will call service layer to update student data
        return studentService.updateStudentById(id, student);
    }


}
