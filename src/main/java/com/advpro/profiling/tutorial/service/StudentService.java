package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public List<StudentCourse> getAllStudentsWithCourses() {
        // Optimized: Single database query instead of N+1 queries
        // Returns all StudentCourse mappings with their associated Student and Course data
        return studentCourseRepository.findAll();
    }

    public Optional<Student> findStudentWithHighestGpa() {
        // Optimized: Use database-level query instead of fetching all students to Java
        // Database query with ORDER BY gpa DESC and LIMIT 1 is much faster than loading all students
        return studentRepository.findStudentWithHighestGpa();
    }

    public String joinStudentNames() {
        // Optimized: Use String.join() and streams for efficient string building
        // Replaces inefficient string concatenation (O(n²)) with O(n) complexity
        List<Student> students = studentRepository.findAll();
        return String.join(", ",
            students.stream()
                .map(Student::getName)
                .toList());
    }
}

