//Inheritance used for overriding polymorphism
 class Over 
	{
	int a=5, b=10, c;
	    
		  void sum()
		  {
			  System.out.println(c=(a+b));
		  }  
	}  
		//Creating a child class  
		class OverridingPrg extends Over  //inheritance
		{  

			  void sum()
			  {
				  System.out.println(c=(a+b));
			  } 
		    
		  
		  public static void main(String args[])
		  {  
		  OverridingPrg obj = new OverridingPrg();//creating object  
		  obj.sum();//calling method  
		  }  
}  


