package seleniumAdvancedConcepts;

import java.io.File;

import org.checkerframework.framework.qual.StubFiles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/download");
		
		WebElement downloadlink = driver.findElement(By.linkText("LambdaTest.txt"));
		downloadlink.click();
		
		Thread.sleep(3000);
		
		File filelocation = new File("C:\\Users\\zenuser\\Downloads");
		File[] totalfiles = filelocation.listFiles();
		
		for (File file : totalfiles) {
			if (file.getName().equals("LambdaTest.txt")) {
				System.out.println("LambdaTest.txt file is downloaded");
				break;
				
			}
			
		}
		//  driver.close();
		driver.quit();
	}

}
