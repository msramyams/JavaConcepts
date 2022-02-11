//write a java program using abstract class in java
package com.abstractionprgs;
//declaring class as abstract class
abstract class Library
	{
		abstract int getNoOfBooks();  //abstract class can have abstract methods
	
		String libraryName()	//can have non abstract methods
		{
			return "Technoserve";
		}
		
	}
	//to give functionality to abstract method we use inheritance	
	class Book1 extends Library
		{
			int getNoOfBooks()
			{
				return 7;
			}
		}
	
	class Book2 extends Library
		{
			int getNoOfBooks()
			{
				return 8;
			}
		}

	public class Abstraction
	{

		public static void main(String[] args) 
		{
			Library l;	//cannot instantiate Library object so  create objects of child class
			l= new Book1();
			l.libraryName();
			System.out.println("No of  Core java books in library:"+l.getNoOfBooks());
			l=new Book2();
			System.out.println("No of webdesigning books in library: "+l.getNoOfBooks());

		}

	}


