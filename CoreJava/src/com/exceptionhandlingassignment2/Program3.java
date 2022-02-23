package com.exceptionhandlingassignment2;

public class Program3 
{
	
		public static void main (String[] args)
		{
			int a=10;
			for(int i=3;i>=0;i--)
			   try
			{
			     System.out.println(a/i);  
			}
			//catch block is missing
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		}
	}


