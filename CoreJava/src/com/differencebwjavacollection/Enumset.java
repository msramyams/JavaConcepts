package com.differencebwjavacollection;
import java.util.*;
public class Enumset 
{
	enum days
	{  
		  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
		}  
		
		  public static void main(String[] args) 
		  {  
			  //Creating EnumSet using range
		    EnumSet<days> daysSet = EnumSet.range(days.MONDAY, days.FRIDAY);
		    System.out.println("Using for each:Iterating EnumSet:");
		    for(days days: daysSet) {
		    	System.out.println("Weekday: "+days);
		    }
		    System.out.println("--------------------");
		    //Another way of creating Enumset using of Method
		    //EnumSet<days> days= EnumSet.of(days.SATURDAY, days.SUNDAY);
		    
		   // Creating EnumSet using complementOf method , The created
		    //set will contain all elements of Enum not contained in specified set
		    
		    EnumSet<days> set= EnumSet.complementOf(daysSet);
		    System.out.println("using iterator: iterating daysSet");
		   
		    
		    // Traversing elements  
		    Iterator<days> iter = set.iterator();  
		    
		    while (iter.hasNext())  
		    {
		      System.out.println(iter.next());  
		  }  
		    System.out.println("--------------------------");
		    System.out.println("need to work: "+days.MONDAY+" to "+days.FRIDAY);
		 

		  }
}
