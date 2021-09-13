package com.deepthi.didemo;

public class Hp implements Laptop 
{
	private int ram;
	private int disk;
	private Processor processor;
	
	
	public Hp() 
	{
		super();
	}


	public Hp(int ram, int disk, Processor processor) 
	{
		super();
		this.ram = ram;
		this.disk = disk;
		this.processor = processor;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getDisk() {
		return disk;
	}

	public void setDisk(int disk) {
		this.disk = disk;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public void display() 
	{
		System.out.println("Hp [ram=" + ram + ", disk=" + disk + ", processor=" + processor + "]");
	}


	@Override
	public String toString() {
		return "Hp [ram=" + ram + ", disk=" + disk + ", processor=" + processor + "]";
	}

}
