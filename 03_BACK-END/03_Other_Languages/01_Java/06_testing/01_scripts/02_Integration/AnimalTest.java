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
	void testDuckScare() {
		Assert.assertEquals("Run to the hills!!", little_duck.getScared(harry.scare("Duck")));
	}


}
