package com.bufferedprgs;
//Write a program to check prime numbers take input from user
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class PrimeNo 
{
	
	public static int checkPrime( int n) 
		{
			int m=0 , flag=0,i;
			m=n/2;
			
			 if(n==0|| n==1)
			 {
				 System.out.println(n + " is not a prime number");
			 }
			 else
			 {
				 for(i=2;i<=m; i++)
				 {
					 if(n%i==0)
					 {
						 System.out.println(n + " is not a prime number");
						 flag=1;
						 break;
					 }
				 }
				 if(flag==0)
				 {
					 System.out.println(n + " is a prime number");
				 }
			  }
			
			 return n;
		}
		public static void main(String [ ] args) throws Exception
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the number:");
			int n=Integer.parseInt(br.readLine());;
			checkPrime(n);
			
		}
			
			
		}

