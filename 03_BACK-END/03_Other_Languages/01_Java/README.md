# 3.3.1) JAVA

Java is a general-purpose programming language that is class-based, object-oriented (although not a pure OO language, as it contains primitive types), and designed to have as few implementation dependencies as possible. It is intended to let application developers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation. Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but it has fewer low-level facilities than either of them. As of 2018, Java was one of the most popular programming languages in use according to GitHub, particularly for client-server web applications, with a reported 9 million developers.

Java programs are run (or interpreted) by another program called the Java VM. Rather than running directly on the native operating system, the program is interpreted by the Java VM for the native operating system. This means that any computer system with the Java VM installed can run Java programs regardless of the computer system on which the applications were originally developed.

### Getting Started

**Writing a Program:**

The easiest way to write a simple program is with a text editor. So, using the text editor of your choice, create a text file with the following text, and be sure to name the text file ExampleProgram.java. Java programs are case sensitive, so if you type the code in yourself, pay particular attention to the capitalization.
```
//A Very Simple Example
class ExampleProgram {
  public static void main(String[] args){
    System.out.println("I'm a Simple Program");
  }
}
```

**Compiling the Program:**

A program has to be converted to a form the Java VM can understand so any computer with a Java VM can interpret and run the program. Compiling a Java program means taking the programmer-readable text in your program file (also called source code) and converting it to bytecodes, which are platform-independent instructions for the Java VM.

The Java compiler is invoked at the command line on Unix and DOS shell operating systems as follows:
```
 javac ExampleProgram.java
 
 *Obs: In order to execute commands on the CMD, add the java binary installation path to your system environment variables (See USEFULL LINKS section).
```

**Interpreting and Running the Program:**

Once your program successfully compiles into Java bytecodes, you can interpret and run applications on any Java VM, or interpret and run applets in any Web browser with a Java VM built in such as Netscape or Internet Explorer. Interpreting and running a Java program means invoking the Java VM byte code interpreter, which converts the Java byte codes to platform-dependent machine codes so your computer can understand and run the program.

The Java interpreter is invoked at the command line on Unix and DOS shell operating systems as follows:
```
java ExampleProgram

*Obs: You might need to change the working directory in order to make this command work (cd my\working\directory\is\here).
```

At the command line, you should see:
```
I'm a Simple Program
```

### Java Coding

**The main Method:**

Every Java program has a **class** name which must match the filename, and that every program must contain the main() method:

```
public static void main(String[] args) {
  //Your code here!
}
```

**Print:**

Print a line of text to the screen:
```
System.out.println("Hello World");
```

**Comments:**

The Java language supports three kinds of comments: double slashes, C-style, and Doc Comments:

* **double slashes:**
```
//This is a simple comment line.
```

* **C-style:**
```
/* These are
C-style comments
*/
```

* **Doc Comments:**
```
/** This class displays a text string at
*  the console.
*/
```

**Variables:**

* **String:** Stores text, such as "Hello". String values are surrounded by double quotes.
* **int:** Stores integers (whole numbers), without decimals, such as 123 or -123.
* **float:** Stores floating point numbers, with decimals, such as 19.99 or -19.99.
* **char:** Stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes.
* **boolean:** Stores values with two states: true or false.

To create a variable, you must specify the type and assign it a value:
```
String myText = "Hello";
int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
```

**Data Types:**

Data types are divided into two groups:

* **Primitive data types:** Includes byte, short, int, long, float, double, boolean and char.
* **Non-primitive data types:** Such as String, Arrays and Classes.

**Primitive Data Types:**

| **Data Type** | **Size** | **Description** |
| --- | --- | --- |
| **byte** | 1 byte | Stores whole numbers from -128 to 127 |
| **short** | 2 bytes | Stores whole numbers from -32,768 to 32,767 |
| **int** | 4 bytes | Stores whole numbers from -2,147,483,648 to 2,147,483,647 |
| **long** | 8 bytes | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| **float** | 4 bytes | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits |
| **double** | 8 bytes | Stores fractional numbers. Sufficient for storing 15 decimal digits |
| **boolean** | 1 bit | Stores true or false values |
| **char** | 2 bytes | Stores a single character/letter or ASCII values |

**Data Type Casting:**

Type casting is when you assign a value of one primitive data type to another type.

* **Widening Casting:**
```
/*
Widening Casting (automatically) - converting a smaller type to a larger type size:
byte -> short -> char -> int -> long -> float -> double
*/

public class MyClass {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
  }
}
```

* **Narrowing Casting:**
```
/*
Narrowing Casting (manually) - converting a larger type to a smaller size type:
double -> float -> long -> int -> char -> short -> byte
*/

public class MyClass {
  public static void main(String[] args) {
    double myDouble = 9.78;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}
```

**Operators:**

Operators are used to perform operations on variables and values.

* **Arithmetic Operators**:

| **Operator** | **Name** | **Description** | **Example** |
| --- | --- | --- | --- |
| + | Addition | Adds together two values | x + y |
| - | Subtraction | Subtracts one value from another | x - y |
| * | Multiplication | Multiplies two values | x * y|
| / | Division | Divides one value from another | x / y |
| % | Modulus | Returns the division remainder | x % y |
| ++ |Increment |Increases the value of a variable by 1 | ++x |
| -- | Decrement | Decreases the value of a variable by 1 | --x |


* **Assignment Operators**:

| **Operator** | **Example** | **Same As** |
| --- | --- | --- |
| = | x = 5 | x = 5 |
| += | x += 3 | x = x + 3 |
| -= | x -= 3 | x = x - 3 |
| *= | x *= 3 | x = x * 3 |
| /= | x /= 3 | x = x / 3 |
| %= | x %= 3 |x = x % 3 |
| &= | x &= 3 | x = x & 3 |
| \|= | x \|= 3 | x = x \| 3 |
| ^= | x ^= 3 | x = x ^ 3 |
| >>= | x >>= 3 | x = x >> 3 |
| <<= | x <<= 3 | x = x << 3 |


* **Comparison Operators**:

| **Operator** | **Name** | **Example** |
| --- | --- | --- |
| == | Equal to | x == y |
| != | Not equal | x != y |
| > | Greater than | x > y |
| < | Less than | x < y |
| >= | Greater than or equal to | x >= y |
| <= | Less than or equal to | x <= y |


* **Logical Operators**:

| **Operator** | **Name** | **Description** | **Example** |
| --- | --- | --- | --- |
| && | Logical and | Returns true if both statements are true | x < 5 &&  x < 10 |
| \|\| | Logical or | Returns true if one of the statements is true | x < 5 \|\| x < 4 |
| ! | Logical not | Reverse the result, returns false if the result is true | !(x < 5 && x < 10) |


**String Manipulation:**

A String in Java is actually an object, which contain methods that can perform certain operations on strings:
```
//This is a script to test different string manipulation methods.

class StringManipulation {
  public static void main(String[] args){
	//Declare a string object:
	String txt = "This is a simple String object.";
	System.out.println(txt);
	
	//Show string length:
	System.out.println("The length of the txt string is: " + txt.length());
	
	//Make it upper case (THIS IS A SIMPLE STRING OBJECT.):
	System.out.println(txt.toUpperCase());
	
	//Make it to lower case (this is a simple string object.):
	System.out.println(txt.toLowerCase());
	
	//Find the index (the position) of the first occurrence of a specified text in a string (including whitespace):
	System.out.println(txt.indexOf("is")); // Outputs 2
	
	//String concatenation(1):
	String firstName = "Guilherme";
	String lastName = "Dias";
	System.out.println(firstName + " " + lastName);
	
	//String concatenation(2):
	firstName = "Guilherme";
	lastName = "Dias";
	System.out.println(firstName.concat(lastName));
	
	//Adding numbers and Strings (Java uses the + operator for both addition and concatenation. Numbers are added. Strings are concatenated.):
	String x = "10"; //x is a String
	int y = 20; //y is an integer
	String z = x + y;   // z will be 1020 (a String)
	System.out.println(z);
  }
}
```

* **String Special and Escape Characters:**

| **Escape character** | **Result** | **Description** |
| --- | --- | --- |
| \\' | ' | Single quote |
| \\" | " | Double quote |
| \\\ | \ | Backslash |
| \n | New Line | \- |
| \r | Carriage Return | \- |
| \t | Tab | \- |
| \b | Backspace | \- |
| \f | Form Feed | \- |

**Math Class:**

The Java Math class has many methods that allows you to perform mathematical tasks on numbers:
```
//This is a script to test different Math class methods.

class MathClassTests {
  public static void main(String[] args){
	
	double x;
	 
	//The Math.max(x,y) method can be used to find the highest value of x and y:
	x = Math.max(5.0, 10.0);
	System.out.println(x);
	
	//The Math.min(x,y) method can be used to find the lowest value of of x and y:
	x = Math.min(5.0, 10.0);
	System.out.println(x);
	
	//The Math.sqrt(x) method returns the square root of x:
	x = Math.sqrt(64.0);
	System.out.println(x);
	
	//The Math.abs(x) method returns the absolute (positive) value of x:
	x = Math.abs(-4.7);
	System.out.println(x);
	
	//Math.random() returns a random number between 0 (inclusive), and 1 (exclusive):
	x = Math.random();
	System.out.println(x);
  }
}
```

**If...Else:**

Use the if statement to specify a block of Java code to be executed if a condition is true:
```
//This is a script to test the If...Else statements.

class IfElseTests {
  public static void main(String[] args){
	
	//If...Else If... Else Statements:
	int time = 22;
	if (time < 10) {
		System.out.println("Good morning.");
	} else if (time < 20) {
		System.out.println("Good day.");
	} else {
		System.out.println("Good evening.");
	}
	// Outputs "Good evening."
	  
	
	//Short Hand If...Else (Ternary Operator):
	//variable = (condition) ? expressionTrue : expressionFalse;
	//Example:
	time = 20;
	String result = (time < 18) ? "Good day." : "Good evening.";
	System.out.println(result);
	
  }
}
```

**Switch, break and default:**

Use the switch statement to select one of many code blocks to be executed:
```
//This is a script to make a simple Switch script test.

class SwitchTests {
  public static void main(String[] args){
	int day = 4;
	switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("The day variable was not found, try a number from 1 to 7.");
}

	/*
	OBSERVATION: break
	When Java reaches a break keyword, it breaks out of the switch block.
	This will stop the execution of more code and case testing inside the block.
	When a match is found, and the job is done, it's time for a break. There is no need for more testing.
	
	OBSERVATION: default
	The default keyword specifies some code to run if there is no case match.
	*/
  }
}
```


**While loop:**

The while loop loops through a block of code as long as a specified condition is true:
```
//This is a script to test the While loop.

class WhileLoop {
  public static void main(String[] args){
    //In the example below, the code in the loop will run, over and over again, as long as a variable (i) is less than 5:
	int i = 0;
	while (i < 5) {
		System.out.println(i);
		i++;
	}
	
	
	//The example below uses a do/while loop. The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:
	i = 0;
	do {
		System.out.println(i);
		i++;
	}
	while (i < 5);
	
  }
}
```

**For Loop:**

When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:
```
//This is a script to test the for loop.

class ForLoop {
  public static void main(String[] args){
    
	//Example 1:
	System.out.println("This is the output of Example 1:");
	for (int i = 0; i < 5; i++) {
		System.out.println(i);
	}
	
	//Example 2:
	System.out.println("This is the output of Example 2:");
	for (int i = 0; i <= 10; i = i + 2) {
		System.out.println(i);
	}
	
	//Example 3 (For-each loop):
	System.out.println("This is the output of Example 3:");
	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	for (String i : cars) {
		System.out.println(i);
	}
	
	//Example 4 (continue):
	System.out.println("This is the output of Example 4:");
	for (int i = 0; i < 10; i++) {
		if (i == 4) {
			continue;
		}
		System.out.println(i);
	}
	//The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop. This example skips the value of 4.
  }
}
```

**Arrays:**

Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value:
```
//This is a script to test Arrays.

class ArrayTests {
  public static void main(String[] args){
    //To declare an array, define the variable type with square brackets:
	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	
	//To create an array of integers, you could write:
	int[] myNum = {10, 20, 30, 40};
	
	//You access an array element by referring to the index number:
	System.out.println(cars[0]);
	System.out.println(myNum[2]);
	
	//To change the value of a specific element, refer to the index number:
	cars[0] = "Opel";
	System.out.println(cars[0]);
	
	//To find out how many elements an array has, use the length property:
	System.out.println(cars.length);
	
	//Loop Through an Array:
	for (int i = 0; i < cars.length; i++) {
		System.out.println(cars[i]);
	}
	
	//Loop Through an Array with For-Each:
	for (String i : cars) {
		System.out.println(i);
	}
	
	//A multidimensional array is an array containing one or more arrays:
	int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
	int x = myNumbers[1][2];
	System.out.println(x);
	
	//Loop through a multidimensional array:
	for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
	
  }
}
```

**Exceptions:**

When executing Java code, different errors can occur: coding errors made by the programmer, errors due to wrong input, or other unforeseeable things. When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Java will throw an exception (throw an error):
```
//This is a script to test Exceptions.

class ExceptionTests {
  public static void main(String[] args){
	//If an error occurs, we can use try...catch to catch the error and execute some code to handle it:
    try {
		//Block of code to try:
		int[] myNumbers = {1, 2, 3};
		System.out.println(myNumbers[10]);
		
    } catch (Exception e) {
		//Block of code to handle errors:
		System.out.println("Something went wrong.");
		
    } finally {
		//The finally statement lets you execute code, after try...catch, regardless of the result:
		System.out.println("The 'try catch' is finished.");
    }
  }
}
```

**Custom Exception Throw:**

The throw statement allows you to create a custom error.
```
//This is a script to test Custom Exceptions Throws.

class ExceptionThrowTests {
	/*
	The throw statement is used together with an exception type. There are many exception types available in Java: ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc.
	*/
	static void checkAge(int age) { 
		if (age < 18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old."); 
		}
		else {
			System.out.println("Access granted - You are old enough!"); 
		}
	} 
	
  public static void main(String[] args){
	checkAge(15); // Set age to 15 (which is below 18...)
  }
}
```

**Methods:**

A method is a block of code which only runs when it is called. You can pass data, known as parameters, into a method. Methods are used to perform certain actions, and they are also known as functions.

Syntax:

* **myMethod(int par1, String par2):** Name of the method, accepting parameters 1 (integer) and 2 (String)
* **static** means that the method belongs to the MyClass class and not an object of the MyClass class.
* **void** means that this method does not have a return value.
```
//This is a script to test Java Methods.

class Methods {
	//Method 1 (No return, no parameters):
	static void myMethod_1() {
		System.out.println("Just executed method 1.");
	}
	
	//Method 2 (No return, 1 parameter):
	static void myMethod_2(String arg1) {
		System.out.println("Argument received: " + arg1);
	}
	
	//Method 3 (With return, 2 parameters):
	static int myMethod_3(int x, int y) {
		int z = x + y - 5;
		return z;
	}
	
  public static void main(String[] args){
	//Call method 1:
	myMethod_1();
	//Call method 2:
	myMethod_2("Testing Argument");
	//Call method 3:
	int response = myMethod_3(7, 3);
	System.out.println("Return from method 3: " + response);
  }
}
```

**Classes and Objects:**

Java is an object-oriented programming language.

Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.
```
//This is a script to test Classes and Object creation in Java

//To create a class, use the keyword class:
public class MyFirstClass {
  int x = 5;
  
  public static void main(String[] args) {
	//Create an object called "myObject_1" and print the value of x:
	MyFirstClass myObject_1 = new MyFirstClass();
	System.out.println(myObject_1.x);
	
	//Create an object called "myObject_2" and print the value of x:
	MyFirstClass myObject_2 = new MyFirstClass();
	System.out.println(myObject_2.x);
  } 
}
```

**Using Multiple Classes:**

Create an object of a class and access it in another class.

- Create two files in the same directory/folder:

* MyClass.java
* OtherClass.java

This is often used for better organization of classes (one class has all the attributes and methods, while the other class holds the main() method (code to be executed)).

MyClass.java:
```
//File MyClass.java

public class MyClass {
  int x = 5;
}
```

OtherClass.java:
```
//File OtherClass.java

public class OtherClass {
  public static void main(String[] args) {
	  
	MyClass myObject = new MyClass();
	System.out.println(myObject.x);
	
  } 
}
```

**Class Attributes:**

Class attributes are variables within a class.
```
//This is a script to test class attributes.

public class Dog {
	//Attribute 1 (name):
	String name = "Harry"; 
	
	//Attribute 2 (fur size):
	int furSize = 5; 
	
	//If you don't want the ability to override existing values, declare the attribute as final:
	//Attribute 3 (color):
	final String color = "White"; 
	
	public static void main(String[] args) {
		
		//Accessing Attributes:
		Dog dog_1 = new Dog();
		System.out.println(dog_1.name);
		System.out.println(dog_1.furSize);
		System.out.println(dog_1.color);
		
		//Modifying Attributes:
		dog_1.name = "Harryson";
		System.out.println(dog_1.name);
		dog_1.furSize = 6;
		System.out.println(dog_1.furSize);
  }
} 
```

**Class Methods:**

Methods are used to perform certain actions.
```
//This is a script to test methods in Java

//To create a class, use the keyword class:
public class Bird {
  
  //static method creation: 
  //Can be accessed without creating an object of the class:
  static void fly(){
	  System.out.println("I am flying!!");
  }
  
  //public method creation: 
  //Needs an object of the class to be accessed:
  public void eat(){
	  System.out.println("I am eating now...");
  }
  
  
  //Method with argument:
  public String sing(String birdType){
	  if (birdType == "duck"){
		  return "Quack! Quack!";
	  } else {
		  return "Pew pew!";
	  }
  }
  
  
  public static void main(String[] args) {
	  
	  //static method calling:
	  fly();
	  
	  //public method calling:
	  Bird dave = new Bird();
	  dave.eat();
	  
	  //Passing arguments to methods:
	  System.out.println(dave.sing("duck"));
	  System.out.println(dave.sing("not a duck"));
	
  } 
}
```

**Class Constructors:**

A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created.
```
//Script to test Class constructors.

public class ClassConstructor {
  //Define class attributes:
  int attribute_1;
  String attribute_2;

  //This method will be called when the object is created:
  public ClassConstructor(int attr_1, String attr_2) {
    attribute_1 = attr_1;
    attribute_2 = attr_2;
  }

  public static void main(String[] args) {
	//Create the object passing constructor arguments:
    ClassConstructor myObject = new ClassConstructor(1969, "Mustang");
    System.out.println(myObject.attribute_1 + " " + myObject.attribute_2);
  }
}
```

**Modifiers:**

* **Access Modifiers** - Controls the access level:

For Classes:

| **Modifier** | **Description** |
| --- | --- |
| public | The class is accessible by any other class. |
| default | The class is only accessible by classes in the same package. This is used when you don't specify a modifier. |

For attributes, methods and constructors:

| **Modifier** | **Description** |
| --- | --- |
| public | 	The code is accessible for all classes. |
| private | The code is only accessible within the declared class. |
| default | The code is only accessible in the same package. This is used when you don't specify a modifier. |
| protected | The code is accessible in the same package and subclasses. |

* **Non-Access Modifiers** - Do not control access level, but provides other functionality:

For Classes:

| **Modifier** | **Description** |
| --- | --- |
| final | The class cannot be inherited by other classes. |
| abstract | The class cannot be used to create objects. |

For attributes, methods and constructors:

| **Modifier** | **Description** |
| --- | --- |
| final | 	Attributes and methods cannot be overridden/modified. |
| static | Attributes and methods belongs to the class, rather than an object. |
| abstract | Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from). |
| transient | Attributes and methods are skipped when serializing the object containing them. |
| synchronized | Methods can only be accessed by one thread at a time. |
| volatile | The value of an attribute is not cached thread-locally, and is always read from the "main memory". |

**Encapsulation:**

The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

* Declare class variables/attributes as private (only accessible within the same class).
* Provide public setter and getter methods to access and update the value of a private variable.
```
//Script to test encapsulation.

public class Person {
	// private = restricted access
	private String name; 

	// Getter
	public String getName() {
		return name;
	}

	// Setter
	public void setName(String newName) {
		//The `this` keyword is used to refer to the current object.
		this.name = newName;
	}
	
	public static void main(String[] args) {
		Person myObj = new Person();
		
		//Set the value of the name variable to "John"
		myObj.setName("John");
		System.out.println(myObj.getName());

	}
}
```

Why Encapsulation?
- Better control of class attributes and methods.
- Class variables can be made read-only (if you omit the set method), or write-only (if you omit the get method).
- Flexible: the programmer can change one part of the code without affecting other parts
Increased security of data.

**Java Packages:**

A package in Java is used to group related classes. 

General packages import syntax:
```
import package.name.Class; // Import a single class 
import package.name.*; // Import the whole package
```

Think of package as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

* Built-in Packages (packages from the Java API): The Java API is a library of prewritten classes, that are free to use, included in the Java Development Environment:
```
import java.util.Scanner;

class UserInput {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine(); 
    System.out.println("Username is: " + userName); 
  }
}
```

* User-defined Packages (create your own packages):

To create your own package, Java uses a file system directory to store them. Just like folders on the computer:

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/java_package_structure.png)

To create a package, use the package keyword:
```
//File MyPackageClass.java
//Testing Java package creation

package mypack;

class MyPackageClass { 
  public static void main(String[] args) { 
    System.out.println("This is my package!"); 
  } 
}
```
Save the file as MyPackageClass.java, and compile it:
```
C:\Users\Your Name>javac MyPackageClass.java
```

Then compile the package:
```
C:\Users\Your Name>javac -d . MyPackageClass.java
```

This forces the compiler to create the "mypack" package.

The -d keyword specifies the destination for where to save the class file. You can use any directory name, like c:/user (windows), or, if you want to keep the package within the same directory, you can use the dot sign ".", like in the example above.

Note: The package name should be written in lower case to avoid conflict with class names.

To run the MyPackageClass.java file, write the following:
```
C:\Users\Your Name>java mypack.MyPackageClass
```

The output will be:
```
This is my package!
```

**Inheritance (Subclass and Superclass)**

In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

* **subclass (child):** The class that inherits from another class.
* **superclass (parent):** The class being inherited from.

To inherit from a class, use the extends keyword:
```
//This is a script to test class inheritance.

class Vehicle {
  protected String brand = "Ford";         // Vehicle attribute
  public void honk() {                     // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";    // Car attribute
  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName); 
  }
}
```

**Polymorphism:**

Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

For example, think of a superclass called Animal that has a method called animalSound(). Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.):
```
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class AnimalMainClass {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object

    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}
```

**Inner Classes:**

In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.

To access the inner class, create an object of the outer class, and then create an object of the inner class:
```
//This is a script to test inner classes.

class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;
  }
}

public class InnerClasses {
  public static void main(String[] args) {
	  
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
	
  }
}

//*OBS.: Unlike a "regular" class, an inner class can be private or protected. If you don't want outside objects to access the inner class, declare the class as private.
```

**Abstraction:**

Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces.
```
//Script to test abstraction.

// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class AbstractionMain {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```

**Interfaces:**

An interface is a completely "abstract class" that is used to group related methods with empty bodies:
```
//Script to test Java interfaces.

interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

// DemoClass "implements" FirstInterface and SecondInterface
class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}

class MainClassInterfaces {
  public static void main(String[] args) {
	  
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
	
  }
}
```
Notes on Interfaces:
* Like abstract classes, interfaces cannot be used to create objects.
* Interface methods do not have a body - the body is provided by the "implement" class.
* On implementation of an interface, you must override all of its methods.
* Interface methods are by default abstract and public.
* Interface attributes are by default public, static and final.
* An interface cannot contain a constructor (as it cannot be used to create objects).

Why And When To Use Interfaces?

* To achieve security - hide certain details and only show the important details of an object (interface).

* Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. To implement multiple interfaces, separate them with a comma.

**Enums:**

An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:

```
//Script to test enums.

public class EnumMain { 

  //Create the enum:
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) { 
	
	//Calling the enum:
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar); 
	
	//Calling enum on a swicth/case:
	switch(myVar) {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
         System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;
    }
	
	//Loop through an enum:
	for (Level myVar_2 : Level.values()) {
		System.out.println(myVar_2);
	}
  } 
}
```

Why And When To Use Enums?

- Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.

**User Input - Types:**

The `Scanner` class is used to get user input, and it is found in the `java.util` package.

* Input Types:

| **Method** | **Description** |
| --- | --- |
| nextBoolean() | Reads a boolean value from the user |
| nextByte() | Reads a byte value from the user |
| nextDouble() | Reads a double value from the user |
| nextFloat() | Reads a float value from the user |
| nextInt() | Reads a int value from the user |
| nextLine() | Reads a String value from the user |
| nextLong() | Reads a long value from the user |
| nextShort() | Reads a short value from the user |

**Date and Time:**

Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API. The package includes many date and time classes.
```
//Script to test date and time in Java

//Import the LocalDate class:
import java.time.LocalDate; 
//Import the LocalTime class:
import java.time.LocalTime;
//Import the LocalDateTime class:
import java.time.LocalDateTime;
//Import the DateTimeFormatter class
import java.time.format.DateTimeFormatter;

public class DateTimeTests { 
  public static void main(String[] args) { 
	
	//DATE
	//Create a date object:
    LocalDate dateObj = LocalDate.now();
	//Display the current date:
	System.out.println("Date:"); 
    System.out.println(dateObj);
	
	//TIME
	//Create a time object:
	LocalTime timeObj = LocalTime.now();
	//Display the current time:
	System.out.println("Time:"); 
    System.out.println(timeObj);
	
	//DATETIME
	//Create a datetime object:
	LocalDateTime datetimeObj = LocalDateTime.now();
	//Display the current datetime:
	System.out.println("DateTime:"); 
    System.out.println(datetimeObj);
	
	
	//DATETIME Formatting
	//Create a datetime object:
	LocalDateTime datetimeObj2 = LocalDateTime.now(); 
    System.out.println("Before formatting: " + datetimeObj2); 
	//Create a format pattern object:
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
	//Format previous datetime object:
    String formattedDateTime = datetimeObj2.format(myFormatObj); 
    System.out.println("After formatting: " + formattedDateTime); 
	
  } 
}
```

**Array List:**

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:
```
//This is a script to test array lists.

//Import the ArrayList class:
import java.util.ArrayList;
//Import the Collections class:
import java.util.Collections;

public class ArrayListTests {
	public static void main(String[] args) {
		
	//Create an ArrayList object:
	ArrayList<String> cars = new ArrayList<String>();
	
	//Add items:
	System.out.println("Adding items to array:");
	cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
	
	//Access an item:
	System.out.println("Access second item:");
	System.out.println(cars.get(1));
	
	//Change an item:
	cars.set(1, "Opel");
	System.out.println("Change second item:");
	System.out.println(cars);
	
	//Remove an item:
	cars.remove(1);
	System.out.println("Remove second item:");
	System.out.println(cars);
	
	//Remove all items:
	cars.clear();
	System.out.println("Remove all items:");
	System.out.println(cars);
	
	//Check ArrayList size:
	System.out.println("The array size is:");
	System.out.println(cars.size());
	
	//Working with numbers:
	ArrayList<Integer> vectorA = new ArrayList<Integer>();
	vectorA.add(33);
	vectorA.add(13);
	vectorA.add(32);
	vectorA.add(5);
	System.out.println("Vector A:");
	System.out.println(vectorA);
	
	ArrayList<Integer> vectorB = new ArrayList<Integer>();
	vectorB.add(3);
	vectorB.add(1);
	vectorB.add(9);
	vectorB.add(32);
	System.out.println("Vector B:");
	System.out.println(vectorB);
	
	//Concatenating two arrays:
	vectorB.addAll(vectorA);
	System.out.println("Vector B after add Vector A:");
	System.out.println(vectorB);
	
	//Sorting array:
	Collections.sort(vectorB);
	System.out.println("Vector B after sorting:");
	System.out.println(vectorB);
  }
} 
```

**HashMap:**

One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values:
```
//This is a script to test HashMaps.

//Import the HashMap class:
import java.util.HashMap; 

class HashMapTests {
	public static void main(String[] args) {
	  
		//Create HashMap:
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		//Add keys and values (Country, City):
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println("Hash Map:");
		System.out.println(capitalCities); 
		
		//Access an item:
		System.out.println("Access an item:");
		System.out.println(capitalCities.get("Germany")); 
		
		//Remove an item:
		System.out.println("Remove an item:");
		capitalCities.remove("England");
		System.out.println(capitalCities);

	}
}
```

**Wrapper Classes:**

Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

| **Primitive Data Type** | **Wrapper Class** |
| --- | --- |
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| boolean | Boolean |
| char | Character |

Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects).

An useful method is the toString() method, which is used to convert wrapper objects to strings.

**Files:**

The File class from the java.io package, allows us to work with files.

| **Method** | **Type** | **Description** |
| --- | --- | --- |
| canRead() | Boolean | Tests whether the file is readable or not |
| canWrite() | Boolean | Tests whether the file is writable or not |
| createNewFile() | Boolean | Creates an empty file |
| delete() | Boolean | Deletes a file |
| exists() | Boolean | Tests whether the file exists |
| getName() | String | Returns the name of the file |
| getAbsolutePath() | String | Returns the absolute pathname of the file |
| length() | Long | Returns the size of the file in bytes |
| list() | String[] | Returns an array of the files in the directory |
| mkdir() | Boolean | Creates a directory |

To use the File class, create an object of the class, and specify the filename or directory name:
```
//Script to test working with Files.

//Import the File class:
import java.io.File;
//Import the FileWriter class:
import java.io.FileWriter;
//Import the Scanner class to read text files:
import java.util.Scanner; 
//Import the IOException class to handle errors:
import java.io.IOException;
//Import this class to handle errors:
import java.io.FileNotFoundException;  


public class FilesTests { 
  public static void main(String[] args) { 
  
	//Creating a file:
	File myObj = new File("test_file.txt"); 
    try { 
      if (myObj.createNewFile()) { 
        System.out.println("File created: " + myObj.getName()); 
      } else { 
        System.out.println("File already exists."); 
      } 
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace(); 
    }

	//Get File Information:
	if (myObj.exists()) {
      System.out.println("File name: " + myObj.getName()); 
      System.out.println("Absolute path: " + myObj.getAbsolutePath()); 
      System.out.println("Writeable: " + myObj.canWrite()); 
      System.out.println("Readable " + myObj.canRead()); 
      System.out.println("File size in bytes " + myObj.length());
    } else {
      System.out.println("The file does not exist.");
    }

	//Write to a File:
	try { 
      FileWriter myWriter = new FileWriter("test_file.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
	
	//Read a File:
	try {
      Scanner myReader = new Scanner(myObj); 
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  } 
}
```

There are many available classes in the Java API that can be used to read and write files in Java: FileReader, BufferedReader, Files, Scanner, FileInputStream, FileWriter, BufferedWriter, FileOutputStream, etc. Which one to use depends on the Java version you're working with and whether you need to read bytes or characters, and the size of the file/lines etc.

**USEFULL LINKS**

**Local Java Setup:**

https://www.oracle.com/technetwork/java/javase/overview/index-jsp-138218.html

**Java Tutorial and Documentation:**

https://www.w3schools.com/java/default.asp

**Adding a path to system environment variables (Windows 10):**

https://www.architectryan.com/2018/03/17/add-to-the-path-on-windows-10/

**History:**

https://en.wikipedia.org/wiki/Java_(programming_language)


**Java Tutorials:**

https://www.oracle.com/technetwork/java/index-138747.html

**Java API:**

https://docs.oracle.com/javase/8/docs/api/