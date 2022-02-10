package com.bufferedprgs;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Vowel 
{

		public static void main(String[] args) throws Exception 
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the character: ");
			char ch=(char)br.read();
			
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'|| ch=='U')
			{
				System.out.println(ch+ " is vowel");
			}
			else
				System.out.println(ch + " is consonant");
		}

	}


