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

[Bean post processors](#h8)

[Bean definition inheritance](#h9)

[Dependency injection](#h10)

[Injecting inner Beans](#h11)

[Injecting collection](#h12)

[Beans auto-wiring](#h13)

[Annotation based configuration](#h14)

[Java based configuration](#h15)

[Event handling in Spring](#h16)

[Custom events in Spring](#h17)

[AOP with Spring Framework](#h18)

[JDBC Framework](#h19)

[Transaction management](#h20)

[Web MVC Framework](#h21)

[Logging with Log4J](#h22)

[USEFUL LINKS](#h23)

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

   <bean id = "helloWorld" class = "com.package.HelloWorld">
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

   <bean id = "helloWorld" class = "com.singletonExample.HelloWorld" scope = "singleton">
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

The life cycle of a Spring bean is easy to understand. When a bean is instantiated, it may be required to perform some initialization to get it into a usable state. Similarly, when the bean is no longer required and is removed from the container, some cleanup may be required.

To define setup and teardown for a bean, we simply declare the <bean> with **initmethod** and/or **destroy-method** parameters. The init-method attribute specifies a method that is to be called on the bean immediately upon instantiation. Similarly, destroymethod specifies a method that is called just before a bean is removed from the container.

**Initialization callbacks**

The org.springframework.beans.factory.InitializingBean interface specifies a single method:
```
void afterPropertiesSet() throws Exception;
```

Thus, you can simply implement the above interface and initialization work can be done inside afterPropertiesSet() method as follows:
```
public class ExampleBean implements InitializingBean {
   public void afterPropertiesSet() {
      // do some initialization work
   }
}
```

In the case of XML-based configuration metadata, you can use the init-method attribute to specify the name of the method that has a void no-argument signature:
```
<bean id = "exampleBean" class = "examples.ExampleBean" init-method = "init"/>
```

Following is the class definition:
```
public class ExampleBean {
   public void init() {
      // do some initialization work
   }
}
```

**Destruction callbacks**

The org.springframework.beans.factory.DisposableBean interface specifies a single method:
```
void destroy() throws Exception;
```

Thus, you can simply implement the above interface and finalization work can be done inside destroy() method as follows:
```
public class ExampleBean implements DisposableBean {
   public void destroy() {
      // do some destruction work
   }
}
```

In the case of XML-based configuration metadata, you can use the destroy-method attribute to specify the name of the method that has a void no-argument signature. For example:
```
<bean id = "exampleBean" class = "examples.ExampleBean" destroy-method = "destroy"/>
```

Following is the class definition:
```
public class ExampleBean {
   public void destroy() {
      // do some destruction work
   }
}
```

It is recommended that you do not use the InitializingBean or DisposableBean callbacks, because XML configuration gives much flexibility in terms of naming your method.

To test the Bean lifecycle, create a Spring project with the following files:

HelloWorld.java
```
package com.LifeCycleExample;

public class HelloWorld {
   private String message;

   public void setMessage(String message){
      this.message = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
   public void init(){
      System.out.println("Bean is going through init.");
   }
   public void destroy() {
      System.out.println("Bean will destroy now.");
   }
}
```

MainApp.java
```
package com.LifeCycleExample;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
      context.registerShutdownHook();
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

   <bean id = "helloWorld" class = "com.LifeCycleExample.HelloWorld" init-method = "init" 
      destroy-method = "destroy">
      <property name = "message" value = "Hello World!"/>
   </bean>

</beans>
```

Once you are done creating the source and bean configuration files, let us run the application. If everything is fine with your application, it will print the following message:
```
Bean is going through init.
Your Message : Hello World!
Bean will destroy now.
```

**Default initialization and destroy methods**

If you have too many beans having initialization and/or destroy methods with the same name, you don't need to declare init-method and destroy-method on each individual bean. Instead, the framework provides the flexibility to configure such situation using default-init-method and default-destroy-method attributes on the <beans> element as follows:
```
<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
   default-init-method = "init" 
   default-destroy-method = "destroy">

   <bean id = "..." class = "...">
      <!-- collaborators and configuration for this bean go here -->
   </bean>
   
</beans>
```

<a name="h8"/>

**Bean post processors:**

The BeanPostProcessor interface defines callback methods that you can implement to provide your own instantiation logic, dependency-resolution logic, etc. You can also implement some custom logic after the Spring container finishes instantiating, configuring, and initializing a bean by plugging in one or more BeanPostProcessor implementations.

You can configure multiple BeanPostProcessor interfaces and you can control the order in which these BeanPostProcessor interfaces execute by setting the order property provided the BeanPostProcessor implements the Ordered interface.

The BeanPostProcessors operate on bean (or object) instances, which means that the Spring IoC container instantiates a bean instance and then BeanPostProcessor interfaces do their work.

An ApplicationContext automatically detects any beans that are defined with the implementation of the BeanPostProcessor interface and registers these beans as postprocessors, to be then called appropriately by the container upon bean creation.

To test the Bean post processor, create a Spring project with the following files:

HelloWorld.java
```
package com.PostProcessorExample;

public class HelloWorld {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
   public void init(){
      System.out.println("Bean is going through init.");
   }
   public void destroy(){
      System.out.println("Bean will destroy now.");
   }
}
```

InitHelloWorld.java
```
package com.PostProcessorExample;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;

public class InitHelloWorld implements BeanPostProcessor {
   public Object postProcessBeforeInitialization(Object bean, String beanName) 
      throws BeansException {
      
      System.out.println("BeforeInitialization : " + beanName);
      return bean;  // you can return any other object as well
   }
   public Object postProcessAfterInitialization(Object bean, String beanName) 
      throws BeansException {
      
      System.out.println("AfterInitialization : " + beanName);
      return bean;  // you can return any other object as well
   }
}
```

MainApp.java
```
package com.PostProcessorExample;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
      context.registerShutdownHook();
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

   <bean id = "helloWorld" class = "com.PostProcessorExample.HelloWorld"
      init-method = "init" destroy-method = "destroy">
      <property name = "message" value = "Hello World!"/>
   </bean>

   <bean class = "com.PostProcessorExample.InitHelloWorld" />

</beans>
```

Once you are done with creating the source and bean configuration files, let us run the application. If everything is fine with your application, it will print the following message:
```
BeforeInitialization : helloWorld
Bean is going through init.
AfterInitialization : helloWorld
Your Message : Hello World!
Bean will destroy now.
```

<a name="h9"/>

**Bean definition inheritance:**

A bean definition can contain a lot of configuration information, including constructor arguments, property values, and container-specific information such as initialization method, static factory method name, and so on.

A child bean definition inherits configuration data from a parent definition. The child definition can override some values, or add others, as needed.

Spring Bean definition inheritance has nothing to do with Java class inheritance but the inheritance concept is same. You can define a parent bean definition as a template and other child beans can inherit the required configuration from the parent bean.

When you use XML-based configuration metadata, you indicate a child bean definition by using the parent attribute, specifying the parent bean as the value of this attribute.

To test the Bean definition inheritance, create a Spring project with the following files:

Beans.xml
```
<?xml version = "1.0" encoding = "UTF-8"?>

<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

   <bean id = "helloWorld" class = "com.DefinitionInheritanceExample.HelloWorld">
      <property name = "message1" value = "Hello World!"/>
      <property name = "message2" value = "Hello Second World!"/>
   </bean>

   <bean id ="helloBrazil" class = "com.DefinitionInheritanceExample.HelloBrazil" parent = "helloWorld">
      <property name = "message1" value = "Hello Brazil"/>
      <property name = "message3" value = "Samba!"/>
   </bean>
</beans>
```

HelloWorld.java
```
package com.DefinitionInheritanceExample;

public class HelloWorld {
	   private String message1;
	   private String message2;

	   public void setMessage1(String message){
	      this.message1 = message;
	   }
	   public void setMessage2(String message){
	      this.message2 = message;
	   }
	   public void getMessage1(){
	      System.out.println("World Message1 : " + message1);
	   }
	   public void getMessage2(){
	      System.out.println("World Message2 : " + message2);
	   }
	}
```

HelloBrazil.java
```
package com.DefinitionInheritanceExample;

public class HelloBrazil {
	   private String message1;
	   private String message2;
	   private String message3;

	   public void setMessage1(String message){
	      this.message1 = message;
	   }
	   public void setMessage2(String message){
	      this.message2 = message;
	   }
	   public void setMessage3(String message){
	      this.message3 = message;
	   }
	   public void getMessage1(){
	      System.out.println("Brazil Message1 : " + message1);
	   }
	   public void getMessage2(){
	      System.out.println("Brazil Message2 : " + message2);
	   }
	   public void getMessage3(){
	      System.out.println("Brazil Message3 : " + message3);
	   }
	}
```

MainApp.java
```
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
```

Once you are done creating the source and bean configuration files, let us run the application. If everything is fine with your application, it will print the following message:
```
World Message1 : Hello World!
World Message2 : Hello Second World!
Brazil Message1 : Hello Brazil
Brazil Message2 : Hello Second World!
Brazil Message3 : Samba!
```

**Bean definition template**

You can create a Bean definition template, which can be used by other child bean definitions without putting much effort. While defining a Bean Definition Template, you should not specify the class attribute and should specify abstract attribute and should specify the abstract attribute with a value of true:

Bean.xml
```
<?xml version = "1.0" encoding = "UTF-8"?>

<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

   <bean id = "beanTeamplate" abstract = "true">
      <property name = "message1" value = "Hello World!"/>
      <property name = "message2" value = "Hello Second World!"/>
      <property name = "message3" value = "Samba!"/>
   </bean>

   <bean id = "helloBrazil" class = "com.DefinitionInheritanceExample.HelloBrazil" parent = "beanTeamplate">
      <property name = "message1" value = "Hello Brazil!"/>
      <property name = "message3" value = "Samba!"/>
   </bean>
   
</beans>
```

The parent bean cannot be instantiated on its own because it is incomplete, and it is also explicitly marked as abstract. When a definition is abstract like this, it is usable only as a pure template bean definition that serves as a parent definition for child definitions.

<a name="h10"/>

**Dependency injection:**

Every Java-based application has a few objects that work together to present what the end-user sees as a working application. When writing a complex Java application, application classes should be as independent as possible of other Java classes to increase the possibility to reuse these classes and to test them independently of other classes while unit testing. Dependency Injection (or sometime called wiring) helps in gluing these classes together and at the same time keeping them independent.

Consider you have an application which has a text editor component and you want to provide a spell check. Your standard code would look something like this:
```
public class TextEditor {
   private SpellChecker spellChecker;
   
   public TextEditor() {
      spellChecker = new SpellChecker();
   }
}
```

What we've done here is, create a dependency between the TextEditor and the SpellChecker. In an inversion of control scenario, we would instead do something like this:
```
public class TextEditor {
   private SpellChecker spellChecker;
   
   public TextEditor(SpellChecker spellChecker) {
      this.spellChecker = spellChecker;
   }
}
```

Here, the TextEditor should not worry about SpellChecker implementation. The SpellChecker will be implemented independently and will be provided to the TextEditor at the time of TextEditor instantiation. This entire procedure is controlled by the Spring Framework.

Here, we have removed total control from the TextEditor and kept it somewhere else (i.e. XML configuration file) and the dependency (i.e. class SpellChecker) is being injected into the class TextEditor through a Class Constructor. Thus the flow of control has been "inverted" by Dependency Injection (DI) because you have effectively delegated dependances to some external system.

The second method of injecting dependency is through Setter Methods of the TextEditor class where we will create a SpellChecker instance. This instance will be used to call setter methods to initialize TextEditor's properties.

DI exists in two major variants:

* Constructor-based dependency injection - Constructor-based DI is accomplished when the container invokes a class constructor with a number of arguments, each representing a dependency on the other class.

* Setter-based dependency injection - Setter-based DI is accomplished by the container calling setter methods on your beans after invoking a no-argument constructor or no-argument static factory method to instantiate your bean.

The code is cleaner with the DI principle and decoupling is more effective when objects are provided with their dependencies. The object does not look up its dependencies and does not know the location or class of the dependencies, rather everything is taken care by the Spring Framework.

<a name="h11"/>

**Injecting inner Beans:**

As you know Java inner classes are defined within the scope of other classes, similarly, inner beans are beans that are defined within the scope of another bean. A <bean/> element inside the <property/> or <constructor-arg/> elements is called inner bean:
```
<?xml version = "1.0" encoding = "UTF-8"?>

<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

   <bean id = "outerBean" class = "...">
      <property name = "target">
         <bean id = "innerBean" class = "..."/>
      </property>
   </bean>

</beans>
```

To test the injecting inner Beans, create a Spring project with the following files:

TextEditor.java
```
package com.InnerInjectionExample;

public class TextEditor {
	   private SpellChecker spellChecker;
	   
	   // a setter method to inject the dependency.
	   public void setSpellChecker(SpellChecker spellChecker) {
	      System.out.println("Inside setSpellChecker." );
	      this.spellChecker = spellChecker;
	   }
	   
	   // a getter method to return spellChecker
	   public SpellChecker getSpellChecker() {
	      return spellChecker;
	   }
	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
	}

```

SpellChecker.java
```
package com.InnerInjectionExample;

public class SpellChecker {
	   public SpellChecker(){
	      System.out.println("Inside SpellChecker constructor." );
	   }
	   public void checkSpelling(){
	      System.out.println("Inside checkSpelling." );
	   }
	}
```

MainApp.java
```
package com.InnerInjectionExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      TextEditor te = (TextEditor) context.getBean("textEditor");
      te.spellCheck();
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

   <!-- Definition for textEditor bean using inner bean -->
   <bean id = "textEditor" class = "com.InnerInjectionExample.TextEditor">
      <property name = "spellChecker">
         <bean id = "spellChecker" class = "com.InnerInjectionExample.SpellChecker"/>
      </property>
   </bean>

</beans>
```

Once you are done creating the source and bean configuration files, let us run the application. If everything is fine with your application, it will print the following message:
```
Inside SpellChecker constructor.
Inside setSpellChecker.
Inside checkSpelling.
```

<a name="h12"/>

**Injecting collection:**

You have seen how to configure primitive data type using value attribute and object references using ref attribute of the <property> tag in your Bean configuration file. Both the cases deal with passing singular value to a bean.

Now what if you want to pass multiple values like Java Collection types such as List, Set, Map, and Properties. To handle the situation, Spring offers four types of collection configuration elements which are as follows:

* <list> - This helps in wiring ie injecting a list of values, allowing duplicates.

* <set> - This helps in wiring a set of values but without any duplicates.

* <map> - This can be used to inject a collection of name-value pairs where name and value can be of any type.

* <props> - This can be used to inject a collection of name-value pairs where the name and value are both Strings.


You can use either <list> or <set> to wire any implementation of java.util.Collection or an array.

You will come across two situations (a) Passing direct values of the collection and (b) Passing a reference of a bean as one of the collection elements.

To test injecting collection, create a Spring project with the following files:

JavaCollection.java
```
package com.InjectingCollectionExample;

import java.util.*;

public class JavaCollection {
   List addressList;
   Set  addressSet;
   Map  addressMap;
   Properties addressProp;

   // a setter method to set List
   public void setAddressList(List addressList) {
      this.addressList = addressList;
   }
   
   // prints and returns all the elements of the list.
   public List getAddressList() {
      System.out.println("List Elements :"  + addressList);
      return addressList;
   }
   
   // a setter method to set Set
   public void setAddressSet(Set addressSet) {
      this.addressSet = addressSet;
   }
   
   // prints and returns all the elements of the Set.
   public Set getAddressSet() {
      System.out.println("Set Elements :"  + addressSet);
      return addressSet;
   }
   
   // a setter method to set Map
   public void setAddressMap(Map addressMap) {
      this.addressMap = addressMap;
   }
   
   // prints and returns all the elements of the Map.
   public Map getAddressMap() {
      System.out.println("Map Elements :"  + addressMap);
      return addressMap;
   }
   
   // a setter method to set Property
   public void setAddressProp(Properties addressProp) {
      this.addressProp = addressProp;
   }
   
   // prints and returns all the elements of the Property.
   public Properties getAddressProp() {
      System.out.println("Property Elements :"  + addressProp);
      return addressProp;
   }
}
```

MainApp.java
```
package com.InjectingCollectionExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

      jc.getAddressList();
      jc.getAddressSet();
      jc.getAddressMap();
      jc.getAddressProp();
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

   <!-- Definition for javaCollection -->
   <bean id = "javaCollection" class = "com.InjectingCollectionExample.JavaCollection">
      
      <!-- results in a setAddressList(java.util.List) call -->
      <property name = "addressList">
         <list>
            <value>Address 1</value>
            <value>Address 2</value>
            <value>Address 3</value>
            <value>Address 3</value>
         </list>
      </property>

      <!-- results in a setAddressSet(java.util.Set) call -->
      <property name = "addressSet">
         <set>
            <value>Address 1</value>
            <value>Address 2</value>
            <value>Address 3</value>
            <value>Address 3</value>
         </set>
      </property>

      <!-- results in a setAddressMap(java.util.Map) call -->
      <property name = "addressMap">
         <map>
            <entry key = "1" value = "Address 1"/>
            <entry key = "2" value = "Address 2"/>
            <entry key = "3" value = "Address 3"/>
            <entry key = "4" value = "Address 4"/>
         </map>
      </property>
      
      <!-- results in a setAddressProp(java.util.Properties) call -->
      <property name = "addressProp">
         <props>
            <prop key = "one">Address 1</prop>
            <prop key = "one">Address 1</prop>
            <prop key = "two">Address 2</prop>
            <prop key = "three">Address 3</prop>
            <prop key = "four">Address 4</prop>
         </props>
      </property>
   </bean>

</beans>
```

Once you are done creating the source and bean configuration files, let us run the application. If everything is fine with your application, it will print the following message:
```
List Elements :[Address 1, Address 2, Address 3, Address 3]
Set Elements :[Address 1, Address 2, Address 3]
Map Elements :{1=Address 1, 2=Address 2, 3=Address 3, 4=Address 4}
Property Elements :{four=Address 4, one=Address 1, two=Address 2, three=Address 3}
```

**Injecting Bean references**

The following Bean definition will help you understand how to inject bean references as one of the collection's element. You can mix references and values:
```
<?xml version = "1.0" encoding = "UTF-8"?>

<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

   <!-- Bean Definition to handle references and values -->
   <bean id = "..." class = "...">

      <!-- Passing bean reference  for java.util.List -->
      <property name = "addressList">
         <list>
            <ref bean = "address1"/>
            <ref bean = "address2"/>
            <value>Brazil</value>
         </list>
      </property>
      
      <!-- Passing bean reference  for java.util.Set -->
      <property name = "addressSet">
         <set>
            <ref bean = "address1"/>
            <ref bean = "address2"/>
            <value>Brazil</value>
         </set>
      </property>
      
      <!-- Passing bean reference  for java.util.Map -->
      <property name = "addressMap">
         <map>
            <entry key = "one" value = "Brazil"/>
            <entry key = "two" value-ref = "address1"/>
            <entry key = "three" value-ref = "address2"/>
         </map>
      </property>
   </bean>

</beans>
```

To use the above bean definition, you need to define your setter methods to handle references as well.

**Injecting null and empty string values**

empty string
```
<bean id = "..." class = "exampleBean">
   <property name = "email" value = ""/>
</bean>
```

The preceding example is equivalent to the Java code: exampleBean.setEmail("")

Null
```
<bean id = "..." class = "exampleBean">
   <property name = "email"><null/></property>
</bean>
```

The preceding example is equivalent to the Java code: exampleBean.setEmail(null)

<a name="h13"/>

**Beans auto-wiring:**

You have learnt how to declare beans using the <bean> element and inject <bean> using <constructor-arg> and <property> elements in XML configuration file.

The Spring container can autowire relationships between collaborating beans without using <constructor-arg> and <property> elements, which helps cut down on the amount of XML configuration you write for a big Spring-based application.

**Autowiring Modes**

* no - This is default setting which means no autowiring and you should use explicit bean reference for wiring. You have nothing to do special for this wiring. This is what you already have seen in Dependency Injection chapter.

* byName - Autowiring by property name. Spring container looks at the properties of the beans on which autowire attribute is set to byName in the XML configuration file. It then tries to match and wire its properties with the beans defined by the same names in the configuration file.

* byType - Autowiring by property datatype. Spring container looks at the properties of the beans on which autowire attribute is set to byType in the XML configuration file. It then tries to match and wire a property if its type matches with exactly one of the beans name in configuration file. If more than one such beans exists, a fatal exception is thrown.

* constructor - Similar to byType, but type applies to constructor arguments. If there is not exactly one bean of the constructor argument type in the container, a fatal error is raised.

* autodetect - Spring first tries to wire using autowire by constructor, if it does not work, Spring tries to autowire by byType.

<a name="h14"/>

**Annotation based configuration:**

Starting from Spring 2.5 it became possible to configure the dependency injection using annotations. So instead of using XML to describe a bean wiring, you can move the bean configuration into the component class itself by using annotations on the relevant class, method, or field declaration.

Annotation injection is performed before XML injection. The later configuration will override the former properties wired.

Annotation wiring is not turned on in the Spring container by default. So, before we can use annotation-based wiring, we will need to enable it in our Spring configuration file. So consider the following configuration file in case you want to use any annotation in your Spring application:
```
<?xml version = "1.0" encoding = "UTF-8"?>

<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xmlns:context = "http://www.springframework.org/schema/context"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
   http://www.springframework.org/schema/context
   http://www.springframework.org/schema/context/spring-context-3.0.xsd">

   <context:annotation-config/>
   <!-- bean definitions go here -->

</beans>
```

Once <context:annotation-config/> is configured, you can start annotating your code to indicate that Spring should automatically wire values into properties, methods, and constructors:

* @Required - The @Required annotation applies to bean property setter methods.

* @Autowired - The @Autowired annotation can apply to bean property setter methods, non-setter methods, constructor and properties.

* @Qualifier - The @Qualifier annotation along with @Autowired can be used to remove the confusion by specifiying which exact bean will be wired.

* JSR-250 Annotations - Spring supports JSR-250 based annotations which include @Resource, @PostConstruct and @PreDestroy annotations.

<a name="h15"/>

**Java based configuration:**

Java-based configuration option enables you to write most of your Spring configuration without XML but with the help of few Java-based annotations explained in this chapter.

@Configuration & @Bean Annotations

Annotating a class with the @Configuration indicates that the class can be used by the Spring IoC container as a source of bean definitions. The @Bean annotation tells Spring that a method annotated with @Bean will return an object that should be registered as a bean in the Spring application context:
```
import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {
   @Bean 
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
}
```

The above code will be equivalent to the following XML configuration:
```
<beans>
   <bean id = "helloWorld" class = "com.package.HelloWorld" />
</beans>
```

Here, the method name is annotated with @Bean works as bean ID and it creates and returns the actual bean. Your configuration class can have a declaration for more than one @Bean. Once your configuration classes are defined, you can load and provide them to Spring container using AnnotationConfigApplicationContext as follows:
```
public static void main(String[] args) {
   ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
   
   HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
   helloWorld.setMessage("Hello World!");
   helloWorld.getMessage();
}
```

You can load various configuration:
```
public static void main(String[] args) {
   AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

   ctx.register(AppConfig.class, OtherConfig.class);
   ctx.register(AdditionalConfig.class);
   ctx.refresh();

   MyService myService = ctx.getBean(MyService.class);
   myService.doStuff();
}
```

To test Java based configuration, create a Spring project with the following files:

HelloWorldConfig.java
```
package com.JavaBasedConfig;
import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {
   @Bean 
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
}
```

HelloWorld.java
```
package com.JavaBasedConfig;

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
package com.JavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext ctx = 
         new AnnotationConfigApplicationContext(HelloWorldConfig.class);
   
      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
      helloWorld.setMessage("Hello World!");
      helloWorld.getMessage();
   }
}
```

Once you have done creating all the source files and adding the required additional libraries, let us run the application. You should note that there is no configuration file required. If everything is fine with your application, it will print the following message:
```
Your Message : Hello World!
```

**Injecting bean dependencies**

When @Beans have dependencies on one another, expressing that the dependency is as simple as having one bean method calling another:
```
import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {
   @Bean
   public Foo foo() {
      return new Foo(bar());
   }
   @Bean
   public Bar bar() {
      return new Bar();
   }
}
```

Here, the foo bean receives a reference to bar via the constructor injection.

To test Java based configuration with Bean dependency injections, create a Spring project with the following files:

TextEditorConfig.java
```
package com.DependencyInjection;
import org.springframework.context.annotation.*;

@Configuration
public class TextEditorConfig {
   @Bean 
   public TextEditor textEditor(){
      return new TextEditor( spellChecker() );
   }

   @Bean 
   public SpellChecker spellChecker(){
      return new SpellChecker( );
   }
}
```

TextEditor.java
```
package com.DependencyInjection;

public class TextEditor {
   private SpellChecker spellChecker;

   public TextEditor(SpellChecker spellChecker){
      System.out.println("Inside TextEditor constructor." );
      this.spellChecker = spellChecker;
   }
   public void spellCheck(){
      spellChecker.checkSpelling();
   }
}
```

SpellChecker.java
```
package com.DependencyInjection;

public class SpellChecker {
   public SpellChecker(){
      System.out.println("Inside SpellChecker constructor." );
   }
   public void checkSpelling(){
      System.out.println("Inside checkSpelling." );
   }
}
```

MainApp.java
```
package com.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext ctx = 
         new AnnotationConfigApplicationContext(TextEditorConfig.class);

      TextEditor te = ctx.getBean(TextEditor.class);
      te.spellCheck();
   }
}
```

Once you have done creating all the source files and adding the required additional libraries, let us run the application. You should note that there is no configuration file required. If everything is fine with your application, it will print the following message:
```
Inside SpellChecker constructor.
Inside TextEditor constructor.
Inside checkSpelling.
```

**The @Import annotation**

The @Import annotation allows for loading @Bean definitions from another configuration class. Consider a ConfigA class as follows:
```
@Configuration
public class ConfigA {
   @Bean
   public A a() {
      return new A(); 
   }
}
```

You can import above Bean declaration in another Bean Declaration:
```
@Configuration
@Import(ConfigA.class)
public class ConfigB {
   @Bean
   public B b() {
      return new B(); 
   }
}
```

Now, rather than needing to specify both ConfigA.class and ConfigB.class when instantiating the context, only ConfigB needs to be supplied:
```
public static void main(String[] args) {
   ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigB.class);
   
   // now both beans A and B will be available...
   A a = ctx.getBean(A.class);
   B b = ctx.getBean(B.class);
}
```

**Lifecycle Callbacks**

The @Bean annotation supports specifying arbitrary initialization and destruction callback methods, much like Spring XML's init-method and destroy-method attributes on the bean element:
```
public class Foo {
   public void init() {
      // initialization logic
   }
   public void cleanup() {
      // destruction logic
   }
}
@Configuration
public class AppConfig {
   @Bean(initMethod = "init", destroyMethod = "cleanup" )
   public Foo foo() {
      return new Foo();
   }
}
```

**Specifying Bean scope**

The default scope is singleton, but you can override this with the @Scope annotation as follows:
```
@Configuration
public class AppConfig {
   @Bean
   @Scope("prototype")
   public Foo foo() {
      return new Foo();
   }
}
```

<a name="h16"/>

**Event handling in Spring:**

The core of Spring is the ApplicationContext, which manages the complete life cycle of the beans. The ApplicationContext publishes certain types of events when loading the beans. For example, a ContextStartedEvent is published when the context is started and ContextStoppedEvent is published when the context is stopped.

Event handling in the ApplicationContext is provided through the ApplicationEvent class and ApplicationListener interface. Hence, if a bean implements the ApplicationListener, then every time an ApplicationEvent gets published to the ApplicationContext, that bean is notified.

Spring provides the following standard events:

**ContextRefreshedEvent** - This event is published when the ApplicationContext is either initialized or refreshed. This can also be raised using the refresh() method on the ConfigurableApplicationContext interface.

**ContextStartedEvent** - This event is published when the ApplicationContext is started using the start() method on the ConfigurableApplicationContext interface. You can poll your database or you can restart any stopped application after receiving this event.

**ContextStoppedEvent** - This event is published when the ApplicationContext is stopped using the stop() method on the ConfigurableApplicationContext interface. You can do required housekeep work after receiving this event.

**ContextClosedEvent** - This event is published when the ApplicationContext is closed using the close() method on the ConfigurableApplicationContext interface. A closed context reaches its end of life; it cannot be refreshed or restarted.

**RequestHandledEvent** - This is a web-specific event telling all beans that an HTTP request has been serviced.

Spring's event handling is single-threaded so if an event is published, until and unless all the receivers get the message, the processes are blocked and the flow will not continue. Hence, care should be taken when designing your application if the event handling is to be used.

To test Event Handling, create a Spring project with the following files:

HelloWorld.java
```
package com.ContextEvents;

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

CStartEventHandler.java
```
package com.ContextEvents;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CStartEventHandler 
   implements ApplicationListener<ContextStartedEvent>{

   public void onApplicationEvent(ContextStartedEvent event) {
      System.out.println("ContextStartedEvent Received");
   }
}
```

CStopEventHandler.java
```
package com.ContextEvents;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class CStopEventHandler 
   implements ApplicationListener<ContextStoppedEvent>{

   public void onApplicationEvent(ContextStoppedEvent event) {
      System.out.println("ContextStoppedEvent Received");
   }
}
```

MainApp.java
```
package com.ContextEvents;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ConfigurableApplicationContext context = 
         new ClassPathXmlApplicationContext("Beans.xml");

      // Let us raise a start event.
      context.start();
	  
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();

      // Let us raise a stop event.
      context.stop();
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

   <bean id = "helloWorld" class = "com.ContextEvents.HelloWorld">
      <property name = "message" value = "Hello World!"/>
   </bean>

   <bean id = "cStartEventHandler" class = "com.ContextEvents.CStartEventHandler"/>
   <bean id = "cStopEventHandler" class = "com.ContextEvents.CStopEventHandler"/>

</beans>
```

Once you are done creating the source and bean configuration files, let us run the application. If everything is fine with your application, it will print the following message:
```
ContextStartedEvent Received
Your Message : Hello World!
ContextStoppedEvent Received
```

<a name="h17"/>

**Custom events in Spring:**

To test Event Handling, create a Spring project with the following files:

CustomEvent.java
```
package com.CustomEvents;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent{
   public CustomEvent(Object source) {
      super(source);
   }
   public String toString(){
      return "My Custom Event";
   }
}
```

CustomEventPublisher.java
```
package com.CustomEvents;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {
   private ApplicationEventPublisher publisher;
   
   public void setApplicationEventPublisher (ApplicationEventPublisher publisher) {
      this.publisher = publisher;
   }
   public void publish() {
      CustomEvent ce = new CustomEvent(this);
      publisher.publishEvent(ce);
   }
}
```

CustomEventHandler.java
```
package com.CustomEvents;

import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomEvent> {
   public void onApplicationEvent(CustomEvent event) {
      System.out.println(event.toString());
   }
}
```

MainApp.java
```
package com.CustomEvents;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ConfigurableApplicationContext context = 
         new ClassPathXmlApplicationContext("Beans.xml");
	  
      CustomEventPublisher cvp = 
         (CustomEventPublisher) context.getBean("customEventPublisher");
      
      cvp.publish();  
      cvp.publish();
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

   <bean id = "customEventHandler" class = "com.CustomEvents.CustomEventHandler"/>
   <bean id = "customEventPublisher" class = "com.CustomEvents.CustomEventPublisher"/>

</beans>
```

Once you are done creating the source and bean configuration files, let us run the application. If everything is fine with your application, it will print the following message:
```
My Custom Event
My Custom Event
```

<a name="h18"/>

**AOP with Spring Framework:**

One of the key components of Spring Framework is the Aspect oriented programming (AOP) framework. Aspect-Oriented Programming entails breaking down program logic into distinct parts called concerns. The functions that span multiple points of an application are called cross-cutting concerns and these cross-cutting concerns are conceptually separate from the application's business logic. There are various common good examples of aspects like logging, auditing, declarative transactions, security, caching, etc.

The key unit of modularity in OOP is the class, whereas in AOP the unit of modularity is the aspect. Dependency Injection helps you decouple your application objects from each other and AOP helps you decouple cross-cutting concerns from the objects that they affect. AOP is like triggers in programming languages such as Perl, .NET, Java, and others.

Spring AOP module provides interceptors to intercept an application. For example, when a method is executed, you can add extra functionality before or after the method execution.

**AOP Terminologies**

**Aspect** - This is a module which has a set of APIs providing cross-cutting requirements. For example, a logging module would be called AOP aspect for logging. An application can have any number of aspects depending on the requirement.

**Join point** - This represents a point in your application where you can plug-in the AOP aspect. You can also say, it is the actual place in the application where an action will be taken using Spring AOP framework.

**Advice** - This is the actual action to be taken either before or after the method execution. This is an actual piece of code that is invoked during the program execution by Spring AOP framework.

**Pointcut** - This is a set of one or more join points where an advice should be executed. You can specify pointcuts using expressions or patterns as we will see in our AOP examples.

**Introduction** - An introduction allows you to add new methods or attributes to the existing classes.

**Target object** - The object being advised by one or more aspects. This object will always be a proxied object, also referred to as the advised object.

**Weaving** - Weaving is the process of linking aspects with other application types or objects to create an advised object. This can be done at compile time, load time, or at runtime.

**Types of Advice**

Spring aspects can work with five kinds of advice:

**before** - Run advice before the a method execution.

**after** - Run advice after the method execution, regardless of its outcome.

**after-returning** - Run advice after the a method execution only if method completes successfully.

**after-throwing** - Run advice after the a method execution only if method exits by throwing an exception.

**around** - Run advice before and after the advised method is invoked.

<a name="h19"/>

**JDBC Framework:

While working with the database using plain old JDBC, it becomes cumbersome to write unnecessary code to handle exceptions, opening and closing database connections, etc. However, Spring JDBC Framework takes care of all the low-level details starting from opening the connection, prepare and execute the SQL statement, process exceptions, handle transactions and finally close the connection.

What you have to do is just define the connection parameters and specify the SQL statement to be executed and do the required work for each iteration while fetching data from the database.

**JdbcTemplate Class**

The JDBC Template class executes SQL queries, updates statements, stores procedure calls, performs iteration over ResultSets, and extracts returned parameter values. It also catches JDBC exceptions and translates them to the generic, more informative, exception hierarchy defined in the org.springframework.dao package.

Instances of the JdbcTemplate class are threadsafe once configured. So you can configure a single instance of a JdbcTemplate and then safely inject this shared reference into multiple DAOs.

A common practice when using the JDBC Template class is to configure a DataSource in your Spring configuration file, and then dependency-inject that shared DataSource bean into your DAO classes, and the JdbcTemplate is created in the setter for the DataSource.

You can configure the DataSource in the XML file:
```
<bean id = "dataSource" 
   class = "org.springframework.jdbc.datasource.DriverManagerDataSource">
   <property name = "driverClassName" value = "com.mysql.jdbc.Driver"/>
   <property name = "url" value = "jdbc:mysql://localhost:3306/TEST"/>
   <property name = "username" value = "root"/>
   <property name = "password" value = "password"/>
</bean>
```

**Data Access Object (DAO):**

DAO stands for Data Access Object, which is commonly used for database interaction. DAOs exist to provide a means to read and write data to the database and they should expose this functionality through an interface by which the rest of the application will access them.

**Executing SQL statements**

Perform CRUD (Create, Read, Update and Delete) operation on database tables using SQL and JDBC Template object.

Querying for an integer
```
String SQL = "select count(*) from Student";
int rowCount = jdbcTemplateObject.queryForInt( SQL );
```

Querying for a long
```
String SQL = "select count(*) from Student";
long rowCount = jdbcTemplateObject.queryForLong( SQL );
```

A simple query using a bind variable
```
String SQL = "select age from Student where id = ?";
int age = jdbcTemplateObject.queryForInt(SQL, new Object[]{10});
```

Querying for a String
```
String SQL = "select name from Student where id = ?";
String name = jdbcTemplateObject.queryForObject(SQL, new Object[]{10}, String.class);
```

Querying and returning an object
```
String SQL = "select * from Student where id = ?";
Student student = jdbcTemplateObject.queryForObject(
   SQL, new Object[]{10}, new StudentMapper());

public class StudentMapper implements RowMapper<Student> {
   public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
      Student student = new Student();
      student.setID(rs.getInt("id"));
      student.setName(rs.getString("name"));
      student.setAge(rs.getInt("age"));
      
      return student;
   }
}
```

Querying and returning multiple objects
```
String SQL = "select * from Student";
List<Student> students = jdbcTemplateObject.query(
   SQL, new StudentMapper());

public class StudentMapper implements RowMapper<Student> {
   public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
      Student student = new Student();
      student.setID(rs.getInt("id"));
      student.setName(rs.getString("name"));
      student.setAge(rs.getInt("age"));
      
      return student;
   }
}
```

Inserting a row into the table
```
String SQL = "insert into Student (name, age) values (?, ?)";
jdbcTemplateObject.update( SQL, new Object[]{"Zara", 11} );
Updating a row into the table

String SQL = "update Student set name = ? where id = ?";
jdbcTemplateObject.update( SQL, new Object[]{"Zara", 10} );
Deleting a row from the table

String SQL = "delete Student where id = ?";
jdbcTemplateObject.update( SQL, new Object[]{20} );
```

Updating a row into the table
```
String SQL = "update Student set name = ? where id = ?";
jdbcTemplateObject.update( SQL, new Object[]{"Zara", 10} );
```

Deleting a row from the table
```
String SQL = "delete Student where id = ?";
jdbcTemplateObject.update( SQL, new Object[]{20} );
```

**Executing DDL Statements**

You can use the execute(..) method from jdbcTemplate to execute any SQL statements or DDL (Data Definition Language) statements. Following is an example to use CREATE statement to create a table:
```
String SQL = "CREATE TABLE Student( " +
   "ID   INT NOT NULL AUTO_INCREMENT, " +
   "NAME VARCHAR(20) NOT NULL, " +
   "AGE  INT NOT NULL, " +
   "PRIMARY KEY (ID));"

jdbcTemplateObject.execute( SQL );
```

To test Event Handling, create a Spring project with the following files:

Content of the Data Access Object interface file **StudentDAO.java**
```
package com.dbexample;

import java.util.List;
import javax.sql.DataSource;

public interface StudentDAO {
   /** 
      * This is the method to be used to initialize
      * database resources ie. connection.
   */
   public void setDataSource(DataSource ds);
   
   /** 
      * This is the method to be used to create
      * a record in the Student table.
   */
   public void create(String name, Integer age);
   
   /** 
      * This is the method to be used to list down
      * a record from the Student table corresponding
      * to a passed student id.
   */
   public Student getStudent(Integer id);
   
   /** 
      * This is the method to be used to list down
      * all the records from the Student table.
   */
   public List<Student> listStudents();
   
   /** 
      * This is the method to be used to delete
      * a record from the Student table corresponding
      * to a passed student id.
   */
   public void delete(Integer id);
   
   /** 
      * This is the method to be used to update
      * a record into the Student table.
   */
   public void update(Integer id, Integer age);
}
```

Content of the Student.java
```
package com.dbexample;

public class Student {
	   private Integer age;
	   private String name;
	   private Integer id;

	   public void setAge(Integer age) {
	      this.age = age;
	   }
	   public Integer getAge() {
	      return age;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getName() {
	      return name;
	   }
	   public void setId(Integer id) {
	      this.id = id;
	   }
	   public Integer getId() {
	      return id;
	   }
	}
```

Content of the StudentMapper.java
```
package com.dbexample;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {
   public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
      Student student = new Student();
      student.setId(rs.getInt("id"));
      student.setName(rs.getString("name"));
      student.setAge(rs.getInt("age"));
      
      return student;
   }
}
```


Implementation class file **StudentJDBCTemplate.java** for the defined DAO interface StudentDAO
```
package com.dbexample;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {
   private DataSource dataSource;
   private JdbcTemplate jdbcTemplateObject;
   
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }
   public void create(String name, Integer age) {
      String SQL = "INSERT INTO \"Student\" (\"NAME\", \"AGE\") VALUES (?, ?)";
      jdbcTemplateObject.update( SQL, name, age);
      System.out.println("Created Record Name = " + name + " Age = " + age);
      return;
   }
   public Student getStudent(Integer id) {
      String SQL = "SELECT * FROM \"Student\" WHERE \"ID\" = ?";
      Student student = jdbcTemplateObject.queryForObject(SQL, 
         new Object[]{id}, new StudentMapper());
      
      return student;
   }
   public List<Student> listStudents() {
      String SQL = "SELECT * FROM \"Student\"";
      List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
      return students;
   }
   public void delete(Integer id) {
      String SQL = "DELETE FROM \"Student\" WHERE id = ?";
      jdbcTemplateObject.update(SQL, id);
      System.out.println("Deleted Record with ID = " + id );
      return;
   }
   public void update(Integer id, Integer age){
      String SQL = "UPDATE \"Student\" SET \"AGE\" = ? WHERE \"ID\" = ?";
      jdbcTemplateObject.update(SQL, age, id);
      System.out.println("Updated Record with ID = " + id );
      return;
   }
}
```

content of the **MainApp.java** file
```
package com.dbexample;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dbexample.StudentJDBCTemplate;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

      StudentJDBCTemplate studentJDBCTemplate = 
         (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
      
      System.out.println("------Records Creation--------" );
      studentJDBCTemplate.create("Guilherme", 28);
      studentJDBCTemplate.create("Harry", 2);
      studentJDBCTemplate.create("Harryson", 3);

      System.out.println("------Listing Multiple Records--------" );
      List<Student> students = studentJDBCTemplate.listStudents();
      
      for (Student record : students) {
         System.out.print("ID : " + record.getId() );
         System.out.print(", Name : " + record.getName() );
         System.out.println(", Age : " + record.getAge());
      }

      System.out.println("----Updating Record with ID = 2 -----" );
      studentJDBCTemplate.update(2, 20);

      System.out.println("----Listing Record with ID = 2 -----" );
      Student student = studentJDBCTemplate.getStudent(2);
      System.out.print("ID : " + student.getId() );
      System.out.print(", Name : " + student.getName() );
      System.out.println(", Age : " + student.getAge());
   }
}
```

Configuration file **Beans.xml**
```
<?xml version = "1.0" encoding = "UTF-8"?>
<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance" 
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd ">

   <!-- Initialization for data source -->
   <bean id = "dataSource" 
	   class = "org.springframework.jdbc.datasource.DriverManagerDataSource">
	   <property name = "driverClassName" value = "org.postgresql.Driver"/>
	   <property name = "url" value = "jdbc:postgresql://localhost:5432/TEST"/>
	   <property name = "username" value = "postgres"/>
	   <property name = "password" value = "admin"/>
	</bean>

   <!-- Definition for studentJDBCTemplate bean -->
   <bean id = "studentJDBCTemplate" 
      class = "com.dbexample.StudentJDBCTemplate">
      <property name = "dataSource" ref = "dataSource" />    
   </bean>
      
</beans>

```

Once you are done creating the source and bean configuration files, let us run the application. If everything is fine with your application, it will print the following message:
```
------Records Creation--------
Created Record Name = Guilherme Age = 28
Created Record Name = Harry Age = 2
Created Record Name = Harryson Age = 3
------Listing Multiple Records--------
ID : 1, Name : Guilherme, Age : 28
ID : 2, Name : Harry, Age : 2
ID : 3, Name : Harryson, Age : 3
----Updating Record with ID = 2 -----
Updated Record with ID = 2
----Listing Record with ID = 2 -----
ID : 2, Name : Harry, Age : 20
```

<a name="h20"/>

**Transaction management:**

<a name="h21"/>

**Web MVC Framework:**

<a name="h22"/>

**Logging with Log4J:**

<a name="h23"/>

**USEFUL LINKS**

**Spring tutorial:**

https://www.tutorialspoint.com/spring/index.htm

**Spring environment setup:**

https://www.tutorialspoint.com/spring/spring_environment_setup.htm
