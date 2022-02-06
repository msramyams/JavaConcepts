import java.util.Scanner;

//Write a program to check prime numbers take input from user
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
	public static void main(String [ ] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		checkPrime(n);
		
	}
		
		
	}


