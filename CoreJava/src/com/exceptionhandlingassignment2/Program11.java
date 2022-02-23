package com.exceptionhandlingassignment2;

public class Program11 
{
	
		public static void main (String[] args)
		{
	        try
	        {
	               System.out.println(4/0);	//going to check Arithmetic exception, it will not go inside another try block
	               try
	               {
	                    int[] a={1,2,3};
	                    System.out.println(a[3]);
	                }
	   catch(ArrayIndexOutOfBoundsException e)
	                {
	                    System.out.println("Out of bounds");
	                }
	        }
	       catch(ArithmeticException e)
	        {
	            System.out.println("ArithmeticException : divide by 0");
	        }
		}
	    }



