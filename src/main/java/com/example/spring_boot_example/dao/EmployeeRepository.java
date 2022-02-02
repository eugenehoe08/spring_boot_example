package com.example.spring_boot_example.dao;

import com.example.spring_boot_example.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
