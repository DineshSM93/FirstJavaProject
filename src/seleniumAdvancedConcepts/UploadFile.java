package seleniumAdvancedConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/upload");
		
		Actions click = new Actions(driver);
		WebElement uploadbutton = driver.findElement(By.id("file-upload"));
		click.moveToElement(uploadbutton).click().build().perform();
		
		
		  // File location 
		String file =  "C:\\Users\\zenuser\\Downloads\\LambdaTest.txt";
		  
		  // Convert string to plain text 
		StringSelection selection = new StringSelection(file);
		  
		  // Store the file location in clipboard
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		  
		  // Paste the file location from clipboard to windows 
		  Robot robot = new Robot(); 
		  robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_V);
		  robot.keyRelease(KeyEvent.VK_V); 
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		  Thread.sleep(3000); 
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  
		 
		}

}
