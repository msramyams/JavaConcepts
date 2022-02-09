package com.inheritanceprg;
//Hierarchical program- kitten and puppy inherited from Pet class
	class Pet
	{  
		void eat()
		{
			System.out.println("eating...");
			}  
		}  
		class Puppy extends Pet
		{  
		void bark()
		{
			System.out.println("barking...");
		}  
		}  
		class Kitten extends Pet
		{  
		void meow()
		{
			System.out.println("meowing...");
			}  
		}  
		class HierarchicalPrg
		{  
		public static void main(String args[])
		{  
		Kitten c=new Kitten();  
		c.meow();  
		c.eat();  
		 
		}
	}  


