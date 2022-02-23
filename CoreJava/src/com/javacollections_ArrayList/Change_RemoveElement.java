package com.javacollections_ArrayList;
import java.util.*;
public class Change_RemoveElement
{

	public static void main(String[] args) 
	{

		List<String> alist= new ArrayList<String>();	//creating ArrayList that accepts string elements
		
		
		//change an element in arraylist
		alist.add("miles");	// adds element at the end of list
		alist.add("ruby");
		alist.add("mill");
		alist.set(0,"jim");
		alist.set(1,"jimmy"); // can change element using set method by providing index value
		System.out.println("Array list elements after changing: "+ alist);
		
		//to remove elements from arraylist
		
		alist.remove("miles"); 	// removing miles
		System.out.println("after removing miles : "+alist);
		alist.remove(1); 	// removing element at 1 index
		System.out.println("after removing from 1st index: "+alist);
	}
	
}
