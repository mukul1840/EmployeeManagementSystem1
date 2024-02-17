package com.Ems.EmployeeManagementSystem1.exceptions;

public class DepartmentNameAlreadyExistsException extends RuntimeException {
    public DepartmentNameAlreadyExistsException(String message) {
        super(message);
    }
}
