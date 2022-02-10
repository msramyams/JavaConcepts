package com.bufferedprgs;

abstract class Student
{
	public abstract void eat(); // can have abstract methods
	public void study()
	{
		System.out.println("Student is studying");
	}
	
}
//not possible to create object so we use inheritance to access
class Student1 extends Student
{
	public void eat()
	{
		System.out.println("Student1 is eating");
	}
}
public class Abstraction 
{

	public static void main(String[] args) 
	{
		Student1 s1=new Student1();
		s1.study();
		s1.eat();

	}

}
