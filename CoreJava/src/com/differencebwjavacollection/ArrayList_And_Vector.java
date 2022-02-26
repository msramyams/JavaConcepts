package com.differencebwjavacollection;

//ARRAY LIST PROGRAM MAINTAINS INSERTION ORDER, FASTER THAN VECTOR BECAUSE IT IS NON-SYNCHRONIZED
import java.util.*;
public class ArrayList_And_Vector 
{
	 public static void main(String args[])
	 {    
	     
		  List<String> al=new ArrayList<String>();		//creating arraylist   
		  System.out.println("Employee details: ");
		  
		  //adding object in arraylist
		  //ArrayList increases its size by 50% of array size
		  al.add("John");    
		  al.add("Michael");    
		  al.add("Mike");    
		  al.add("Andy");   
		  
		  /*
		   * ArrayList uses the Iterator interface to traverse the elements.
		   */
		  
		  //traversing elements using Iterator  
		  Iterator itr=al.iterator(); 
		  
		  while(itr.hasNext())
		  {  
		   System.out.println(itr.next());  
		  }   
		  System.out.println();
/*
* VECTOR PROGRAM ALSO MAINTAINS INSERTION ORDER, SLOWER THAN ARRAYLIST BECAUSE IT IS SYNCHRONIZED 
*/		  
		  Vector<String> v=new Vector<String>();	//creating vector
		  
		  //method of Collection 
		 // Vector increases its size by doubling array size
		  System.out.println("Branches in company");
		  v.add("human resource"); 
		  v.addElement("financial department");		//method of Vector  
		  v.addElement("Marketing");
		  
		  /* Vector can use iterator interface or enumeration interface to traverse elements
		  *traversing elements using Enumeration
		  */  
		  Enumeration e=v.elements();  
		  while(e.hasMoreElements())
		  {  
		   System.out.println(e.nextElement());  
		  }  
	 }    
}    

