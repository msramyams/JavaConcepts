package com.exceptionhandlingassignment2;

public class Program8 
{
	
		public static void main (String[] args)
		{
	        try
	        {
	            System.out.println(4/0);
	        }
	        //catch(Exception e)
	        catch(ArithmeticException e) //catch for ArithmeticException should come before Exception 
	        {
	            System.out.println("ArithmeticException : divide by 0");
	        }
	        //catch(ArithmeticException e)
	        catch(Exception e)
	        {
	            System.out.println("Exception :divide by 0");
	        }
		}
	}



