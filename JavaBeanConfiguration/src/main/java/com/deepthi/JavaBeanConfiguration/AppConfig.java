package com.deepthi.JavaBeanConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.deepthi")
public class AppConfig 
{
	@Bean
	@Primary
	public Laptop getHp()
	{
		System.out.println("In first  method");
		return new Hp();
	}
	
	
	@Bean 
	public Laptop getHp2() 
	{ 
		return new Hp();
	}
	 

}
