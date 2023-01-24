package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		// Select by index
		WebElement dropdownbox1 = driver.findElement(By.id("dropdown1"));
		Select select1 = new Select(dropdownbox1);
		select1.selectByIndex(1);
				
		// select by text
		WebElement dropdownbox2 = driver.findElement(By.name("dropdown2"));
		Select select2 = new Select(dropdownbox2);
		select2.selectByVisibleText("Appium");		
		
		// select by value
		WebElement dropdownbox3 = driver.findElement(By.id("dropdown3"));
		Select select3 = new Select(dropdownbox3);
		select3.selectByValue("3");
		
		// Select number of display options
		WebElement dropdown4 = driver.findElement(By.className("dropdown"));
		Select select4 = new Select(dropdown4);
		List<WebElement> listofoptions = select4.getOptions();
	    int totaloptions = listofoptions.size();	
	    System.out.println("Total number of options is " + totaloptions);
	    
	    // Sendkeys to select
	    WebElement dropdown5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
	    dropdown5.sendKeys("Loadrunner");
	    
	    // Multiselect
	    WebElement dropdown6 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
	    Select select5 = new Select(dropdown6);
	    select5.selectByIndex(1);
	    select5.selectByIndex(2);
	   select5.selectByValue("4");
	    
	   
	    
	    
	}

}
