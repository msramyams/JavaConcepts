package com.differencebwjavacollection;
import java.util.*;
public class Iterator_And_ListIterator 
{
	public static void main(String[] args) 
	{
		//we can traverse elements of list in forward direction, used in list, set, queue
	      List<String> al = new ArrayList<String>();
	      System.out.println("Iterating elements using Iterator: ");
	      al.add("Java");
	      al.add("Selenium");
	      al.add("Python");
	      al.add("Java Script");
	      al.add("Cloud Computing");
	      
	      Iterator i = al.iterator();
	      while (i.hasNext())
	      {
	         System.out.println(i.next());
	      }
	      System.out.println("--------------------------");
	    //we can travrse elements of list in both forward and backward direction, used in list collection only
	      ListIterator lt = al.listIterator();
	      System.out.println("Iterating the elements in forward direction using ListIterator: ");
	      while (lt.hasNext()) 
	      {
	         System.out.println(lt.next());
	      }
	      System.out.println("--------------------------------------------");
	      System.out.println("Iterating the elements in backward direction using ListIterator: ");
	      while (lt.hasPrevious())
	      {
	         System.out.println(lt.previous());
	      }
	}
}
