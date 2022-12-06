package com.example.employee_backend.controller;

import com.example.employee_backend.dao.EmployeesDao;
import com.example.employee_backend.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {

    @Autowired
    private EmployeesDao dao;
    @CrossOrigin(origins = "*")
    @GetMapping("/")

    public String Homepage() {

        return ("Welcome Employee");

    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String AddEmployee(@RequestBody Employees e) {
        System.out.println(e.getName().toString());
        dao.save(e);
        return "Employee Added Sucessfully";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Employees> viewEmployees() {
        return (List<Employees>)dao.findAll();

    }

}
