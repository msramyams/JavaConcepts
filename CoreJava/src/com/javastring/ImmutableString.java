package com.javastring;
//immutable string are unchangeable 
public class ImmutableString 
{

	public static void main(String[] args) 
	{
		String s=new String("ram");	//
		s.concat("ya");				//-->does not concatenate but 2 objects hava been created, s is still referring to ram so to refer to ya we use...
		System.out.println(s);		//
	
	
		String s1=new String("ram");
		s1=s.concat("ya");			// now it is pointing to concatenated string
		System.out.println(s1);
	}
}
