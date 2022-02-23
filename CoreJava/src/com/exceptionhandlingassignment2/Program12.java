package com.exceptionhandlingassignment2;

public class Program12
{
	
		public static void main (String[] args)
		{
	        try
	        {
	            System.out.println(4/0);
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);    // executes catch block  
	        }
	        finally //executes finally block
	        {
	            System.out.println("finally executed");
	        }
	        
	       	        System.out.println("end"); //executes statements after finally block
		}
	}



