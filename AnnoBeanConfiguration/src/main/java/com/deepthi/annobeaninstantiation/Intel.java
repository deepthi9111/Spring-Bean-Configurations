package com.deepthi.annobeaninstantiation;

import org.springframework.stereotype.Component;

@Component
public class Intel implements Processor 
{
	private String name;
	private int gen;
	
	
	public Intel() 
	{
		super();
	}

	public Intel(String name, int gen) 
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
		System.out.println("Intel Processor");
	}

	@Override
	public String toString() {
		return "Intel [name=" + name + ", gen=" + gen + "]";
	}
}
