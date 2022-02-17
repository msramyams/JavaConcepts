package com.multithreading;
public class ImpRunInterface
{

	public static void main(String[] args) 
	{
		
		ThreadClass tc= new ThreadClass();	//object of ThreadClass created
		Thread thread_runnable= new Thread(tc);
		thread_runnable.start(); 	// using start function we can run the thread
	}

}
																					