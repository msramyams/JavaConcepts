package com.bufferedprgs;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Multiplication
{
	
		public static void main(String[] args) throws Exception 
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter  the number");
			int n=Integer.parseInt(br.readLine());
			for(int i=1;i<=10;i++)
			{
				System.out.println(n+" * "+i+" = "+ (n*i));
			}
			

		}

	}



