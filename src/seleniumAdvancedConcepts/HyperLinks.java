package seleniumAdvancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Link.html");
		
		// clicking on any link
		WebElement homepage = driver.findElement(By.linkText("Go to Home Page"));
		homepage.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		// where the link goes without clicking on it
		WebElement wheregoes = driver.findElement(By.partialLinkText("Find where"));
		String linkpage = wheregoes.getAttribute("href");
		System.out.println("Link goes to " + linkpage);
		
		// Find whether the link is broken
		WebElement brokenlink = driver.findElement(By.partialLinkText("Verify"));
		Thread.sleep(2000);
		brokenlink.click();
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("The link is broken");
			
		}
		Thread.sleep(2000);
		driver.navigate().back();
		
		// clicking on home page link second time
		WebElement homepage1 = driver.findElement(By.linkText("Go to Home Page"));
		Thread.sleep(2000);
		homepage1.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		// Finding number of links in a page
		List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		int linkcount = totallinks.size();
		System.out.println("Total number of links is" + linkcount);
	}

}
