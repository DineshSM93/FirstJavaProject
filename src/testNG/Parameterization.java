package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	@Test
	@Parameters("Name")
	public void printname(String naame) {
		System.out.println("Entered name is " + naame);
	}

}
