package com.exceptionhandling;

public class NestedTry 
{  
    
    public static void main(String args[])  
    {  
         
        try		// outer (main) try block 
        {  
    
             try		 //inner try block 1 
            {  
    
                  try 	// inner try block 2 
                {  
                    int arr[] = { 1, 2, 3, 4 };  
                    System.out.println(arr[10]);  	 //printing the array element out of its bounds  
                }  
    
                 catch (ArithmeticException e)		// to handle ArithmeticException  
                  {  
                    System.out.println("Arithmetic exception");  
                    System.out.println(" inner try block 2");  
                  }  
            }  
    
           
            catch (ArithmeticException e)	 // to handle ArithmeticException   
             {  
                System.out.println("Arithmetic exception");  
                System.out.println("inner try block 1");  
             }  
        }  
    
        catch (ArrayIndexOutOfBoundsException e4) 	// to handle ArrayIndexOutOfBoundsException 
        {  
            System.out.print(e4);  
            System.out.println(" outer (main) try block");  
        }  
        catch (Exception e5) 
        {  
            System.out.print("Exception");  
            System.out.println(" handled in main try-block");  
        }  
    }  
}  