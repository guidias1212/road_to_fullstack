# 3.3.1.10) Spring

Spring framework is an open source Java platform that provides comprehensive infrastructure support for developing robust Java applications very easily and very rapidly.

<details open>
<summary>Table of Contents</summary>
<br>

[Overview](#h1)

[Architecture](#h2)

[Hello World Example](#h3)

[IoC Containers](#h4)

[Bean definition](#h5)

[Bean scopes](#h6)

[Bean life cycle](#h7)

[USEFUL LINKS](#hx)

</details>

<a name="h1"/>

**Overview:**

Spring is the most popular application development framework for enterprise Java. Millions of developers around the world use Spring Framework to create high performing, easily testable, and reusable code.

<a name="h2"/>

**Architecture:**

The Spring Framework provides about 20 modules which can be used based on an application requirement:

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/spring.png)

<a name="h3"/>

**Hello World Example:**

See the **USEFUL LINKS** section to setup the Spring framework and once its done, let us proceed to write a simple Spring Application, which will print "Hello World!" or any other message based on the configuration done in Spring Beans Configuration file.

* Create a Java Project on Eclipse - Just create a simple Java project on Eclipse.

* Add required libraries - Add all JARs from Spring folder and Apache commons logging.

* Create a new package inside the Java project called com.myspring (To add all the source files).

* Create HelloWorld.java and a MainApp.java files as:

HelloWorld.java
```
package com.myspring;

public class HelloWorld {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
}
```

MainApp.java
```
package com.myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
   }
}
```

Following two important points are to be noted about the main program:

The first step is to create an application context where we used framework API ClassPathXmlApplicationContext(). This API loads beans configuration file and eventually based on the provided API, it takes care of creating and initializing all the objects, i.e. beans mentioned in the configuration file.

The second step is used to get the required bean using getBean() method of the created context. This method uses bean ID to return a generic object, which finally can be casted to the actual object. Once you have an object, you can use this object to call any class method.

* Create Bean configuration file - We need to create a Bean Configuration file which is an XML file and acts as a cement that glues the beans, i.e. the classes together. This file needs to be created under the src directory:

Usually developers name this file as Beans.xml, but you are independent to choose any name you like. You have to make sure that this file is available in CLASSPATH and use the same name in the main application while creating an application context as shown in MainApp.java file.

The Beans.xml is used to assign unique IDs to different beans and to control the creation of objects with different values without impacting any of the Spring source files. For example, using the following file you can pass any value for "message" variable and you can print different values of message without impacting HelloWorld.java and MainApp.java files.

Beans.xml
```
<?xml version = "1.0" encoding = "UTF-8"?>

<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

   <bean id = "helloWorld" class = "com.tutorialspoint.HelloWorld">
      <property name = "message" value = "Hello World!"/>
   </bean>

</beans>
```

When Spring application gets loaded into the memory, Framework makes use of the above configuration file to create all the beans defined and assigns them a unique ID as defined in <bean> tag. You can use <property> tag to pass the values of different variables used at the time of object creation.

* Running the program - Once you are done with creating the source and beans configuration files, you are ready for this step, which is compiling and running your program. To do this, keep MainApp.Java file tab active and use either Run option available in the Eclipse IDE or use Ctrl + F11 to compile and run your MainApp application. If everything is fine with your application, this will print the following message in Eclipse IDE's console:

```
Your Message : Hello World!
```

<a name="h4"/>

**IoC Containers:**

The Spring container is at the core of the Spring Framework. The container will create the objects, wire them together, configure them, and manage their complete life cycle from creation till destruction. The Spring container uses DI to manage the components that make up an application. These objects are called Spring Beans.

The container gets its instructions on what objects to instantiate, configure, and assemble by reading the configuration metadata provided. The configuration metadata can be represented either by XML, Java annotations, or Java code. The Spring IoC container makes use of Java POJO classes and configuration metadata to produce a fully configured and executable system or application.

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/spring_container.png)

* Spring BeanFactory Container - This is the simplest container providing the basic support for DI and is defined by the org.springframework.beans.factory.BeanFactory interface. The BeanFactory and related interfaces, such as BeanFactoryAware, InitializingBean, DisposableBean, are still present in Spring for the purpose of backward compatibility with a large number of third-party frameworks that integrate with Spring.

* Spring ApplicationContext Container - This container adds more enterprise-specific functionality such as the ability to resolve textual messages from a properties file and the ability to publish application events to interested event listeners. This container is defined by the org.springframework.context.ApplicationContext interface.

The ApplicationContext container includes all functionality of the BeanFactorycontainer, so it is generally recommended over BeanFactory. BeanFactory can still be used for lightweight applications like mobile devices or applet-based applications where data volume and speed is significant.

<a name="h5"/>

**Bean definition:**

The objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. These beans are created with the configuration metadata that you supply to the container. For example, in the form of XML <bean/>.

Bean definition contains the information called configuration metadata, which is needed for the container to know the following:

* How to create a bean

* Bean's lifecycle details

* Bean's dependencies

All the above configuration metadata translates into a set of the following properties that make up each bean definition:

* class - This attribute is mandatory and specifies the bean class to be used to create the bean.

* name - This attribute specifies the bean identifier uniquely. In XMLbased configuration metadata, you use the id and/or name attributes to specify the bean identifier(s).

* scope - This attribute specifies the scope of the objects created from a particular bean definition.

* constructor-arg - This is used to inject the dependencies.

* properties - This is used to inject the dependencies.

* autowiring mode - This is used to inject the dependencies.

* lazy-initialization mode - A lazy-initialized bean tells the IoC container to create a bean instance when it is first requested, rather than at the startup.

* initialization method - A callback to be called just after all necessary properties on the bean have been set by the container.

* destruction method - A callback to be used when the container containing the bean is destroyed.

<a name="h6"/>

**Bean scopes:**

When defining a <bean> you have the option of declaring a scope for that bean. For example, to force Spring to produce a new bean instance each time one is needed, you should declare the bean's scope attribute to be prototype. Similarly, if you want Spring to return the same bean instance each time one is needed, you should declare the bean's scope attribute to be singleton.

The Spring Framework supports the following five scopes, three of which are available only if you use a web-aware ApplicationContext:

* singleton: This scopes the bean definition to a single instance per Spring IoC container (default).

* prototype: This scopes a single bean definition to have any number of object instances.

* request: This scopes a bean definition to an HTTP request. Only valid in the context of a web-aware Spring ApplicationContext.

* session: This scopes a bean definition to an HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.

* global-session: This scopes a bean definition to a global HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.

**The singleton scope**

If a scope is set to singleton, the Spring IoC container creates exactly one instance of the object defined by that bean definition. This single instance is stored in a cache of such singleton beans, and all subsequent requests and references for that named bean return the cached object.

The default scope is always singleton. However, when you need one and only one instance of a bean, you can set the scope property to singleton in the bean configuration file:
```
<!-- A bean definition with singleton scope -->
<bean id = "..." class = "..." scope = "singleton">
   <!-- collaborators and configuration for this bean go here -->
</bean>
```

To test the singleton scope, create a Spring project with the following files:

HelloWorld.java
```
package com.singletonExample;

public class HelloWorld {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
}
```

MainApp.java
```
package com.singletonExample;

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
```

Beans.xml
```
<?xml version = "1.0" encoding = "UTF-8"?>

<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

   <bean id = "helloWorld" class = "com.tutorialspoint.HelloWorld" scope = "singleton">
   </bean>

</beans>
```

Once you are done creating the source and bean configuration files, let us run the application. If everything is fine with your application, it will print the following message:
```
Your Message : I'm object A
Your Message : I'm object A
```

**The prototype scope**
If the scope is set to prototype, the Spring IoC container creates a new bean instance of the object every time a request for that specific bean is made. As a rule, use the prototype scope for all state-full beans and the singleton scope for stateless beans.

To define a prototype scope, you can set the scope property to prototype in the bean configuration file:
```
<!-- A bean definition with prototype scope -->
<bean id = "..." class = "..." scope = "prototype">
   <!-- collaborators and configuration for this bean go here -->
</bean>

```

To test the prototype scope, create a Spring project with the following files:

HelloWorld.java
```
package com.prototypeExample;

public class HelloWorld {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
}
```

MainApp.java
```
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
```

Beans.xml
```
<?xml version = "1.0" encoding = "UTF-8"?>

<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

   <bean id = "helloWorld" class = "com.prototypeExample.HelloWorld" scope = "prototype">
   </bean>

</beans>
```

Once you are done creating the source and bean configuration files, let us run the application. If everything is fine with your application, it will print the following message:
```
Your Message : I'm object A
Your Message : null
```

<a name="h7"/>

**Bean life cycle:**

<a name="hx"/>

**USEFUL LINKS**

**Spring tutorial:**

https://www.tutorialspoint.com/spring/index.htm

**Spring environment setup:**

https://www.tutorialspoint.com/spring/spring_environment_setup.htm
