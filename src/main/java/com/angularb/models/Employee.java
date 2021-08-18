/*
  Created by:oumar
  Project:angular
  Name:Employee
  Date: 8/16/2021
  Time: 7:50 PM
*/
package com.angularb.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Employee implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable=false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable=false)
    private String employeeCode;
}
