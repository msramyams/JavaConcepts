package com.exceptionhandlingassignment2;

public class Program7
{
	
		public static void main (String[] args)
		{
	        try
	        {
	            System.out.println(4/0);
	           }
	      
	        //superclass of ArithmeticException 
	        catch(Exception e)	//we can use Exception instead of ArithmeticException
	        {
	            System.out.println("divide by 0");
	        }
	     }
	}



