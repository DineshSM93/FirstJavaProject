package LearningPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		// select using index
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select select1 = new Select(dropdown1);
		select1.selectByIndex(1);
		
		// select by using visible text
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select select2 = new Select(dropdown2);
		select2.selectByVisibleText("Appium");
		
		// select by value
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		Select select3 = new Select(dropdown3);
		select3.selectByValue("3");
		
		// display number of dropdown options
		WebElement dropdown4 = driver.findElement(By.className("dropdown"));
		Select select4 = new Select(dropdown4);
		List<WebElement> listofoptions = select4.getOptions();
		int size = listofoptions.size();
		System.out.println("Total number of options is "+ size);
		
		// using sendkeys to select from dropdown
		WebElement dropdown5 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		dropdown5.sendKeys("Loadrunner");
		
		// Multi-Select in dropdown
		WebElement dropdown6 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multiselect = new Select(dropdown6);        
		multiselect.selectByIndex(1);
		multiselect.selectByIndex(2);  
		multiselect.selectByIndex(4);
		
	}

}
