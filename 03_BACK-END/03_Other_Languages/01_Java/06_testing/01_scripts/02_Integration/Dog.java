package junit_tests;

public class Dog {
	
	public boolean scare(String target) {
		
		boolean result = false;
		
		if(target == "duck") {
			result = true;
		}
		
		return result;
	}
}
