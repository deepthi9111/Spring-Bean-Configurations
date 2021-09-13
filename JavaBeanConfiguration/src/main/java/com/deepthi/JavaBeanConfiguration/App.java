package com.deepthi.JavaBeanConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
		/* 
		 * Java Annotation Based Configuration 
		 * Here, we don't need the xml configuration
		 * It can be done by using AnnotationConfigApplicationContext
		 * We have to create a configuration class in which we'll specify the configuration metadata.
		 * To make the class as Configuration class,
		 * we have to use class-level annotation called @Configuration
		 * To let the spring know that a particular method is returning the bean, we have to include @Bean annotation.
		 * If the container has 2 beans of same type, NoUniqueBeanDefinitionException will be raised.
		 * To avoid this conflict, we have 2 ways.
		 * 1.@Qualifier - We have to mention qualifier name to the bean class.
		 * While autowiring, we have to use same qualifier name which bean we want to get.
		 * 2.@Primary - if we use this annotation, when we have multiple beans of the same type,
		 * the bean with this annotation will be returned.
		 * Rest of all the beans of the same type will be ignored.
		 */
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        
        Laptop laptop = context.getBean(Laptop.class);
        laptop.display();
    }
}
