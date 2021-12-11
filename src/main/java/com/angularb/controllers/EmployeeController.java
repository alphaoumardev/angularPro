/*
  Created by:oumar
  Project:angular
  Name:UserController
  Date: 8/17/2021
  Time: 9:30 AM
*/
package com.angularb.controllers;

import com.angularb.models.Employee;
import com.angularb.services.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/employee")
public class EmployeeController
{
    private final EmployeeService employeeService;

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> findAllEmployees()
    {
        List<Employee> employee=employeeService.findAllEmployees();
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> findEmployeesById(@PathVariable("id")Long id)
    {
        Employee employee=employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployees(@RequestBody Employee employee)
    {
        Employee addEmployee=employeeService.addEmployee(employee);
        return new ResponseEntity<>(addEmployee,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployees(@RequestBody Employee employee)
    {
        Employee addEmployee=employeeService.updateEmployee(employee);
        return new ResponseEntity<>(addEmployee,HttpStatus.OK);
    }

    @DeleteMapping(path="/delete/{id}")
    public ResponseEntity<?> deleteEmployees(@PathVariable("id")Long id)
    {
        employeeService.deleteEmployeeById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
