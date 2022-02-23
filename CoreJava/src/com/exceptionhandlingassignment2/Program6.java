package com.exceptionhandlingassignment2;

public class Program6
{
	
		public static void main (String[] args)
		{
	        try{
	            System.out.println(4/0);
	           }
	      
	        //ArithmeticException 
	        catch(ArithmeticException e)
	        {
	            System.out.println("divide by 0");
	        }
	    }
	}



