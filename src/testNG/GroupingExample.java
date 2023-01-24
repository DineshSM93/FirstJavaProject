package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	@Test(groups = {"Apple"})
	public void apple1() {
		System.out.println("Apple Testing 1");
	}

	@Test(groups = {"Apple"})
	public void apple2() {
		System.out.println("Apple Testing 2");
	}

	@Test(groups = {"Samsung"})
	public void samsung1() {
		System.out.println("Samsung Testing 1");
	}

	@Test(groups = {"Samsung"})
	public void samsung2() {
		System.out.println("Samsung Testing 2");
	}

	@Test(groups = {"Vivo"})
	public void vivo1() {
		System.out.println("Vivo Testing 1");
	}

	@Test(groups = {"Vivo"})
	public void vivo2() {
		System.out.println("Vivo Testing 2");
	}
}
