package com.Ems.EmployeeManagementSystem1.repositories;

import com.Ems.EmployeeManagementSystem1.entities.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeRepository extends BaseRepository<Employee, Long> {

    List<Employee> findByActiveStatusTrue();
    boolean existsByDepartment_dId(Long departmentId);

}