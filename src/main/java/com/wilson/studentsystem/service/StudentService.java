package com.wilson.studentsystem.service;

import com.wilson.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public void saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudent (Integer id);
    public void delete(Integer id);

}
