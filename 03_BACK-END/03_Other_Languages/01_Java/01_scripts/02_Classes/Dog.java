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