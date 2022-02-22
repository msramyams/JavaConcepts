package com.exceptionhandling;
import java.sql.SQLException;
 class Calculator
{
	void divide(int n1, int n2) throws SQLException
	{
		if(n2==0)
		{
			throw new SQLException("can't be zero");
		}
		
		else
		{
		System.out.println("dividing "+n1+ " by "+n2);
		int res=0;
		res=n1/n2;
		System.out.println(res);
		}
	}
		
}
public class ThrowsProgram2
{

	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Calculator c1=new Calculator();
		try
		{
			c1.divide(12, 4);
		}
		catch(SQLException exp)
		{
			System.out.println("printing exception details");
			exp.printStackTrace();
		}
		System.out.println("main method ended");

	}

}
