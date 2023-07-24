package com.hg.spring_practice.contoller;

import com.hg.spring_practice.entity.Student;
import com.hg.spring_practice.order_ex.OrderExInterface;
import com.hg.spring_practice.primary_ex.Car;
import com.hg.spring_practice.service_impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    StudentServiceImpl studentService;
    @Autowired
    Car car;

    @PostMapping("/saveStudent")
    ResponseEntity<HttpStatus> saveStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getStudents")
    List<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/getStudentByID/{id}")
    Student getStudentById(@PathVariable(name = "id") long id) {
        return studentService.getStudentByID(id);
    }

    @GetMapping("/getCar")
    String getCAr() {
        return car.carName();
    }

    @Autowired
    List<OrderExInterface> orderExInterfaces;

    @GetMapping("/orderEx")
    String orderEx() {
        return "order 1: " + orderExInterfaces.get(0).getRating()
                + "\nOrder 2: " + orderExInterfaces.get(1).getRating()
                + "\nOrder 3: " + orderExInterfaces.get(2).getRating();
    }
}
