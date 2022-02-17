package com.multithreading;

public class ExtendingThread {

	public static void main(String[] args)
	{
		
		ThreadClass2 th=new ThreadClass2(); //created object for class ThreadClass2
		Thread thread_extend= new Thread(th);
		thread_extend.start();
	}

}
