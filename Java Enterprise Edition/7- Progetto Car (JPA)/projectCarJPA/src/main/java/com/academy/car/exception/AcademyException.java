package com.academy.car.exception;

@SuppressWarnings("serial")
public class AcademyException extends Exception
{
	public AcademyException() 
	{
		super();
	}
	
	public AcademyException(String message) 
	{
		super(message);
	}
}
