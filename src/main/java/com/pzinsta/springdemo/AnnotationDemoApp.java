package com.pzinsta.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationCOntext.xml");

        // get the bean from spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);
        
        // call a method on the bean
        System.out.println(coach.getDailyWorkout());
        
        // close the context
        context.close();
    }
}
