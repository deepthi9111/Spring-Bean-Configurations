package com.deepthi.didemo;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        
        Laptop laptop1 = context.getBean("laptop1",Laptop.class);
        laptop1.display();
        
        Laptop laptop2 = context.getBean("laptop2",Laptop.class);
        laptop2.display();
        
        Laptop laptop3 = context.getBean("laptop3",Laptop.class);
        laptop3.display();
        
        Laptop laptop4 = context.getBean("laptop4",Laptop.class);
        laptop4.display();
    }
}
