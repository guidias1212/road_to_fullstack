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
