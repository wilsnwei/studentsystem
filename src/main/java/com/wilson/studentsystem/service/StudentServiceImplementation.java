package com.wilson.studentsystem.service;

import com.wilson.studentsystem.model.Student;
import com.wilson.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student getStudent(Integer id) { return studentRepository.findById(id).get(); }
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public void delete(Integer id) { studentRepository.deleteById(id); }
}
