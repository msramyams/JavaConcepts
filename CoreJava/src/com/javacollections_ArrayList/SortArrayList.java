package com.javacollections_ArrayList;
import java.util.*;
public class SortArrayList 
{

	public static void main(String[] args) 
	{
		ArrayList<String> alist= new ArrayList<String>();	//creating ArrayList that accepts string elements
		
		
		alist.add("miles");	// adds element at the end of list
		alist.add("ruby");
		alist.add("hill");
		alist.add("jim");
		
		Collections.sort(alist);
		
		for(String str:alist)
			System.out.println(str);

	}

}
