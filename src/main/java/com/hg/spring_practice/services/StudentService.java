package com.hg.spring_practice.services;

import com.hg.spring_practice.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    void saveStudent(Student student);

    Student getStudentByID(long id);
}
