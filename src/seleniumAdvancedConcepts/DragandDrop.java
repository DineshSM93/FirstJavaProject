package seleniumAdvancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node0f0yq850dsuuu15jrbqj0da8vq347072.node0");

		WebElement source = driver.findElement(By.xpath("//*[@id=\"form:drag_content\"]"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"form:drop_content\"]"));
		
		Actions action = new Actions(driver);
		// action.clickAndHold(source).moveToElement(target).release(target).build().perform();
		action.dragAndDrop(source, target).build().perform();
	}

}
