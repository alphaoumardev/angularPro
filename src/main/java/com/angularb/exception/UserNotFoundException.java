/*
  Created by:oumar
  Project:angular
  Name:UserNotFoundException
  Date: 8/17/2021
  Time: 9:24 AM
*/
package com.angularb.exception;

public class UserNotFoundException extends RuntimeException
{
    public UserNotFoundException(String message)
    {
        super(message);
    }
}
