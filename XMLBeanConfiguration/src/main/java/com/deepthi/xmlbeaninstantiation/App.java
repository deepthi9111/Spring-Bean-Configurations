package com.deepthi.xmlbeaninstantiation;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
    	//IoC Container-Spring Core
        //Laptop lap=new Hp(); 
    	//this will leads to tight coupling 
    	//as we are instantiating the object manually using new()
    	//To achieve loose coupling we'll use IoC Containers
    	//IoC Container is responsible for instantiating, configuring and managing the beans
    	//by reading configuration data-3 ways
    	//XML configuration, Annotation based configuration and java based configuration
    	//We have 2 types of containers
    	//BeanFactory and ApplicationContext
    	//ApplicationContext is the superset of BeanFactory 
    	//We have to use ApplicationContext for enterprise applications
    	
    	//Following are the ways to create BeanFactory
    	//Both are used in case of XML Based configuration
    	/*Resource res1=new FileSystemResource("beans.xml");
    	XmlBeanFactory factory1=new XmlBeanFactory(res1);
    	
    	//or
    	ClassPathResource res2=new ClassPathResource("beans.xml");
    	XmlBeanFactory factory2=new XmlBeanFactory(res2);*/
    	
    	//Following are the ways to create ApplicationContext
    	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	
    	//Bean creation via constructor
    	Hp laptop = context.getBean("laptop",Hp.class);
    	System.out.println("Bean created via constructor");
    	laptop.display();
    	
    	System.out.println("------------------------------------------------");
    	
    	//Bean creation via static factory method
    	//In XML configuration, we have to pass the class name which consists of static factory method
    	//The method can return same class object or another class object
    	Hp bean = context.getBean("myFactoryBean", Hp.class);
    	System.out.println("Bean created via static factory method");
    	bean.display();
    	
    	System.out.println("------------------------------------------------");
    	
    	//Bean creation via instance factory method
    	//We have to create a factory class which consists of non-static factory method
    	//We need to instantiate the factory class
    	//to create the required bean, factory class object needs to be passed to factory-bean property
    	//non-static factory method needs to be passed to factory-method property
    	Hp bean2 = context.getBean("myLaptop",Hp.class);
    	System.out.println("Bean created via Instance Factory method");
    	bean2.display();
    	
    	System.out.println("-----------------------------------------------");
    	
    	
    }
}
