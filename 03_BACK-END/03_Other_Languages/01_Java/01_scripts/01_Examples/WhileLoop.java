//This is a script to test the While loop.

class WhileLoop {
  public static void main(String[] args){
    //In the example below, the code in the loop will run, over and over again, as long as a variable (i) is less than 5:
	int i = 0;
	while (i < 5) {
		System.out.println(i);
		i++;
	}
	
	
	//The example below uses a do/while loop. The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:
	i = 0;
	do {
		System.out.println(i);
		i++;
	}
	while (i < 5);
	
  }
}