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