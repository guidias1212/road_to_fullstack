//This is a script to test the If...Else statements.

class IfElseTests {
  public static void main(String[] args){
	
	//If...Else If... Else Statements:
	int time = 22;
	if (time < 10) {
		System.out.println("Good morning.");
	} else if (time < 20) {
		System.out.println("Good day.");
	} else {
		System.out.println("Good evening.");
	}
	// Outputs "Good evening."
	  
	
	//Short Hand If...Else (Ternary Operator):
	//variable = (condition) ? expressionTrue : expressionFalse;
	//Example:
	time = 20;
	String result = (time < 18) ? "Good day." : "Good evening.";
	System.out.println(result);
	
  }
}