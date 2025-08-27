package com.ceyda.demo.controller;


import com.ceyda.demo.entity.Student;
import com.ceyda.demo.service.StudentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentsController {

    private final StudentsService studentsService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student students){
        return studentsService.saveStudents(students);
    }

    @GetMapping("/list")
    public List<Student> findAllStudents() {
        return studentsService.findAllStudents();
    }

}
