package com.javacollections_ArrayList;
//creating ArrayList and adding elements to an arraylist
import java.util.*;
public class Create_AddElement_ArrayList
{

	public static void main(String[] args) 
	{
		List<String> alist= new ArrayList<String>();	//creating ArrayList that accepts string elements
		
		
		
		alist.add("ramya");	// adds element at the end of list
		alist.add("ram");
		alist.add("ramu");
		alist.add("ramyams");
		System.out.println("Array list elements: "+ alist);

		alist.add(3,"mickey");   //adds element mickey at 3rd position
		System.out.println("After adding at 3rd position: "+alist);
		
		
		
		
	}

}
