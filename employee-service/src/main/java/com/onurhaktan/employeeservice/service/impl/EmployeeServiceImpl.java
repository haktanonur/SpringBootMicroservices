package com.onurhaktan.employeeservice.service.impl;

import com.onurhaktan.employeeservice.dto.EmployeeDto;
import com.onurhaktan.employeeservice.entity.Employee;
import com.onurhaktan.employeeservice.repository.EmployeeRepository;
import com.onurhaktan.employeeservice.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {

        Employee employee = new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );

        Employee savedEmployee = employeeRepository.save(employee);

        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {

        Employee employee = employeeRepository.findById(employeeId).get();

        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }
}
