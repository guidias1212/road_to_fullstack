//Script to test enums.

public class EnumMain { 

  //Create the enum:
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) { 
	
	//Calling the enum:
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar); 
	
	//Calling enum on a swicth/case:
	switch(myVar) {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
         System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;
    }
	
	//Loop through an enum:
	for (Level myVar_2 : Level.values()) {
		System.out.println(myVar_2);
	}
  } 
}