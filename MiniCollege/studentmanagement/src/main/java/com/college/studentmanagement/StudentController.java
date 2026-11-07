package com.college.studentmanagement;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    // Student Registration Page
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // Save Student Details
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {

        repository.save(student);

        return "redirect:/";
    }

    // Admin Page
    @GetMapping("/admin")
    public String admin(Model model) {

        model.addAttribute(
            "students",
            repository.findAll()
        );

        return "admin";
    }
}