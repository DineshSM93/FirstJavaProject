package LearningPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		// driver.findElement(By.id("email")).sendKeys("Testleaf@gmail.com");
		WebElement emailbox = driver.findElement(By.id("email"));
		emailbox.sendKeys("Testleaf@gmail.com");
		
		// driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input")).sendKeys("Append New Text");
		WebElement appendbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendbox.sendKeys("Append New Text");
		
		/* String defaulttext = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input")).getAttribute("value");
		System.out.println(defaulttext); */
		WebElement defaulttext = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input"));
		String text = defaulttext.getAttribute("value");
		System.out.println(text);
		
		// driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input")).clear(); 
		WebElement clearbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearbox.clear();
		
		WebElement enabledbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		Boolean enabled = enabledbox.isEnabled();
		System.out.println(enabled);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
