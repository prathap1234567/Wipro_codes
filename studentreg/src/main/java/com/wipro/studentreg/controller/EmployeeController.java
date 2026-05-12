package com.wipro.studentreg.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.wipro.studentreg.entity.Employee;
import com.wipro.studentreg.service.EmployeeService;


@Controller
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    String showAddForm(Model m){
        m.addAttribute("employee",new Employee());
        return "add-employee";
    }

    @PostMapping
    String saveEmployee(@ModelAttribute Employee e){
        employeeService.save(e);
        return "redirect:/employees/list";
    }

    @GetMapping("/list")
    String showList(Model m) {
        List<Employee> list = employeeService.findAll();
        m.addAttribute("employeeList", list);
        return "index";
    }

    @GetMapping("/delete/{id}")
    String deleteEmployee(@PathVariable int id){
        employeeService.deleteById(id);
        return "redirect:/employees/list";
    }

    @GetMapping("/edit/{id}")
    String editEmployee(@PathVariable int id, Model m) {
        Optional<Employee> opt = employeeService.findById(id);
        if(opt.isPresent()){
            m.addAttribute("employee", opt.get());
        }
        return "edit-employee";
    }

    @PostMapping("/update")
    String updateEmployee(@ModelAttribute Employee e){
        employeeService.update(e);
        return "redirect:/employees/list";
    }

    @GetMapping("/search")
    String searchEmployee(@RequestParam String name, Model m) {
        List<Employee> list = employeeService.findByName(name);
        m.addAttribute("employeeList", list);
        return "index";
    }
}
