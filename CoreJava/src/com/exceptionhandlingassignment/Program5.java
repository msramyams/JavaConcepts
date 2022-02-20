package com.exceptionhandlingassignment;
import java.util.*;

class WeightLimitExceeded extends Exception
{
	static void WeightLimitExceeded(int x) // should include public access modifier
	{
		
		System.out.println(Math.abs(15-x)+" kg:");
		
	}
}

public class Program5
{
	static void validWeight( int weight) throws WeightLimitExceeded	//should include throws exception
	{
		if(weight>15)
		
			throw new WeightLimitExceeded();
		
		else
		
			System.out.println("you are ready to fly");
		
	}

	public static void main(String[] args) 
	{
		Program5 obj= new Program5();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter x: ");
		System.out.println("Enter weight: ");
		int x=in.nextInt();
		int w= in.nextInt();
		WeightLimitExceeded.WeightLimitExceeded(x);
		//Program5.validWeight(w);
		for(int i=0;i<2;i++)
		{
			try
			{
				obj.validWeight(in.nextInt());
			}
			catch(WeightLimitExceeded e)
			{
				System.out.println(e);
			}
		}
	}

}
