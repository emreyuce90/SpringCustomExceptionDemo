package com.emre.springcustomexceptions.services.impl;

import com.emre.springcustomexceptions.dtos.DepartmantDto;
import com.emre.springcustomexceptions.dtos.EmployeeDto;

import com.emre.springcustomexceptions.entities.Employee;
import com.emre.springcustomexceptions.repositories.IEmployeeRepository;
import com.emre.springcustomexceptions.results.Response;
import com.emre.springcustomexceptions.services.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private IEmployeeRepository employeeRepository;


    @Override
    public Response<EmployeeDto> getEmployeeById(Long id) {
       Optional<Employee> optional = employeeRepository.findById(id);
       if(optional.isEmpty()) {
           return new Response<EmployeeDto>().fail("The employee id " + id + " does not exist",HttpStatus.BAD_REQUEST);
       }
       Employee employee = optional.get();
       EmployeeDto employeeDto = new EmployeeDto();
       BeanUtils.copyProperties(employee, employeeDto);
       employeeDto.setDepartmentDto(new DepartmantDto(employee.getDepartmant().getId(), employee.getDepartmant().getName()));
       return new Response<EmployeeDto>().success(employeeDto);
    }
}