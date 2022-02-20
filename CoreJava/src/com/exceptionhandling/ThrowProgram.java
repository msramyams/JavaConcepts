package com.exceptionhandling;

public class ThrowProgram 
{
	  
	    //function to check if person is eligible to vote or not   
	    public static void validate(int age)
	    {  
	        if(age<18) 
	        {  
	              
	            throw new ArithmeticException("Person is not eligible to vote");   //throw Arithmetic exception if not eligible to vote  
	        }  
	        else 
	        {  
	            System.out.println("Person is eligible to vote!!");  
	        }  
	    }  
	      
	    public static void main(String args[])
	    {  
	       
	        validate(15);  
	        validate(23);
	        System.out.println("No election");    
	  }    
	}    


