package com.hg.spring_practice.repository;

import com.hg.spring_practice.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepo implements DemoRepo<Student> {

    private Map<Long, Student> students;

    public StudentRepo() {
        this.students = new HashMap<>();
    }

    @Override
    public void save(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public Student findById(long id) {
        return students.get(id);
    }

    @Override
    public List<Student> getAll() {
        return students.isEmpty() ? new ArrayList<>() : students.values().stream().toList();
    }
}
