package com.joavacollections_Iterator;
/*program to traverse list in both direction using .hasNext(), .next() for forward direction
 * .hasPrevious(), .previous() for backward direction
  Using ListIterator we can only traverse list*/

import java.util.*;
public class List_Iterator 
{
	public static void main(String a[])
	{
	    ListIterator<String> lite = null;
	    
	   ArrayList<String> names = new ArrayList<String>();
	    
	    names.add("John");
	    names.add("Rajat");
	    names.add("Paul");
	    names.add("Tom");
	    names.add("Kate");
	    
	    //Obtaining list iterator
	    lite=names.listIterator();
	 
	    System.out.println("Traversing the list in forward direction:");
	    	while(lite.hasNext())
	    {
	       System.out.println(lite.next());
	       
	    }
	    
	    System.out.println("\nTraversing the list in backward direction:");
	    	while(lite.hasPrevious())
	    {
	       System.out.println(lite.previous());
	    }
	}
}
