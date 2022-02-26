package com.differencebwjavacollection;
import java.util.*;

public class EnumMapPrg
{
	 // create an enum  
	   public enum Days 
	   {  
	   Monday, Tuesday, Wednesday, Thursday, Friday, Saturday 
	   };  
	   public static void main(String[] args)
	   {  
	   //create and populate enum map  
	   Map<Days, String> map = new EnumMap<Days, String>
	   (Days.class);  
	   map.put(Days.Monday, "1");  
	   map.put(Days.Tuesday, "2");  
	   map.put(Days.Wednesday, "3");  
	   map.put(Days.Thursday, "4");  
	   map.put(Days.Friday,"5");
	   map.put(Days.Saturday,"6");
	   
	   
	   // print the map  
	   for(Map.Entry m:map.entrySet())
	   {    
	       System.out.println(m.getKey()+" "+m.getValue());  
	      
	       
	      }
	   System.out.println("size of enum:"+map.size());
	   System.out.println("after removing:"+map.remove(3));
	   }  
}  


