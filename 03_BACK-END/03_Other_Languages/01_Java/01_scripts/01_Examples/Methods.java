//This is a script to test Java Methods.

class Methods {
	//Method 1 (No return, no parameters):
	static void myMethod_1() {
		System.out.println("Just executed method 1.");
	}
	
	//Method 2 (No return, 1 parameter):
	static void myMethod_2(String arg1) {
		System.out.println("Argument received: " + arg1);
	}
	
	//Method 3 (With return, 2 parameters):
	static int myMethod_3(int x, int y) {
		int z = x + y - 5;
		return z;
	}
	
  public static void main(String[] args){
	//Call method 1:
	myMethod_1();
	//Call method 2:
	myMethod_2("Testing Argument");
	//Call method 3:
	int response = myMethod_3(7, 3);
	System.out.println("Return from method 3: " + response);
  }
}