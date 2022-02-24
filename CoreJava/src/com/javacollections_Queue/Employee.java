package com.javacollections_Queue;

public class Employee implements Comparable<Employee> 
{
	int id;
	String name;
	int salary;
	
	public Employee(int i, String n, int s )
	{
		id=i;
		name=n;
		salary=s;
	}
	
	//using compareTo() method
	public  int compareTo(Employee m)
	{
		if(id>m.id)
		{
		
			return 1;
		}
		else if(id<m.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
			
		
	}

}
