package com.exceptionhandlingassignment;
import java.util.*;

 class ExceptionDemo2
{
	static void function(int a , int b)
	{
		System.out.println(10/a);
		int[] arr= {1,2,3};
		try
		{
			
		System.out.println(arr[b]);	//throws exception if arr[b]>3 so it is handled
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("rest of code");// is going to handle ArrayIndexOutOfBoundsException  
		}
	}
}
public class Program4 
{

	public static void main(String[] args)
	{
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=in.nextInt();
		int b=in.nextInt();
		ExceptionDemo2.function(a, b);
		for(int i=0;i<3;i++)
		{
			try
			{
				ExceptionDemo2.function(in.nextInt(),in.nextInt());
			}
			catch(ArithmeticException e)
			{
				System.out.println("cant divide by zero");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Out of bounds");
			}
		}
	}

}
