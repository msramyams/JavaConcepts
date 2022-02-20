package com.exceptionhandlingassignment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//import java.io.*   =can be used instead of above

class Main
{
	public static void findFile()
	{
		try
		{
		File newFile= new File("test.txt");	//throws exception File cannot be resolved to a type so import package File
		FileInputStream stream=new FileInputStream(newFile); 	//may throw exception so import package FileNotFoundException and FileInputStream package
		}
		catch(FileNotFoundException f)
		{
			System.out.println(f);
		}
	}
}
public class Program6 
{

	public static void main(String[] args) 
	{
		Main.findFile();
		System.out.println("Print the exception");
	}

}
