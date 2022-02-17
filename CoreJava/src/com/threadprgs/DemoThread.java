package com.threadprgs;
//program of working of priority methods and thread's two ways and getting id 
class A extends Thread
{
	public void run()
	{
		System.out.println("Id of current Thread A:"+Thread.currentThread().getPriority());
	}
}
class B extends Thread
{
	public void run()
	{
		System.out.println("Id of current Thread B:"+Thread.currentThread().getPriority());
	}
}
class C extends Thread
{
	public void run()
	{
		System.out.println("Id of current Thread C:"+Thread.currentThread().getPriority());
	}
}
class D implements Runnable
{
	public void run()
	{
		System.out.println("ID of current Thread D: "+Thread.currentThread().getPriority());
	}
}
public class DemoThread {

	public static void main(String[] args)
	{
		A a=new A();
		a.setPriority(Thread.MIN_PRIORITY);// min value=1
		a.start();
		B b=new B();
		b.setPriority(Thread.NORM_PRIORITY); // normal value=5
		b.start();
		C c=new C();
		c.start();
		c.setPriority(Thread.MAX_PRIORITY); // max value=10
		D d=new D();
		Thread t= new Thread(d);
		t.setPriority(8);
		t.start();
		for(int i=0;i<3;i++)
		{
			System.out.println("Id of main thread: "+Thread.currentThread().getId());
		}

	}

}
