package com.joavacollections_Iterator;
import java.util.*;
public class IteratorWithGenerics 
{

	public static void main(String[] args)
	{
		ArrayList<String> a=new ArrayList<>();	//created arraylist using generics
		System.out.println("Countries:");
		//adding elements to arraylist
		a.add("Asia");
		a.add("Germany");
		a.add("Russia");
		
		Iterator<String> it=a.iterator();
		
		while(it.hasNext())
		{
			String str= it.next();
			System.out.println(str);
		}
		
		

	}

}
