package com.exceptionhandlingassignment2;

import java.util.*;
public class Program1 
{

	public static void main(String[] args)
	{
			try
			{
		        System.out.println(5/0);	//arithmetic exception
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
		        
			}
			System.out.println("End of program!");
	}
}


	


