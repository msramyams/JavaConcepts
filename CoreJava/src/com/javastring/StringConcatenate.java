package com.javastring;

public class StringConcatenate
{

	public static void main(String[] args)
	{
		String s="ramya "+" full stack java developer";	//we use +operator to concatenate
		System.out.println(s);
		
		String s1=20+30+" addition "+30+40;	//can also add no's but after string literal it treats all as concatenation
		System.out.println(s1);
		
		//by using concat() method
		
		String s2="hello";
		String s3="world";
		String s4=s2.concat(s3);
		System.out.println("by concat() method "+s4);
	}

}
