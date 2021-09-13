package com.deepthi.didemo;

public class AMD implements Processor 
{
	private String name;
	private int gen;
	
	public AMD() 
	{
		super();
	}

	public AMD(String name, int gen) 
	{
		super();
		this.name = name;
		this.gen = gen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGen() {
		return gen;
	}

	public void setGen(int gen) {
		this.gen = gen;
	}

	public void show() 
	{
		System.out.println("AMD Processor");
	}

	@Override
	public String toString() {
		return "AMD [name=" + name + ", gen=" + gen + "]";
	}

	
}
