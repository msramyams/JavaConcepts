
import java.util.Scanner;
import java.util.*;
public class ArmstrongPrg
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

			public static void main(String[] args) 
			{
				System.out.println("Enter the number: ");
				Scanner sc=new Scanner(System.in);
				int num=sc.nextInt();
				if(isArmstrong( num))
				{
					System.out.println("armstrong");
				}
				else
					System.out.println("not a armstrong");

		}

	}



