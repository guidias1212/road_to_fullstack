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