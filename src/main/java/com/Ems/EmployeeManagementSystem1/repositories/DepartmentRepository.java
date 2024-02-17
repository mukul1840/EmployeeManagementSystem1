package com.Ems.EmployeeManagementSystem1.repositories;

import com.Ems.EmployeeManagementSystem1.entities.Department;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Primary
public interface DepartmentRepository extends BaseRepository<Department, Long> {
    Optional<Department> findByName(String dName);

}