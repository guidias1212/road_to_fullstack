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