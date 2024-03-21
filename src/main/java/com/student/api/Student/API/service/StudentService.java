package com.student.api.Student.API.service;

import com.student.api.Student.API.models.Student;
import com.student.api.Student.API.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service // This annotation tells springboot that it is your service layer
public class StudentService {
    // Service layer is something where we write all the Business logic
    // Service layer is something that call repository layer to do database related operation
    // So we need to establish somekind of relationship between service layer and repository layer
    // I am manually establishing relationship later it will be handeled by springboot
    StudentRepository studentRepository = new StudentRepository();
    // By creating object of repository layer relationship between student service
    // and student repository layer got created

    public void saveStudent(Student student){
        System.out.println("Student object recieved in service layer");
        // call repository layer to save student
        studentRepository.saveStudent(student);
        System.out.println("Student got saved in db");
    }

    public Student getStudentById(String id){
        return studentRepository.getStudentById(id);
    }

    public Student updateStudentById(String id, Student student){
        return studentRepository.updateStudentById(id, student);
    }


}
