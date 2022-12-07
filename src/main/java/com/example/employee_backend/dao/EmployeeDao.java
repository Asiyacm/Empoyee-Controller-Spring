package com.example.employee_backend.dao;

import com.example.employee_backend.Model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
