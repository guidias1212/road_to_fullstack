//This is a script to make a simple Switch script test.

class SwitchTests {
  public static void main(String[] args){
	int day = 4;
	switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("The day variable was not found, try a number from 1 to 7.");
}

	/*
	OBSERVATION: break
	When Java reaches a break keyword, it breaks out of the switch block.
	This will stop the execution of more code and case testing inside the block.
	When a match is found, and the job is done, it's time for a break. There is no need for more testing.
	
	OBSERVATION: default
	The default keyword specifies some code to run if there is no case match.
	*/
  }
}