package com.example.spring_boot_example.service;

import com.example.spring_boot_example.dao.EmployeeRepository;
import com.example.spring_boot_example.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    // change qualifier to dao implementation of choice
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
//    @Transactional JpaRepository provides this functionality
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = employeeRepository.findById(theId);
        Employee employee = null;

        if (result.isPresent()) {
            employee = result.get();
        } else {
            // we did not find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return employee;

    }

    @Override
    public void save(Employee theEmployee) {
        employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);
    }
}
