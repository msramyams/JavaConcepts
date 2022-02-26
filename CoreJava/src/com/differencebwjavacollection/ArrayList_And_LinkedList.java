package com.differencebwjavacollection;
//ARRAYLIST AND LINKEDLIST BOTH IMPLEMENTS LIST AND BOTH ARE NON-SYNCHRONIZED, AND BETTER FOR STORING AND ACCESSING DATA
import java.util.*;
public class ArrayList_And_LinkedList
{
	
	public static void main(String args[])
	{    
		//ArrayList internally uses dynamic array to store elements
		//ArrayList act as list only because it implements list only
	     
		  List<String> al=new ArrayList<String>();	//creating arraylist 
		  System.out.println("Names: ");
		  al.add("John-Smith");	//adding object in arraylist    
		  al.add("bill");    
		  al.add("mary");    
		  al.add("fill"); 
		  System.out.println("arraylist: "+al);
		  
		  //If any element is removed from array all bits are shifted in memory
		  System.out.println("size: "+al.size());
		  al.remove(0);
		  System.out.println("arraylist: "+al);
		  System.out.println("size: "+al.size());
		  
		  System.out.println();
		  
//LINKEDLIST IS FASTER THAN ARRAYLIST AND BETTER FOR MANIPULATING DATA
		  
		//LinkedList internally uses doubly linked list to strore elements
		//LinkedList act as list and queue , because it implements list and dequeue interfaces
		  List<String> ll=new LinkedList<String>();	//creating linkedlist 
		  System.out.println("Names: ");
		  
		 
		 // LinkedList uses doubly linked list ,so no shifting of bits is required in memory
		  
		  ll.add("Jack");	//adding object in linkedlist    
		  ll.add("Serena");    
		  ll.add("lisa");    
		  ll.add("Robert"); 
		  System.out.println("linkedlist: "+ll); 
		  
		  System.out.println("size: "+ll.size());
		  ll.remove(0);
		  System.out.println("linkedlist: "+ll);
		  System.out.println("size: "+ll.size());
		  System.out.println();
		     
		 }    
}
