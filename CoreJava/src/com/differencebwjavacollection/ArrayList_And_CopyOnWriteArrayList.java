package com.differencebwjavacollection;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;   
public class ArrayList_And_CopyOnWriteArrayList 
{
	public static void main(String[] args)
	{
	// create an array list
    CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList();
    
    System.out.println("Initial size of al: " + al.size());

    // add elements to the array list
    al.add("Java");
    al.add("C++");
    al.add("Python");
    al.add("C#");
    al.add("Javascript");
    al.add(2, "C");
    System.out.println("Size of arraylist after additions: " + al.size());

    // display the array list
    System.out.println("Contents of arraylist: " + al);
    //ArrayList iterator supports removal of element during iteration
    // Remove elements from the array list
    al.remove("Python");
    al.remove(2);
    System.out.println("Size of arraylist after deletions: " + al.size());
    System.out.println("Contents of arraylist: " + al);

    try
    {
       Iterator<String> iterator = al.iterator();
      //CopyOnWriteArrayList.remove() throws unsupported exception if elements are added  removed during iteration
       
       while(iterator.hasNext()) 
       {
          iterator.remove();
       }
    }
    catch(Exception e)
    {
       System.out.println("Method not supported:" +e);
    }
    System.out.println("Size of al: " + al.size());
	}
 
}

