package com.exceptionhandling;
//program to illustrate static variable
  class Technoserve
{
	int uid;
	String name;
	static String institute="TechnoServe";
	
	 Technoserve(int id, String name)
	{
		uid=id;
		this.name=name;
	}
	 void display()
	{
		System.out.println("uid: "+uid+", name "+name+" ,institute :"+institute);
	}
}
public class StaticVariable
{

	public static void main(String[] args) 
	{
		Technoserve t1=new Technoserve(1111,"ramya");
		Technoserve t2=new Technoserve(10987,"ramyams");
		t1.display();
		t2.display();

	}

}
