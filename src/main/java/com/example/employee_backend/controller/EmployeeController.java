package com.example.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

    @GetMapping("/")

    public String Homepage(){

        return("Welcome Employee");

    }

    @PostMapping("/add")

    public String Empadd(){

        return("Add Employee");

    }

    @PostMapping("/search")

    public String Empsearch(){

        return("Search Employee");

    }

    @PostMapping("/edit")

    public String Empedit(){

        return("Edit Employee");

    }

    @GetMapping("/view")

    public String Empview(){

        return("View Employee");

    }

    @PostMapping("/delete")

    public String Empdelete(){

        return("Delete Employee");

    }

}
