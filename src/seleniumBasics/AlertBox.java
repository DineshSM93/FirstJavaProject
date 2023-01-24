package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		
		// clicking alert box
		WebElement alertbox1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alertbox1.click();
		Alert firstalert = driver.switchTo().alert();
		Thread.sleep(2000);
		firstalert.accept();
		
		// clicking confirm box
		WebElement alertbox2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		alertbox2.click();
		Alert dismissalert = driver.switchTo().alert();
		Thread.sleep(2000);
		dismissalert.dismiss();
		
		// clicking prompt box
		WebElement alertbox3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		Thread.sleep(2000);
		alertbox3.click();
		Alert promptbox = driver.switchTo().alert();
		Thread.sleep(2000);
		promptbox.sendKeys("New Text1");
		Thread.sleep(4000);
		promptbox.accept();
		
		

	}

}
