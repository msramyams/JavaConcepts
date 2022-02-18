package com.threadprgs;

class M
{
	void m1()
	{
		System.out.println("class M");
	}
}
class N extends M
{
	void m2()
	{
		System.out.println("class N");
	}
}
class O extends N
{
	void m3()
	{
		System.out.println("class O");
	}
}
public class PrgWithoutThread
{

	public static void main(String[] args)
	{
		O o=new O();
		o.m1();
		o.m2();
		o.m3();

	}

}
