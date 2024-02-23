package com.ictak.springsecurityclient.service;

import com.ictak.springsecurityclient.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);

    List<Department> getDepartments();

    Department updateDepartment(Long departmentId, Department department);

    String putDepartmentById(Long departmentId);
}
