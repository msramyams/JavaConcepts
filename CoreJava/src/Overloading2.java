//with different no of parameter
 class Overloading3 
{
	
	static int add(int a,int b)
	{
		return a+b;
	}
	
			static int add(int a,int b,int c)
			{
				return a+b+c;
			}  
 }  
	class Overloading2
			{
				
			public static void main(String[] args)
			{  
			System.out.println(Overloading3.add(10,10));  
			System.out.println(Overloading3.add(10,10,10));  
			}
			  
		
	}


