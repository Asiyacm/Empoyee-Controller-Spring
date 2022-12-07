package com.example.employee_backend.dao;

import com.example.employee_backend.Model.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {


@Query(value = "SELECT `id`, `companyname`, `designation`, `empcode`, `empname`, `mobile`, `password`, `salary`, `username` FROM `employee` WHERE `empcode`=:empcode",nativeQuery = true)
List<Employee> Search(@Param("empcode") Integer empcode);
}