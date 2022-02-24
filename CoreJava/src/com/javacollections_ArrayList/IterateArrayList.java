package com.javacollections_ArrayList;
import java.util.*;
public class IterateArrayList 
{

	public static void main(String[] args)
	{
		List<String> alist= new ArrayList<String>();	//creating ArrayList that accepts string elements
		
		
		alist.add("miles");	// adds element at the end of list
		alist.add("ruby");
		alist.add("mill");
		alist.add("jim");
		
		
		//iterating ArrayList
	     for(String str:alist)  
	        System.out.println(str); 
	     
	     
	     //size of ArrayList
	     System.out.println("size of ArrayList: "+alist.size());

	}

}
