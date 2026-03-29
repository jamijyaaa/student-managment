package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>();
    private Long idCounter = 1L;

    public List<Student> getAllStudents() {
        return students;
    }

    public Student addStudent(Student student) {
        student.setId(idCounter++);
        students.add(student);
        return student;
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                s.setName(updatedStudent.getName());
                s.setAge(updatedStudent.getAge());
                return s;
            }
        }
        return null;
    }

    public void deleteStudent(Long id) {
        students.removeIf(s -> s.getId().equals(id));
    }
}