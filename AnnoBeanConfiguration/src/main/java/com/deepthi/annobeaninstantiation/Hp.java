package com.deepthi.annobeaninstantiation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hp implements Laptop 
{
	private int ram;
	private int disk;
	
	//@Autowired property autowiring
	private Processor processor;
	
	
	public Hp() 
	{
		super();
	}

	//@Autowired constructor autowiring
	public Hp(Processor processor)
	{
		this.processor=processor;
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

	@Autowired //Setter autowiring
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
