package com.finalkeyword;
//final keyword program which is being used for class, method, variable
	final class Student1
	{
		
		final void id()
		{
			System.out.println("student id");
			
		}
	}
	//class Student2 extends Student1 // if i declare super class as final it cannot be inherited 
	//{
		//void id() // if i declare method as final it cannot override
//	{
			
//	}
	//}

	public class FinalPrg 
	{

		public static void main(String[] args)
		{
			final int a=40;
		//	a++;// cannot be changed after declaring variable as final
			Student1 s=new Student1();
			s.id();
			System.out.println(a);
			
			

		}

	}



