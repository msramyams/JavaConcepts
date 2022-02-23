package com.exceptionhandlingassignment2;

public class Program14 
{
	
		static void canVote(int age)
		{
			if(age<18)
	           
			{
	                throw new ArithmeticException("not eligible");
	            }
			
			else
			   System.out.println("you can vote!");
		}
		public static void main (String[] args)
		{
			canVote(20);
			canVote(10);
		}
	}



