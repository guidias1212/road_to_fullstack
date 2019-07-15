//Script to test Class constructors.

public class ClassConstructor {
  //Define class attributes:
  int attribute_1;
  String attribute_2;

  //This method will be called when the object is created:
  public ClassConstructor(int attr_1, String attr_2) {
    attribute_1 = attr_1;
    attribute_2 = attr_2;
  }

  public static void main(String[] args) {
	//Create the object passing constructor arguments:
    ClassConstructor myObject = new ClassConstructor(1969, "Mustang");
    System.out.println(myObject.attribute_1 + " " + myObject.attribute_2);
  }
}