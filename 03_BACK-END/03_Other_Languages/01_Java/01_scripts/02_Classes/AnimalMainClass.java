//This is a script to test polymorphism.

//Superclass:
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

//Subclass 1:
class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

//Subclass 2:
class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class AnimalMainClass {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object

    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}