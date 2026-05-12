package com.wipro.studentreg.serviceimpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.studentreg.entity.Employee;
import com.wipro.studentreg.mobilerepo.EmployeeRepo;
import com.wipro.studentreg.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public void save(Employee e) {
        employeeRepo.save(e);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    @Override
    public Optional<Employee> findById(int id) {
        return employeeRepo.findById(id);
    }

    @Override
    public void deleteById(int id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public void update(Employee e) {
        employeeRepo.save(e);
    }

    @Override
    public List<Employee> findByName(String name) {
        return employeeRepo.findByName(name);
    }
}