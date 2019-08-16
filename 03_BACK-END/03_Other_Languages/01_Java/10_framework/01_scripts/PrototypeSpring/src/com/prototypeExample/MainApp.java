package com.prototypeExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
   public static void main(String[] args) {
	   
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      
      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

      objA.setMessage("I'm object A");
      
      objA.getMessage();

      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
      
      objB.getMessage();
   }
}