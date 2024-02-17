package com.Ems.EmployeeManagementSystem1.services;

import java.util.List;

public interface DepartmentService<Department> {

    List<Department> getAllDepartments();

    Department createDepartment(Department department);

    void deleteDepartment(Long id);
}
