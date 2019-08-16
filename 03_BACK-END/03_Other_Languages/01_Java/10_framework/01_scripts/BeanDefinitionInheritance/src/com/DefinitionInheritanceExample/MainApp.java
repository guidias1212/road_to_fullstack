package com.DefinitionInheritanceExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      
      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
      objA.getMessage1();
      objA.getMessage2();

      HelloBrazil objB = (HelloBrazil) context.getBean("helloBrazil");
      objB.getMessage1();
      objB.getMessage2();
      objB.getMessage3();
   }
}
