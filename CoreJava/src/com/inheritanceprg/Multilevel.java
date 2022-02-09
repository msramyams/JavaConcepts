package com.inheritanceprg;
//Multilevel - Student1 inheriting from Student and Student2 inheriting from Student1
	 class Student
	{  
		
		void eat()
		{
			System.out.println("eating.");
		}  
	}  
	class Student1 extends Student
		{
			
		void study()
		{
			System.out.println("studying.");
		}  
	}  
		class Student2 extends Student1
		{  
		void sleep()
		{
			System.out.println("sleeping.");
			}  
		}  
	public	class Multilevel
		{  
		public static void main(String args[])
		{  
		Student2 s=new Student2();  
		s.sleep();  
		s.study();  
		s.eat();  
		}
	}  


