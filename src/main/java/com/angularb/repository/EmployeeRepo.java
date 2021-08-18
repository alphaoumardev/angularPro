/*
  Created by:oumar
  Project:angular
  Name:EmployeeRepo
  Date: 8/16/2021
  Time: 8:17 PM
*/
package com.angularb.repository;

import com.angularb.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long>
{
    Optional<Employee> findEmployeeById(Long id);

    void deleteEmployeeById(Long id);
}
