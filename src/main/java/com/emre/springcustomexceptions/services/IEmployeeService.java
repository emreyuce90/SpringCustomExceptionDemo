package com.emre.springcustomexceptions.services;

import com.emre.springcustomexceptions.dtos.EmployeeDto;
import com.emre.springcustomexceptions.results.Response;

public interface IEmployeeService {
    Response<EmployeeDto> getEmployeeById(Long id);
}
