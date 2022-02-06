//Write a program for calculator by taking input from user//
import java.util.Scanner;
public class Calculator1 
{

	public static void main(String[] args)
	{
		int num1, num2,result;
		char operator;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter numbers:");
		num1= sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Enter operator: ");
		System.out.println("+,-,*,/,%");
		operator=sc.next().charAt(0);
		
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
