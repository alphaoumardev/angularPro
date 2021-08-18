/*
  Created by:oumar
  Project:angular
  Name:EmployeeService
  Date: 8/16/2021
  Time: 8:21 PM
*/
package com.angularb.services;

import com.angularb.exception.UserNotFoundException;
import com.angularb.models.Employee;
import com.angularb.repository.EmployeeRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
//@RequiredArgsConstructor
@Slf4j
public class EmployeeService
{
    private final EmployeeRepo employeeRepo;
    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {this.employeeRepo = employeeRepo;}


    public Employee addEmployee(Employee employee)
    {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }
    public List<Employee> findAllEmployees()
    {
        return employeeRepo.findAll();
    }
    public Employee updateEmployee(Employee employee)
    {
        return employeeRepo.save(employee);
    }

    public void deleteEmployeeById(Long id)
    {
        employeeRepo.deleteEmployeeById(id);
    }
    public Employee findEmployeeById(Long id)
    {
        return employeeRepo.findEmployeeById(id)
                .orElseThrow(()->new UserNotFoundException("The User with id "+id+"id not found in the database"));
    }
}
