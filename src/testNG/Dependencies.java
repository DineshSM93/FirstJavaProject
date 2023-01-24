package testNG;

import org.testng.annotations.Test;

public class Dependencies {

	@Test(enabled = true)
	public void firstTestCase() {
		System.out.println("This is First Test case");
	}
	
	@Test(dependsOnMethods = "firstTestCase")
	public void secondTestCase() {
		System.out.println("This is Second Test case");
	}
	
	@Test(dependsOnMethods = "secondTestCase")
	public void thirdTestCase() {
		System.out.println("This is Third Test case");
	}
	
	
}
