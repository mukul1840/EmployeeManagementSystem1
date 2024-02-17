package com.Ems.EmployeeManagementSystem1.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dId;

    @Column(unique = true)
    private String name;
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Employee> employees;

    @Column(nullable = false)
    private boolean activeStatus;

    public Department() {

    }

    public Department(Long dId, String name, boolean activeStatus) {
        this.dId = dId;
        this.name = name;
        this.activeStatus = activeStatus;
    }

    public void setActiveStatus(boolean status) {
        this.activeStatus = status;
    }

    public List<Employee> getEmployees() {
        return employees;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;}
}
