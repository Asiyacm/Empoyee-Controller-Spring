package com.example.employee_backend.Controller;

import com.example.employee_backend.Model.Employee;
import com.example.employee_backend.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao dao;
    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String Homepage(){
        return"Welcome to employee home page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/search",consumes = "application/json",produces = "application/json")
    public List<Employee> Search(@RequestBody Employee e) {

        String empcode = String.valueOf(e.getEmpcode());
        System.out.println(empcode);
        return (List<Employee>) dao.Search(e.getEmpcode());
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> Addemployee(@RequestBody Employee e)
    {
        System.out.println(e.getEmpname().toString());
        dao.save(e);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Employee> view()
    {
        return (List<Employee>) dao.findAll();
    }


}
