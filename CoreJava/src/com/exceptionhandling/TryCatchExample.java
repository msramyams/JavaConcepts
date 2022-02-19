package com.exceptionhandling;
//Few Exception that occur during program of unchecked (ArithmeticException, NullPointerException, NumberFormatException, ArrayOutofIndexException using try/catch
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TryCatchExample 
{

	public static void main(String[] args) throws Exception
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		try
		{
		int a=100/0;	//ArithmeticException
		}
		catch (ArithmeticException e)
		{
		System.out.println(e);
		}
		
		try
		{
		String str=null; // NullPointerException
		}
		catch(NullPointerException n)
		{
			System.out.println(n);
			
		}
		
		try
		{
		String str1="abc";
		int i=Integer.parseInt(str1); //NumberFormatException
		}
		catch(NumberFormatException f)
		{
			System.out.println(f);
		}
		
		System.out.println("try- specifies block where we should place exception");
		System.out.println("-->must be followed by catch or finally");
		System.out.println("catch- used to handle exception");
		
	}

}
