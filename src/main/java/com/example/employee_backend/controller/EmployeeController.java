package com.example.employee_backend.controller;

import com.example.employee_backend.model.Employees;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

    @GetMapping("/")

    public String Homepage(){

        return("Welcome Employee");

    }

    @PostMapping(path= "/add",consumes = "application/json",produces = "application/json")
    public String AddEmployee(@RequestBody Employees e){
        System.out.println(e.getName().toString());
        return"Employee Added Sucessfully";
    }

}
