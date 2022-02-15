package com.example.employeesystem.exception;

public class ResourceNotFoundException extends RuntimeException 
{
	public ResourceNotFoundException(String mssg)
	{
		super(mssg);
	}
}
