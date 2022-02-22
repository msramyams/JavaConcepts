package com.javastring;

public class StringProgram 
{

	public static void main(String[] args)
	{
	String s="java";
	System.out.println("Java String is an object that represents sequence of characters= "+s);
	
	char[] c={'t','e','c','h','n','o','s','e','r','v','e'};
	String s1= new String(c);	//creating object String and converting characters to String
	System.out.println(c);
	
	String s2=new String("Capgemini");	//another way to create string object using new keyword
	System.out.println(s2);

	}

}
