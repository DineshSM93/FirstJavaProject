package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");

		// click any checkbox
		WebElement sql = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[3]"));
		sql.click();

		// check whether checkbox is selected
		WebElement seleniumbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input"));
		Boolean selenium = seleniumbox.isSelected();
		System.out.println("Is selenium box is selected? " +selenium);
		
		// Unselect selected checkbox
		
		/*
		 * WebElement checkbox1 = driver.findElement(By.xpath(
		 * "//*[@id=\"contentblock\"]/section/div[3]/input[1]")); if
		 * (checkbox1.isSelected()) { checkbox1.click(); }
		 * 
		 * WebElement checkbox2 = driver.findElement(By.xpath(
		 * "//*[@id=\"contentblock\"]/section/div[3]/input[2]")); if
		 * (checkbox2.isSelected()) { checkbox2.click(); }
		 */
		
		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));
		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
		if (checkbox1.isSelected()) {
			checkbox1.click();
		} else {
			checkbox2.click();

		}
	}

}
