package com.onurhaktan.employeeservice.repository;

import com.onurhaktan.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
