package com.abstractionprgs;
//Assignment program to create interface without using abstract keyword and implement in class 
interface A
{
	void m1();	//adds public and abstract keyword before void method
}
interface B
{
	void m2();
	
}
interface C
{
	void m3();
}


class Printable implements  A,B,C	//can implement interface method using implement keyword
{
	public void m1()
	{
		System.out.println("m1- interface in java is blueprint of class");
	}
	
	public void m2()
	{
		System.out.println("m2- Interface is a mechanism to achieve abstraction");
	}
	
	public void m3()
	{
		System.out.println("m3-Interface can support functionality of multiple inheritance");
	}
}
public class Interface {

	public static void main(String[] args)
	{
		Printable p=new Printable();	//created object of child class
		p.m1();
		p.m2();
		p.m3();

	}

}
