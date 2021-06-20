package com.sorcerer.annotationdependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





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
		/*
		 * OnlineBooking obj= new Movie(); obj.display();
		 */
		/*
		 * OnlineBooking obj1= new Bus(); obj1.display();
		 */ 
		 OnlineBooking obj2= new Train(); 
		 obj2.display();
			/*
			 * OnlineBooking obj3= new Flight(); obj3.display();
			 */
		 System.out.println("Normal object creation end*******************************\n");
		 
		 
		 System.out.println("\nObject creation using  @Bean annotation from Appconfig start*******************************");
		 ApplicationContext factory= new AnnotationConfigApplicationContext(Appconfig.class);
		 OnlineBooking obj4= factory.getBean(Train.class);
		 obj4.display();
		 System.out.println("Object creation using @Bean annotation from Appconfig end*******************************\n");
		 
		 System.out.println("\nObject creation using @Bean annotation from Appconfig start*******************************");
			ApplicationContext factory1 =new AnnotationConfigApplicationContext(Appconfig.class);
			OnlineBooking obj5= factory1.getBean(Flight.class);
			obj5.display();
		System.out.println("Object creation using @Bean annotation from Appconfig end*******************************\n");
		
		System.out.println("\nObject creation using @ComponentScan annotation from Appconfig start*******************************");
		ApplicationContext factory2 =new AnnotationConfigApplicationContext(Appconfig.class);
		OnlineBooking obj6= factory2.getBean(Bus.class);
		obj6.display();
		System.out.println("Object creation using @ComponentScan annotation from Appconfig end*******************************\n");
		
		System.out.println("\nObject creation using @ComponentScan annotation from Appconfig start*******************************");
		ApplicationContext factory3 =new AnnotationConfigApplicationContext(Appconfig.class);
		OnlineBooking obj7= factory3.getBean(Movie.class);
		obj7.display();
		System.out.println("Object creation using @ComponentScan annotation from Appconfig end*******************************\n");
			
    }
}
