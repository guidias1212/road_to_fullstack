package junit_tests;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnimalTest {

	Duck little_duck;
	Dog harry;
	
	@BeforeEach
	void setUp() throws Exception {
		little_duck = new Duck();
		harry = new Dog();
	}

	@Test
	void testDuckQuack() {
		Assert.assertEquals("Quack quack!", little_duck.quack());
	}
	@Test
	void testDuckFly() {
		Assert.assertEquals("I am flying", little_duck.fly());
	}
	@Test
	void testDogBark() {
		Assert.assertEquals("woof!", harry.bark("Pudel"));
		Assert.assertEquals("WOOF!", harry.bark("Labrador"));
		Assert.assertEquals("woof woof!", harry.bark("Cocker"));
	}

}