package seleniumAdvancedConcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");
		
		String parentwindow = driver.getWindowHandle();
		
		// click button to open new window
		WebElement homepage = driver.findElement(By.id("home"));
		homepage.click();
		
	Set<String> allwindows =	driver.getWindowHandles();
	for (String newwindow : allwindows) {
		driver.switchTo().window(newwindow);
		
	}
	
	WebElement editbutton = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
	editbutton.click();
	Thread.sleep(3000);
	driver.close();
	
	driver.switchTo().window(parentwindow);
	
	// Finding number of opened windows
	WebElement multiplewindows = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
	Thread.sleep(3000);
	multiplewindows.click();
	Thread.sleep(3000);
	int totalwindows = driver.getWindowHandles().size();
	System.out.println("Total number of active windows is : " + totalwindows);

	// closing child windows
	WebElement closebutton = driver.findElement(By.id("color"));
	Thread.sleep(3000);
	closebutton.click();
	Set<String> openedwindows = driver.getWindowHandles();
	for (String finalwindows : openedwindows) {
		if (!finalwindows.equals(parentwindow)) {
			driver.switchTo().window(finalwindows);
			Thread.sleep(3000);
			driver.close();
			
		}
		
	}
	Thread.sleep(3000);
	driver.quit();
	}

}
