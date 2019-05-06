package com.syafiq.managementsystem.controller;


import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.syafiq.managementsystem.model.Student;
import com.syafiq.managementsystem.repository.StudentRepository;

import javax.jws.WebParam;
import javax.validation.Valid;

@Controller
public class StudentController {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/signup")
    public String showSignUpForm(Student student) {
        return "add-student";
    }

    @PostMapping("/addstudent")
    public String addStudent(@Valid Student student, BindingResult result, Model model){
        if (result.hasErrors()){
            return "add-student";
        }

        studentRepository.save(student);
        model.addAttribute("student", studentRepository.findAll());
        return "index";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException(("Invalid student id:" + id)));
        model.addAttribute("student", student);
        return "update-student";
    }

    @PostMapping("/update/{id}")
    public String updateStudent(@PathVariable("id") long id, @Valid Student student, BindingResult result, Model model){
        if (result.hasErrors()){
            student.setId(id);
            return "update-student";
        }

        studentRepository.save(student);
        model.addAttribute("student", studentRepository.findAll());
        return "index";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") long id, Model model){
        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid student id:" + id));
        studentRepository.delete(student);
        model.addAttribute("student", studentRepository.findAll());
        return "index";
    }


}
