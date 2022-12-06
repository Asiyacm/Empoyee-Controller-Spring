package com.example.employee_backend.dao;

import com.example.employee_backend.model.Employees;
import org.springframework.data.repository.CrudRepository;

public interface EmployeesDao extends CrudRepository<Employees,Integer> {
}
