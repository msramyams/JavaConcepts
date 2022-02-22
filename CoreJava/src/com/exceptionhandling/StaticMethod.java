package com.exceptionhandling;
 class Student
{
	int id;
	String name;
	static String college="ewce";

 Student(int i, String n)
 {
	 id=i;
	 name=n;
 }
 static void change()	//declaring method as static
 {
	 college="technoserve";
 }
  void display()
 {
	 System.out.println("Id: "+id+" Name: "+name+" college: "+college);
 }
}
public class StaticMethod 
{

	public static void main(String[] args) 
	{
		
		Student.change();//calling changed method 
		Student s1 = new Student(11,"ramya");  
	    Student s2 = new Student(22,"ramyams");  
	    
	    
	    s1.display();  
	    s2.display();  

	}

}
