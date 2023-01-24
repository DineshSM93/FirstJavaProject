package testNG;

import org.testng.annotations.Test;

public class settingPriority {

	@Test(priority = 0)
	public void firstTestCase() {
		System.out.println("This is First Test Case");
	}

	@Test(priority = 1)
	public void secondTestCase() {
		System.out.println("This is Second Test Case");
	}

	@Test(priority = 2)
	public void thirdTestCase() {
		System.out.println("This is Third Test Case");
	}

	@Test(priority = 3)
	public void fourthTestCase() {
		System.out.println("This is Fourth Test Case");
	}

	@Test(priority = 4)
	public void fifthTestCase() {
		System.out.println("This is Fifth Test Case");
	}

}
