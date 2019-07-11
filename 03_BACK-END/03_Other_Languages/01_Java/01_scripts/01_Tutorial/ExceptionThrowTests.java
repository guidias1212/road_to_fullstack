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