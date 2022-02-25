package com.joavacollections_Iterator;
//iterated array list without using generics
import java.util.*;
public class IteratorWithoutGenerics
{

	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add("John Smith");
		a.add("Tom Cruise");
		a.add("Jenifer Lawrence");
		
	 	//adding integer value to string arraylist
		//a.add(new Integer(5));	//gives exception because we didnt use generics
		Iterator it=a.iterator();	//instantiation and using iterator constructor
		
		
		while(it.hasNext())
		{
			String str=(String)it.next();
			System.out.println(str);
		}

	}

}
