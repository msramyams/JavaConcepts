//Write a program for calculator by taking input from user//
package com.bufferedprgs;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Calculator
{
	
	
		public static void main(String[] args) throws Exception
		{
			int num1, num2,result;
			char operator;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter numbers:");
			num1= Integer.parseInt(br.readLine());
			num2=Integer.parseInt(br.readLine());
			System.out.println("Enter operator: ");
			System.out.println("+,-,*,/,%");
			operator=br.readLine().charAt(0);
			
			switch(operator)
			{
			case '+': result=num1+num2;
					break;
			case '-': result=num1-num2;
			break;
			case '*': result=num1*num2;
			break;
			case '/': result=num1/num2;
			break;
			case '%': result=num1%num2;
			break;
			default:System.out.println("Error");
			return;
					
			}
			System.out.println("The result is:");
			System.out.println(num1+" "+operator+" "+num2+" = "+result);
			

		}

	}

