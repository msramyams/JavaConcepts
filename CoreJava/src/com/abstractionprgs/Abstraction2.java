package com.abstractionprgs;
//scenario in which abstract abstract class can be used

 abstract class Books	//parent class Books
{
    //can have abstract methods
    public abstract int NoOfBooks();
    public abstract String Author();
    
    public  int price()	//common property to all class
    {
    	return 150;
    	
    }
    
}

  class Java extends Books
{
    public int NoOfBooks()
    {
        return 4;
    }
    public String Author()
    {
        return "James Gosling";
    }
}
    class MySql extends Books	//hierachical inheritance
    {
        public int NoOfBooks()
        {
            return 6;
        }
        public String Author()
        {
            return "Alan Larsson";
        }
    }
public class Abstraction2
{

	public static void main(String[] args)
	{
		Books b;
		b= new MySql();
		System.out.println("No of Books: "+ b.NoOfBooks());
		System.out.println("Author of mysql: "+ b.Author());
		System.out.println("Price is "+ b.price());
		

	}

}
