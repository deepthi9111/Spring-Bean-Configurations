package com.deepthi.annobeaninstantiation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	/*
    	 * Annotation based configuration
    	 * We have to place class-level annotation called @Component to the class to which the bean needs to be instantiated
    	 * To let the spring know that we used @Component,
    	 * we have to include <component-scan> tag by providing the path in which the components need to be scanned.
    	 * If we want to inject the dependency into the class, we have to use @Autowired annotation.
    	 * For that, we have to make sure the dependency class also annotated with @Component
    	 */
    	
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        
        Laptop laptop = context.getBean("hp",Laptop.class);
        laptop.display();
        		
        		
    }
}
