//Write a program for addition of two numbers asking values from user
	package com.bufferedprgs;
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
public class Addition 
{
	
		public static void main(String[] args) throws Exception
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the value of a and b :");
			int a= Integer.parseInt(br.readLine());
			int b= Integer.parseInt(br.readLine());
			System.out.println("Addition of  a and b = "+(a+b));
			

		}

	}



