//Write a program to check if the program is palindrome or not//
import java.util.Scanner;
public class Palindrome 
	{
	
		public static void main(String [] args)
			{
			  Scanner scan=new Scanner(System.in);
				int r, sum=0, temp;
				  System.out.println("Enter a number:");
				  int n=scan.nextInt();
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
