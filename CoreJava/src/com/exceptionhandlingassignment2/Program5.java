package com.exceptionhandlingassignment2;

public class Program5 
{
	
		public static void main (String[] args) 
		{
	         try
	       {
	             System.out.println(4/0);	//arithmetic exception
		 //will not get printed
	             System.out.println("end of try!");
	        }
	catch(ArithmeticException e)
	        {
	            System.out.println("divide by 0");
	        }
	    }
	}



