package com.bufferedprgs;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class LeapYear
{

		public static void main(String[] args) throws Exception
		{
			int year;
			System.out.println("Enter the year: ");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			year=Integer.parseInt(br.readLine());

			
			if((year%4==0) && (year%100!=0) || (year%400==0))
			{
				System.out.println(year +" is a leap year");
			}
			else
				System.out.println(year +" is not a leap year");
		}

	}


