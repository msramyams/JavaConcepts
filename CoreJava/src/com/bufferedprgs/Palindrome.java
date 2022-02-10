//Write a program to check if the program is palindrome or not//
package com.bufferedprgs;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome 
   {

			public static void main(String [] args) throws Exception
				{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					int r, sum=0, temp;
					  System.out.println("Enter a number:");
					  int n=Integer.parseInt(br.readLine());;
					  temp=n;
					
					  while(n>0)
					   {
						r=n%10;
						sum=(sum*10)+r;
						n=n/10;
						
					   }
					if(temp==sum)
						System.out.println(sum+" palindrome");
					else
						System.out.println(sum+" not a palindrome");
				
			

			}

	}

