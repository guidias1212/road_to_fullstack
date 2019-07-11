//This is a script to test Arrays.

class ArrayTests {
  public static void main(String[] args){
    //To declare an array, define the variable type with square brackets:
	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	
	//To create an array of integers, you could write:
	int[] myNum = {10, 20, 30, 40};
	
	//You access an array element by referring to the index number:
	System.out.println(cars[0]);
	System.out.println(myNum[2]);
	
	//To change the value of a specific element, refer to the index number:
	cars[0] = "Opel";
	System.out.println(cars[0]);
	
	//To find out how many elements an array has, use the length property:
	System.out.println(cars.length);
	
	//Loop Through an Array:
	for (int i = 0; i < cars.length; i++) {
		System.out.println(cars[i]);
	}
	
	//Loop Through an Array with For-Each:
	for (String i : cars) {
		System.out.println(i);
	}
	
	//A multidimensional array is an array containing one or more arrays:
	int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
	int x = myNumbers[1][2];
	System.out.println(x);
	
	//Loop through a multidimensional array:
	for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
	
  }
}