package com.abstractionprgs;
//all methods must be implemented
interface Books1
{
	  int NoOfBooks();
	   String Types();
}
//if we want to expand interface we can create new one
interface Location extends Books1	// interface extends interface
{
	 public abstract String location();
}
// to solve multiple inheritance 
//we can inherit child class from two interfaces
class  Library1 implements Books1, Location	//class implements interfaces
{
	public int NoOfBooks()
	{
		return 20;
	}
	
	public String Types()
	{
		return "Science, Maths, Hindi, Kannada";
	}
	
	public String location()
	{
		return "JC Nagar, RT Nagar";
	}
}
public class Interface2
{

	public static void main(String[] args)
	{
		Library1 l;
		l = new Library1();
		System.out.println("No of books:" +l.NoOfBooks());
		System.out.println("Types:" +l.Types());
		System.out.println("location:" +l.location());
		

	}

}
