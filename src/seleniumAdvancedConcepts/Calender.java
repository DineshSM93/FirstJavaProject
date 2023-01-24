package seleniumAdvancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Calendar.html");
		
		WebElement calender = driver.findElement(By.id("datepicker"));
		Thread.sleep(2000);
		calender.click();
		
		WebElement nextbutton = driver.findElement(By.xpath("//a[@title='Next']"));
		Thread.sleep(2000);
		nextbutton.click();
		
		WebElement date10 = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		Thread.sleep(2000);
		date10.click();
		

	}

}
