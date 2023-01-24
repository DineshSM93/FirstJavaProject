package LearningPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert8 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		// AlertBox
		WebElement alertbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertbox.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		// ConfirmBox
		WebElement confirmbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		Thread.sleep(3000);
		confirmbox.click();
		Alert confirmok = driver.switchTo().alert();
		Thread.sleep(3000);
		confirmok.accept();
		
		Thread.sleep(3000);
		confirmbox.click();
		Alert confirmcancel = driver.switchTo().alert();
		Thread.sleep(3000);
		confirmcancel.dismiss();
		
		// PromptBox
		WebElement promptbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		Thread.sleep(3000);
		promptbox.click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Dinesh");
		prompt.accept();
		
		
	
	

	}

}
