package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	 String name = "Dinesh";
	// boolean value = true;
	
	@Test
	public void checkEqual() {
		 Assert.assertEquals(name, "Dinesh");
		// Assert.assertTrue(value);
	}
} 
