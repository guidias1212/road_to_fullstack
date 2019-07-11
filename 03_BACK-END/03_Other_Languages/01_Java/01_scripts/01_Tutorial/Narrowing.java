/*
Narrowing Casting (manually) - converting a larger type to a smaller size type:
double -> float -> long -> int -> char -> short -> byte
*/

public class Narrowing {
  public static void main(String[] args) {
    double myDouble = 9.78;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}