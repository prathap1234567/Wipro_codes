package com.wipro.studentreg.service;


import java.util.List;
import java.util.Optional;

import com.wipro.studentreg.entity.Employee;


public interface EmployeeService {

    void save(Employee e);
    List<Employee> findAll();
    Optional<Employee> findById(int id);
    void deleteById(int id);
    void update(Employee e);
    List<Employee> findByName(String name);
}