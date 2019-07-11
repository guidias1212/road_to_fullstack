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

* double slashes:
```
//This is a simple comment line.
```

* C-style:
```
/* These are
C-style comments
*/
```

* Doc Comments:
```
/** This class displays a text string at
*  the console.
*/
```

**Variables:**

* **String:** Stores text, such as "Hello". String values are surrounded by double quotes
* **int:** Stores integers (whole numbers), without decimals, such as 123 or -123
* **float:** Stores floating point numbers, with decimals, such as 19.99 or -19.99
* **char:** Stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
* **boolean:** Stores values with two states: true or false

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

* Widening Casting:
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

* Narrowing Casting:
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

* Arithmetic Operators:

| Operator | Name | Description | Example |
| --- | --- | --- | --- | --- |
| + | Addition | Adds together two values | x + y |
| - | Subtraction | Subtracts one value from another | x - y |
| * | Multiplication | Multiplies two values | x * y|
| / | Division | Divides one value from another | x / y |
| % | Modulus | Returns the division remainder | x % y |
| ++ |Increment |Increases the value of a variable by 1 | ++x |
| -- | Decrement | Decreases the value of a variable by 1 | --x |


* Assignment Operators:

| Operator | Example | Same As |
| --- | --- | --- |
| = | x = 5 | x = 5 |
| += | x += 3 | x = x + 3 |
| -= | x -= 3 | x = x - 3 |
| *= | x *= 3 | x = x * 3 |
| /= | x /= 3 | x = x / 3 |
| %= | x %= 3 |x = x % 3 |
| &= | x &= 3 | x = x & 3 |
| |= | x |= 3 | x = x | 3 |
| ^= | x ^= 3 | x = x ^ 3 |
| >>= | x >>= 3 | x = x >> 3 |
| <<= | x <<= 3 | x = x << 3 |


* Comparison Operators:

| Operator | Name | Example |
| --- | --- | --- |
| == | Equal to | x == y |
| != | Not equal | x != y |
| > | Greater than | x > y |
| < | Less than | x < y |
| >= | Greater than or equal to | x >= y |
| <= | Less than or equal to | x <= y |


* Logical Operators:

| Operator | Name | Description | Example |
| --- | --- | --- | --- |
| && | Logical and | Returns true if both statements are true | x < 5 &&  x < 10 |
| || | Logical or | Returns true if one of the statements is true | x < 5 || x < 4 |
| ! | Logical not | Reverse the result, returns false if the result is true | !(x < 5 && x < 10) |


**USEFULL LINKS**

**Local Java Setup**

https://www.oracle.com/technetwork/java/javase/overview/index-jsp-138218.html

**Java Tutorial and Documentation**

https://www.w3schools.com/java/default.asp

**Adding a path to system environment variables (Windows 10)**

https://www.architectryan.com/2018/03/17/add-to-the-path-on-windows-10/

**History**

https://en.wikipedia.org/wiki/Java_(programming_language)


**Java Tutorials**

https://www.oracle.com/technetwork/java/index-138747.html

