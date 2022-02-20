package com.exceptionhandlingassignment;
import java.util.*;
public class Program1 
{

	public static void main(String[] args)
	{
		try
		{
		System.out.println(5/0);	//throws ArithmeticException
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		System.out.println("end of program");
		}

	}

}
