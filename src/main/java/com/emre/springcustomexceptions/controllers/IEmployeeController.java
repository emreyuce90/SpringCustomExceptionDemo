package com.emre.springcustomexceptions.controllers;

import com.emre.springcustomexceptions.dtos.EmployeeDto;
import com.emre.springcustomexceptions.dtos.EmployeeUIDto;
import com.emre.springcustomexceptions.results.Response;

public interface IEmployeeController {
    Response<EmployeeDto> getEmployee(Long id);
    Response<EmployeeDto> saveEmployee(EmployeeUIDto employeeUIDto);

}
