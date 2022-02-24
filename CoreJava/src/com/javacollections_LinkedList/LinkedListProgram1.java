package com.javacollections_LinkedList;
//Linked list program using add(), add at specific position, creating another linked list and adding elements to linkedlist1, addAll(), addFirst(), addLast(), pop(),size()
import java.util.*;
public class LinkedListProgram1 
{

	public static void main(String[] args)
	{
	LinkedList<String> l=new LinkedList<String>();	//creating object linked list
	System.out.println();
	//to check if linked list is empty or not
	boolean b=l.isEmpty();
	System.out.println("is linked list empty: "+b);
	System.out.println("Initial stage of linked list:  "+l);
	System.out.println();
	
	//adding elements to linked list
	//l.add()
	l.add("tom");
	l.add("jerry");
	l.add("bob");
	l.add("jack");
	l.add("tim");
	l.add("nick");
	l.add("tanney");
	System.out.println("After adding elements to linked list: "+l);
	int size=l.size();
	System.out.println("The size of linked list: "+size);
	System.out.println();
	
	//to add elements at specific position
	
	System.out.println("Before adding chris at position 2: "+l+" = "+l.get(2));
	l.add(2,"Chris");
	System.out.println("After adding chris at position 2: "+l+"= "+l.get(2));
	System.out.println();
	
	//creating second linkedlist
	System.out.println("Second linked list: ");
	LinkedList<String> l2=new LinkedList<String>();
	System.out.println();
	System.out.println("is linked list empty: "+b);
	System.out.println("Initial stage of second linked list: "+l2);
	System.out.println();
	
	//adding elements to second linked list
	l2.add("shane");
	l2.add("bunny");
	System.out.println("After adding elements to second linked list: "+l2);
	System.out.println();
	
	//adding linked list2 elements to linked list1 elements
	System.out.println("Linked list elements in 1 and 2: ");
	System.out.println("Linked list1 elements: "+l+" size: "+l.size());
	System.out.println("Linked list2 elements: "+l2+ " size: "+l2.size());
	l.addAll(l2);	//adding elements from l2 to l
	System.out.println("After adding elements from linkedlist2 to linkedlist1: "+l+l.size());
	System.out.println();
	
	//adding element at first position
	System.out.println("Adding element at first position");
	l.addFirst("Nemo");
	System.out.println("after adding: "+l);
	String name=l.peek();
	System.out.println("element at top: "+name);
	l.pop();
	System.out.println("after popping: "+l);
	System.out.println();
	//adding element at Last position
	System.out.println("Adding element at Last position: ");
	System.out.println("Before adding: "+l);
	l.addLast("John");
	System.out.println("After adding: "+l);
	

	}

}
