package seleniumAdvancedConcepts;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/upload");
		
		// Actions click = new Actions(driver);
		WebElement uploadbutton = driver.findElement(By.id("file-upload"));
		// click.moveToElement(uploadbutton).click().build().perform();
		
		
		 uploadbutton.sendKeys("C:\\Users\\zenuser\\Downloads\\LambdaTest.txt");
				 
		
	}

}
