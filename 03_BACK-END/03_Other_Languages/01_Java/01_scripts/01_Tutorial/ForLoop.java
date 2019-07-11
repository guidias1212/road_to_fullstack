//This is a script to test the for loop.

class ForLoop {
  public static void main(String[] args){
    
	//Example 1:
	System.out.println("This is the output of Example 1:");
	for (int i = 0; i < 5; i++) {
		System.out.println(i);
	}
	
	//Example 2:
	System.out.println("This is the output of Example 2:");
	for (int i = 0; i <= 10; i = i + 2) {
		System.out.println(i);
	}
	
	//Example 3 (For-each loop):
	System.out.println("This is the output of Example 3:");
	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	for (String i : cars) {
		System.out.println(i);
	}
	
	//Example 4 (continue):
	System.out.println("This is the output of Example 4:");
	for (int i = 0; i < 10; i++) {
		if (i == 4) {
			continue;
		}
		System.out.println(i);
	}
	//The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop. This example skips the value of 4.
  }
}