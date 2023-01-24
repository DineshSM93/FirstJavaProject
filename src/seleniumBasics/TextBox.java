package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		
		WebElement textbox = driver.findElement(By.id("email"));
		textbox.sendKeys("test@gmail.com");
		
		WebElement appendbox =  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendbox.sendKeys("Append Text");
		
		WebElement gettextinbox = driver.findElement(By.name("username"));
		String printtext = gettextinbox.getAttribute("value");
		System.out.println(printtext);
		
		WebElement cleartext = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		cleartext.clear();
		
		WebElement disabledbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		Boolean enableordisable = disabledbox.isEnabled();
		System.out.println(enableordisable);
	}

}
