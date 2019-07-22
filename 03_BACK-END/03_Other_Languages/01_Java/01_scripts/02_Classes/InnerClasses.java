//This is a script to test inner classes.

class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;
  }
}

public class InnerClasses {
  public static void main(String[] args) {
	  
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
	
  }
}