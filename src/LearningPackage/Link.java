package LearningPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
