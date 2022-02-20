package com.exceptionhandling;
import java.io.*;
 class Method 
{
	  void method()throws IOException
	  {  
	  throw new IOException("device error");  
	 }  
}  
	public class ThrowsProgram
	{  
	   public static void main(String args[])
	   {  
	    try
	    {  
	     Method m=new Method();  
	     m.method();  
	    }
	    catch(Exception e)
	    {
	    	System.out.println("exception handled");
	    	}     
	  
	    System.out.println("normal flow...");  
	  }  
	}  


