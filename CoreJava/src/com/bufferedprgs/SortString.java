package com.bufferedprgs;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class SortString 
{

		public static void main(String[] args) throws Exception
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the string to sort: ");
			String str=br.readLine();
			char charArray[]=str.toCharArray();
			Arrays.sort(charArray);
			System.out.println("After sorting: "+new String(charArray));
			

		}

	}



