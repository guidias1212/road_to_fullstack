//This is a script to test Exceptions.

class ExceptionTests {
  public static void main(String[] args){
	//If an error occurs, we can use try...catch to catch the error and execute some code to handle it:
    try {
		//Block of code to try:
		int[] myNumbers = {1, 2, 3};
		System.out.println(myNumbers[10]);
		
    } catch (Exception e) {
		//Block of code to handle errors:
		System.out.println("Something went wrong.");
		
    } finally {
		//The finally statement lets you execute code, after try...catch, regardless of the result:
		System.out.println("The 'try catch' is finished.");
    }
  }
}