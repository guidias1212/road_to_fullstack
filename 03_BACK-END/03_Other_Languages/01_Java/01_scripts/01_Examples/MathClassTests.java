//This is a script to test different Math class methods.

class MathClassTests {
  public static void main(String[] args){
	
	double x;
	 
	//The Math.max(x,y) method can be used to find the highest value of x and y:
    x = Math.max(5.0, 10.0);
	System.out.println(x);
	
	//The Math.min(x,y) method can be used to find the lowest value of of x and y:
	x = Math.min(5.0, 10.0);
	System.out.println(x);
	
	//The Math.sqrt(x) method returns the square root of x:
	x = Math.sqrt(64.0);
	System.out.println(x);
	
	//The Math.abs(x) method returns the absolute (positive) value of x:
	x = Math.abs(-4.7);
	System.out.println(x);
	
	//Math.random() returns a random number between 0 (inclusive), and 1 (exclusive):
	x = Math.random();
	System.out.println(x);
  }
}