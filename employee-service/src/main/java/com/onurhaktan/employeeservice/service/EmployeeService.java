package com.onurhaktan.employeeservice.service;

import com.onurhaktan.employeeservice.dto.APIResponseDto;
import com.onurhaktan.employeeservice.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);

}
