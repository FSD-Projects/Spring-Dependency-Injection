package com.mycompany.spring_dependency_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring_dependency_injection.beans.Coach;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try {
    	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	    Coach coach = context.getBean("theCoach", Coach.class);
    	    System.out.println("Coach Details: " + coach.toString());
    	    System.out.println("Daily Workout plan: " + coach.getDailyWorkout());
    	    System.out.println("Daily Fortune: " + coach.getDailyFortune());
    	   
       } catch(Exception e) {
    	   e.printStackTrace();
       }
    }
}
