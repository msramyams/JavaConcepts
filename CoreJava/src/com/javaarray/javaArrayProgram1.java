package com.javaarray;
//Java Program to illustrate how to declare, instantiate, initialize  
public class javaArrayProgram1 
{

	public static void main(String args[])
	{  
	int a[]=new int[6];	//declaration and instantiation  
	int b[]= {40,55,100};	//declaration,instantiaton, initialization
	
	
	a[0]=10;	//initialization  
	a[1]=20;  
	a[2]=90;  
	a[3]=40;  
	a[4]=50;
	a[5]=60;
	
	for(int i=0;i<a.length;i++)	//length is the property of array  
	{
	System.out.println(a[i]);
	}
	
	}
	
	}  


