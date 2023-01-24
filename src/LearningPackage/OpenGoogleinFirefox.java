package LearningPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleinFirefox {

	public static void main(String[] args) {
		
		// 1. Open Firefox
				System.setProperty("webdriver.gecko.driver", "D:\\FirefoxDriver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				
		// 2. open google home page
				driver.get("https://www.google.co.in/");
				
	    // 3. Close the window
			//	driver.quit();

	}

}
