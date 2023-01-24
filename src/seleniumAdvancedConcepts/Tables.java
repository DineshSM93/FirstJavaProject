package seleniumAdvancedConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://testleaf.herokuapp.com/pages/table.html");
		
		// Finding number of columns
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int columncount = columns.size();
		System.out.println("Number of columns is : " + columncount);
		
		// Finding number of rows
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowcount = columns.size();
		System.out.println("Number of Rows is : " + rowcount);
		
		// Progress value of learn to interact
		WebElement progressvalue = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
	String progress = progressvalue.getText();
		System.out.println("The progress value is :" + progress);
		
		// click vital task of least progress
		List<WebElement> allprogress = driver.findElements(By.xpath("//td[2]"));
		List<Integer> numberlist = new ArrayList<Integer>();
		for (WebElement webElement : allprogress) {
			String individualvalue = webElement.getText().replace("%", "");
			numberlist.add(Integer.parseInt(individualvalue));
			
		}
		System.out.println("List of Progress values " + numberlist);
		
		int smallvalue = Collections.min(numberlist);
		System.out.println("Minimum progress value is :" + smallvalue);
		
		//td[normalize-space()='20%']//following::td[1]
		
		String smallvaluestring = Integer.toString(smallvalue)+"%";
		String finalxpath = "//td[normalize-space()=" + "\"" + smallvaluestring + "\"" + "]//following::td[1]";
		System.out.println(finalxpath);
		WebElement check = driver.findElement(By.xpath(finalxpath));
		check.click();
		
	}

}
