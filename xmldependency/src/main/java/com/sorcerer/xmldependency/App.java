package com.sorcerer.xmldependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.beanvalidation.SpringConstraintValidatorFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	
    	/*Normal object creation*/
    	System.out.println("Normal object creation start*******************************");
		 OnlineBooking obj= new Movie(); 
		 obj.display(); 
		 OnlineBooking obj1= new Bus();
		 obj1.display(); 
		 OnlineBooking obj2= new Train(); 
		 obj2.display();
		 OnlineBooking obj3= new Flight(); 
		 obj3.display();
		 System.out.println("Normal object creation end*******************************\n");
		 
		 System.out.println("\nObject creation using xml bean tag start*******************************");
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		OnlineBooking obj4=(Train) context.getBean("train");
		obj4.display();
		System.out.println("Object creation using xml bean tag end*******************************\n");
    	
		System.out.println("\nObject creation using xml bean tag start*******************************");
		ApplicationContext context1 =new ClassPathXmlApplicationContext("beans.xml");
		OnlineBooking obj5=(Flight) context1.getBean("flight");
		obj5.display();
		System.out.println("Object creation using xml bean tag end*******************************\n");
		
		/* default @Component annotation */
		System.out.println("\nObject creation using xml and defult @Component value start*******************************");
    	ApplicationContext context2=new ClassPathXmlApplicationContext("beans.xml");
	  	OnlineBooking obj6=(Movie) context2.getBean("movie"); 
	  	obj6.display();
	  	System.out.println("Object creation using xml and default @Component value end*******************************"); 
	  	
	  	/*  @Component annotation with value*/
	  	System.out.println("\nObject creation using xml and user defined @Component value start*******************************");
	  	ApplicationContext context3=new ClassPathXmlApplicationContext("beans.xml");
    	OnlineBooking obj7=(Bus) context3.getBean("BUS"); 
    	obj7.display();
    	System.out.println("Object creation using xml and user defined @Component value end*******************************");
    }
    
    
}
