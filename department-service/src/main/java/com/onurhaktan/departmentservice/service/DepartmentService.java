package com.onurhaktan.departmentservice.service;

import com.onurhaktan.departmentservice.dto.DepartmentDto;

public interface DepartmentService {

    DepartmentDto saveDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentByCode(String code);

}
