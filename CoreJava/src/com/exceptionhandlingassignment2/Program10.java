package com.exceptionhandlingassignment2;
//nested try/catch block
public class Program10 
{
	
		public static void main (String[] args)
		{
	        try
	        {
	                try
	                {
	                    int[] a={1,2,3};
	                    System.out.println(a[3]);
	                }
	              catch(ArrayIndexOutOfBoundsException e)
	                {
	                    System.out.println(e+" ArrayIndexOutOfBounds : Out of bounds");//inner try block is executed first and Outer try catch
	                }
	             System.out.println(4/0);
	        }
	       catch(ArithmeticException e)
	        {
	            System.out.println(e+ " ArithmeticException : divide by 0");
	        }
	}
		}



