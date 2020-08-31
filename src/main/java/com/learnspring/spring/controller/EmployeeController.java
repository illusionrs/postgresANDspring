package com.learnspring.spring.controller;

import com.learnspring.spring.model.Employee;
import com.learnspring.spring.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    private EmpService empService;

    //GET MAPPING

    @RequestMapping(method = RequestMethod.GET,value = "/employee")
    public List<Employee> getAll(){

        return this.empService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/employee/{id}")
    public Optional<Employee> getOne(@PathVariable long id)
    {
        Optional<Employee> emp=empService.findById(id);
        return emp;
    }

    @RequestMapping(method = RequestMethod.POST,value = "/employee")
    public void createEmp(@RequestBody Employee emp){

        empService.save(emp);
    }


}
