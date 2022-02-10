//Write a program for armstrong no using BufferedReader to take input from user
package com.bufferedprgs;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Armstrong 
{

			public static boolean isArmstrong( int n)
			{
				int temp, digits=0, last=0, sum=0;
				temp=n;
				while( temp>0)
				{
					temp=temp/10;
							digits++;
				}
				temp=n;
				while(temp>0)
				{
					last=temp%10;
					sum+=(Math.pow(last, digits));
					temp=temp/10;
					
				}
				if(sum==n)
				{
					return true;
				}
				return false;
			}

			public static void main(String[] args) throws Exception
			{
				System.out.println("Enter the number: ");
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

				int num=Integer.parseInt(br.readLine());
				if(isArmstrong( num))
				{
					System.out.println("armstrong");
				}
				else
					System.out.println("not a armstrong");

		}

	}


