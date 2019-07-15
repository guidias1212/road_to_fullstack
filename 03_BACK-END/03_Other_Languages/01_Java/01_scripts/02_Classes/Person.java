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