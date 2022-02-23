package com.exceptionhandlingassignment2;

public class Program13 
{
	
		public static void main (String[] args) 
		{
	        try
	        {
	            System.out.println(4/0);
	            
	        }
	        finally
	        {
	            System.out.println("cleaning......."); //executes finally block and throws arithmetic exception error
	        }
		}
	}



