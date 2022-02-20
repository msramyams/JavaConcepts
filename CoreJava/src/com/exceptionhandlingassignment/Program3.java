package com.exceptionhandlingassignment;
import java.io.*;
//There is no exception at runtime so we can throw exception to check at compile time
public class Program3 
{
	static void canVote(int age)
	{
		if(age<18)
			throw new ArithmeticException(age +" you are not an adult");
			
	
		else
	
			System.out.println( age + " you can vote");	//executes rest of code
	
	}




	public static void main(String[] args)
	{
		
		canVote(20);	
		canVote(10);

	}

}
