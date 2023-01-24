package seleniumAdvancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/frame.html");
		
		// Clicking button inside single frame
		driver.switchTo().frame(0);
		WebElement firstframe = driver.findElement(By.id("Click"));
		Thread.sleep(3000);
		firstframe.click();
		String text = firstframe.getText();
		System.out.println("Text after clicking is : " + text);
		
		driver.switchTo().defaultContent();
		
		// Clicking button inside nested frame
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement secondframe = driver.findElement(By.id("Click1"));
		Thread.sleep(3000);
		secondframe.click();
		
		driver.switchTo().defaultContent();
		
		// Finding total number of frames
		List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));
		int frames = totalframe.size();
		System.out.println("Total  number of frames is : " + frames);
		
	}

}
