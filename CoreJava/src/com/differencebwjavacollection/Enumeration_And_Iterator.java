package com.differencebwjavacollection;
//Iterator and enumeration are used traverse and access element from collection
import java.util.*;
public class Enumeration_And_Iterator
{
	
		   public static void main(String args[]) 
		   {
		      List list = new ArrayList(Arrays.asList( new String[] {"Java", "C", "C++", "Python"}));
		     
		      Vector v = new Vector(list);
		      delete(v, "C++");
		   }
		   private static void delete(Vector v, String name)
		   {
			   //enumeration has methods such as hasMoreElements(), nextElement()
			   //we can only read element during traversing element in collections
		      Enumeration e = v.elements();
		      while (e.hasMoreElements()) 
		      {
		         String s = (String) e.nextElement();
		         if (s.equals(name)) {
		            v.remove(name);
		         }
		      }
		   // Display the names
		      System.out.println("The names are using enumeration:");
		      e = v.elements();
		      while (e.hasMoreElements())
		      {
		         // Prints elements
		         System.out.println(e.nextElement());
		      }
		      
		      //Iterator can read and remove elements using hasNext(), next(), remove()
		      //we can read and remove element while traversing element */9/89]/89\8
		      Iterator i=v.iterator();
		      while(i.hasNext())
		      {
		    	  String str=(String)i.next();
		    	  if(str.equals(name))
		    	  {
		    		  i.remove();
		    	  }
		      }
		      //Display the names
		      System.out.println("The names are using iterator:");
		      i = v.iterator();
		      while (i.hasNext()) {
		         System.out.println(i.next());
		   }
		      
		     
}

}
