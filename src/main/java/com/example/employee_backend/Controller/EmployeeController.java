package com.example.employee_backend.Controller;

import com.example.employee_backend.Model.Employee;
import com.example.employee_backend.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao dao;
    @GetMapping("/")
    public String Homepage(){
        return"Welcome to employee home page";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String Addemployee(@RequestBody Employee e)
    {
        System.out.println(e.getEmpname().toString());
        dao.save(e);
        return"Welcome to employee add page";

    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Employee> view()
    {
        return (List<Employee>) dao.findAll();
    }
}
