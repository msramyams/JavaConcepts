package com.threadprgs;
class A1 extends Thread
{
	public void run()
	{
		System.out.println("Id of A1: "+ Thread.currentThread().getPriority());
		System.out.println("Name of A1: "+ Thread.currentThread().getName());
	}
}
class B1 extends Thread
{
	public void run()
	{
		System.out.println("Id of B1: "+ Thread.currentThread().getPriority());
	}
}
class C1 extends Thread
{
	public void run()
	{
		System.out.println("Id of C1: "+ Thread.currentThread().getPriority());
	}
}
class D1 extends Thread
{
	public void run()
	{
		System.out.println("Id of D1: "+ Thread.currentThread().getPriority());
	}
}
public class PriorityConcept 
{

	public static void main(String[] args)
	{
		 A1 a= new A1();
		 a.setPriority(Thread.MIN_PRIORITY);
		 a.start();
		 
		 a.setName("Java");
		 
		 B1 b=new B1();
		 b.setPriority(Thread.NORM_PRIORITY);
		 b.start();
		 
		 C1 c=new C1();
		 c.setPriority(Thread.MAX_PRIORITY);
		 c.start();
		 
		 D1 d=new D1();
		 d.setPriority(8);	//can set priority between 1-10
		 d.start();
		

	}

}
