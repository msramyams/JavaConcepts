package com.privateprg;

class Privateprg
{
	private int a=20;
	//private sample()
	{
		System.out.println("cannot be accessed outside class");
		System.out.println("cannot be accessed within package");
	}
}
public class Private 
{
	Privateprg p=new Privateprg();
	//p.sample();// will get compile time error
	//p.a(); //will get compile time error
}
