package com.hg.spring_practice.service_impl;

import com.hg.spring_practice.entity.Student;
import com.hg.spring_practice.repository.StudentRepo;
import com.hg.spring_practice.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.getAll();
    }

    @Override
    public void saveStudent(Student student) {
        studentRepo.save(student);
    }

    @Override
    public Student getStudentByID(long id) {
        return studentRepo.findById(id);
    }
}
