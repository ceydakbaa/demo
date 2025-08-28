package com.ceyda.demo.service;


import com.ceyda.demo.entity.Student;
import com.ceyda.demo.repository.StudentsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentsService {
    private final StudentsRepository studentsRepository;


    public Student saveStudents(Student students) {
        if(students.getBooks()!=null){
            students.getBooks().forEach(book -> book.setStudent(students));
        }
        return studentsRepository.save(students);
    }

    public List<Student> findAllStudents() {
        return studentsRepository.findAll();
    }

}
