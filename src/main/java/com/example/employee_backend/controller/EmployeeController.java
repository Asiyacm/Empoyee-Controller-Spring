package com.example.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

    @GetMapping("/")

    public String Homepage(){

        return("Welcome Employee");

    }

    @GetMapping("/add")

    public String Empadd(){

        return("Add Employee");

    }

    @GetMapping("/search")

    public String Empsearch(){

        return("Search Employee");

    }

    @GetMapping("/edit")

    public String Empedit(){

        return("Edit Employee");

    }

    @GetMapping("/view")

    public String Empview(){

        return("View Employee");

    }

    @GetMapping("/delete")

    public String Empdelete(){

        return("Delete Employee");

    }

}
