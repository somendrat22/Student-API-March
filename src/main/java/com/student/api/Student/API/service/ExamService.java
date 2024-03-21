package com.student.api.Student.API.service;

import com.student.api.Student.API.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class ExamService {
    // Exam service is a kind of class i.e. dependent on StudentRepository
    // We have injected one dependency by our self.
    // The process of adding dependency in a class is called dependency injection
    StudentRepository studentRepository = new StudentRepository();
    public Integer getStudentResultById(String id){
        return studentRepository.getResultById(id);
    }
}
