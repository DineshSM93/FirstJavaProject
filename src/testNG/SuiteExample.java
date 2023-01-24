package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	
	WebDriver driver;
	long starttime;
	@BeforeSuite
	public void openBrowser() {
		starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}
	@Test
	public void openGoogle() {
		driver.get("https://www.google.co.in");
	}
	@Test
	public void openBing() {
		driver.get("https://www.bing.com/");
	}
	@Test
	public void openYahoo() {
		driver.get("https://in.search.yahoo.com/?fr2=inr");
	}
	@AfterSuite
	public void closeBrowser() {
		 driver.quit();
		 long endtime = System.currentTimeMillis();
		long totaltime = endtime - starttime;
		 System.out.println("Total time for execution : " + totaltime );
	}
}
