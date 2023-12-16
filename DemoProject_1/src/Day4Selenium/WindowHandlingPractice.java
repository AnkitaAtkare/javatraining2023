package Day4Selenium;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\#SeleniumLatest_30May23\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver;
		driver= new ChromeDriver();

		driver.manage().window().maximize(); // use to maximize the window
		
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		
		WebElement MultipleWIndowLink= driver.findElement(By.xpath("//a[text()=\"Multiple Windows\"]"));
		
		MultipleWIndowLink.click();
		Thread.sleep(2000);
		WebElement ClickHere= driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
		ClickHere.click();
		Thread.sleep(2000);
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String ParentId= it.next();
		String ChildId= it.next();
		
		driver.switchTo().window(ChildId);
		
		String Text=driver.findElement(By.xpath("//h3[text()=\"New Window\"]")).getText();
		System.out.println(Text);
		driver.switchTo().window(ParentId);
		String NextText=driver.findElement(By.xpath("//h3[text()=\"Opening a new window\"]")).getText();
		System.out.println(NextText);
		
		
		
		
		
		
		
		
		
	}
	

}
