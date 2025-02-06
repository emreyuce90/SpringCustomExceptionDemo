package com.emre.springcustomexceptions.controllers.impl;

import com.emre.springcustomexceptions.controllers.IEmployeeController;
import com.emre.springcustomexceptions.dtos.EmployeeDto;
import com.emre.springcustomexceptions.results.Response;
import com.emre.springcustomexceptions.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/employees")
public class EmployeeController implements IEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping(path = "{id}")
    @Override
    public Response<EmployeeDto> getEmployee(@PathVariable(name = "id") Long id) {
        return employeeService.getEmployeeById(id);
    }
}
