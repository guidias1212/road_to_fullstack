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