package com.hg.spring_practice.repository;

import com.hg.spring_practice.entity.Student;

import java.util.List;

public interface DemoRepo<T> {
    void save(T t);

    T findById(long id);

    List<Student> getAll();
}
