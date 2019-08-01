# 3.3.1.6) Testing

Software testing is an investigation conducted to provide stakeholders with information about the quality of the software product or service under test. Software testing can also provide an objective, independent view of the software to allow the business to appreciate and understand the risks of software implementation. Test techniques include the process of executing a program or application with the intent of finding software bugs (errors or other defects), and verifying that the software product is fit for use.

Software testing involves the execution of a software component or system component to evaluate one or more properties of interest. In general, these properties indicate the extent to which the component or system under test:

* Meets the requirements that guided its design and development,
* Responds correctly to all kinds of inputs,
* Performs its functions within an acceptable time,
* It is sufficiently usable,
* Can be installed and run in its intended environments, and
* Achieves the general result its stakeholders desire.

<details open>
<summary>Table of Contents</summary>
<br>

[Unit Testing](#h1)

[Integration Testing](#h2)

[USEFUL LINKS](#h3)

</details>

<a name="h1"/>

**Unit Testing:**

In computer programming, unit testing is a software testing method by which individual units of source code, sets of one or more computer program modules together with associated control data, usage procedures, and operating procedures, are tested to determine whether they are fit for use.

The following example will test if the Dog objects are barking correctly and the Duck objects can fly and make quack correclty.

To run an Unit test using Eclipse and the framework Junit (check link for full documentation below), create a new Java project in Eclipse:

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/junit1.png)

Name it "junit_tests" for example:

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/junit2.png)

Create a new class called Dog and another one called Duck (These will be the code under test):

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/junit3.png)

Dog.java:
```
package junit_tests;

public class Dog {
	
	public String bark(String dogBreed) {
		
		switch (dogBreed) {
		
		case "Pudel":
			return "woof!";
			
		case "Labrador":
			return "WOOF!";
			
		default:
			return "woof woof!";
			
		}
	}
}
```

Duck.java:
```
package junit_tests;

public class Duck {
	
	public String quack() {
		return "Quack quack!";
	}
	
	public String fly() {
		return "I am swimming!";
	}
	
}
```

Now create a new Junit Test Case:

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/junit4.png)

Name it "AnimalTest" for example, select the "setUp()" method stub and click on "Finish":

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/junit5.png)

AnimalTest.java:
```
package junit_tests;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnimalTest {

	Duck little_duck;
	Dog harry;
	
	@BeforeEach
	void setUp() throws Exception {
		little_duck = new Duck();
		harry = new Dog();
	}

	@Test
	void testDuckQuack() {
		Assert.assertEquals("Quack quack!", little_duck.quack());
	}
	@Test
	void testDuckFly() {
		Assert.assertEquals("I am flying", little_duck.fly());
	}
	@Test
	void testDogBark() {
		Assert.assertEquals("woof!", harry.bark("Pudel"));
		Assert.assertEquals("WOOF!", harry.bark("Labrador"));
		Assert.assertEquals("woof woof!", harry.bark("Cocker"));
	}

}
```

The @Test sections of code will do a comparison with the expected result and the actual result from the methods.

When you execute the JUnit Test AnimalTest.java, you will notice that the method fly() from duck is actually making the duck swim.

<a name="h2"/>

**Integration Testing:**

<a name="h3"/>

**USEFUL LINKS**

**Software testing general information:**

https://en.wikipedia.org/wiki/Software_testing

**Unit Testing:**

https://en.wikipedia.org/wiki/Unit_testing

**How to write an Unit test in Java + Eclipse + Junit:**

https://stackoverflow.com/questions/8751553/how-to-write-a-unit-test

**Full Junit documentation:**

https://junit.org/junit5/docs/current/user-guide/