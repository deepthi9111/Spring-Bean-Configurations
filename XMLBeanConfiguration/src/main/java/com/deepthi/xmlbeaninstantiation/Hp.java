package com.deepthi.xmlbeaninstantiation;


public class Hp implements Laptop 
{
	
	public void display() 
	{
		System.out.println("Hp Laptop");
	}
	
	public static Hp createInstance()
	{
		return new Hp();
	}

}
