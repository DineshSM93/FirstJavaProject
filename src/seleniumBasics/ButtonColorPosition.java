package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonColorPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");

		// Finding position of button
		WebElement positionbutton = driver.findElement(By.id("position"));
		Point xyposition = positionbutton.getLocation();
		int xposition = xyposition.getX();
		int yposition = xyposition.getY();
		System.out.println("X position is : " + xposition + " Y position is : " + yposition);

		// Finding button color
		WebElement buttoncolor = driver.findElement(By.id("color"));
		String color = buttoncolor.getCssValue("background-color");
		System.out.println("Colour of button is : " + color);

		// Finding size of button
		WebElement buttonsize = driver.findElement(By.id("size"));
		int height = buttonsize.getSize().getHeight();
		int width = buttonsize.getSize().getWidth();
		System.out.println("Height is : " + height + " Width is :" + width);

		// Go to home page
		WebElement homepage = driver.findElement(By.id("home"));
		homepage.click();
	}

}
