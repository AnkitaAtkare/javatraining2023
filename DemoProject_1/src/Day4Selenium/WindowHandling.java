package Day4Selenium;

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\#SeleniumLatest_30May23\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver;
			driver= new ChromeDriver();

			driver.manage().window().maximize(); // use to maximize the window
			
			driver.get("https://demo.guru99.com/popup.php");
		    
			WebElement ClickButton= driver.findElement(By.xpath(("//a[text()=\"Click Here\"]")));
			ClickButton.click();
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> it= windows.iterator();
			String ParentId= it.next();
			String ChildId= it.next();
			driver.switchTo().window(ChildId);
			WebElement Text= driver.findElement(By.xpath("//h2[text()=\"Enter your email address to get \"]"));
			System.out.println(Text.getText().split("your")[1].trim().split(" ")[0]);
			
			
			
//			driver.findElement(By.xpath("//h2[text()=\\"Enter your email address to get \\"]")).getText().split("your")[1].trim().split(" ")[0];
			
			
			
			driver.close();

	}

}
