package com.javacollections_Queue;
import java.util.*;
public class PriorityExample2_MainMethod 
{

	public static void main(String[] args)
	{
		Queue<Employee> e=new PriorityQueue<Employee>();
		//adding employee details
		Employee e1=new Employee(101," Stew Mark ",25000);
		Employee e2=new Employee(102," John Smith ",20000);
		Employee e3=new Employee(103," Robert Downey ",35000);
		Employee e4=new Employee(104," Chris Evans ",30000);
		Employee e5=new Employee(104," Chris Evans ",30000);
		
		
		
		//adding elements to queue
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		e.add(e5);
		
		
		//traversing queue elements
		for(Employee m:e)
		{
		System.out.println("Employee details: "+m.id+" "+m.name+" "+m.salary);
		}
		System.out.println();
		//removing 1 employee details
		
		System.out.println("After removing 1 employee: ");
		e.remove();
		for(Employee m:e)
		{
		System.out.println("Employee details: "+m.id+" "+m.name+" "+m.salary);
		}
		int contains=102;  // to check if id is present
		System.out.println(contains);
		
		
		
		
	}

}
