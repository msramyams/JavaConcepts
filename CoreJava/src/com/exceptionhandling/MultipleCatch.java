package com.exceptionhandling;
//try block followed by more catch block which contains differed exception
public class MultipleCatch 
{  
	  
    public static void main(String[] args) 
    {  
          
           try
           {    
                int a[]=new int[5];    
                a[5]=30/0;    
               }    
               catch(ArithmeticException e)  //should come before catch for Exception
                  { 
            	   System.out.println(e);
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("at the time only one exception occurs and one catch block is executed");    
    }  
}  
