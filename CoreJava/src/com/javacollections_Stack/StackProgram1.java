package com.javacollections_Stack;
//Stack program with various operations: push(), pop(), peek(), empty(), search(), size(), set(), add(), remove()
import java.util.*;
public class StackProgram1 
{

	public static void main(String[] args) 
	{
		Stack<String> s=new Stack<String>();	//create stack 
		
		//empty() method
		boolean b=s.empty();
		System.out.println("is stack empty: "+b); 	//to check if stack is empty or not
		System.out.println();
		
		//push() method
		s.push("mill");
		s.push("jack");
		s.push("mickey");
		s.push("brian");	//top value=3
		System.out.println("After push operation: "+s);
		System.out.println();
		b=s.empty();
		System.out.println("is stack empty: "+b); 
		System.out.println();
		
		//pop() method
		s.pop();
		System.out.println("after popping: "+s); //the element in top is removed
		System.out.println();
		//s.pop("mill"); //element in middle or bottom cannot be removed
		
		//peek() method
		String name=s.peek();
		System.out.println("top element of stack is : "+name);
		System.out.println();
		
		//search() method
		int location=s.search("jack"); //to search location of jack
		System.out.println("jack is located at: "+location);
		System.out.println();
		System.out.println("is stack empty: "+b);
		System.out.println();
		
		//to know size of stack
		int  a=s.size();
		System.out.println("the size of stack: "+a+s);
		System.out.println();
		s.set(1, "ruby");
		System.out.println("after changing: "+s); 	
		System.out.println();
		s.remove(0);
		System.out.println("after delelting: "+s);
		System.out.println();
		s.add(1,"bam");
		s.add(2,"billey");
		s.add(3,"harry");
		System.out.println("after adding element at 1: "+s);
		System.out.println();
		System.out.println("the size of stack is: "+a);

	}

}
