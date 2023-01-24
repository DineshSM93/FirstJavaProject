package LearningPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		// position of webelement
		WebElement buttonposition = driver.findElement(By.id("position"));
		Point xyposition = buttonposition.getLocation();
		int xposition = xyposition.getX();
		int yposition = xyposition.getY();
		System.out.println("X value is :"+ xposition  +"  Y value is :"+yposition);
		
		// color of button
		WebElement buttoncolor = driver.findElement(By.id("color"));
		String colour = buttoncolor.getCssValue("background-color");
		System.out.println("Button background colour is : "+colour);
		
		// size of button
		WebElement buttonsize = driver.findElement(By.id("size"));
		int height = buttonsize.getSize().getHeight();
		int width = buttonsize.getSize().getWidth();
		System.out.println("Button height is : "+height+" Button width is : "+width);
		
		// go to homepage
		WebElement homepage = driver.findElement(By.id("home"));
		homepage.click();
	
		

	}

}
