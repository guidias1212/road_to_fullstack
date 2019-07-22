//This is a script to test HashMaps.

//Import the HashMap class:
import java.util.HashMap; 

class HashMapTests {
	public static void main(String[] args) {
	  
		//Create HashMap:
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		//Add keys and values (Country, City):
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println("Hash Map:");
		System.out.println(capitalCities); 
		
		//Access an item:
		System.out.println("Access an item:");
		System.out.println(capitalCities.get("Germany")); 
		
		//Remove an item:
		System.out.println("Remove an item:");
		capitalCities.remove("England");
		System.out.println(capitalCities);

	}
}