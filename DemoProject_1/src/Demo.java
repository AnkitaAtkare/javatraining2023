import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\#SeleniumLatest_30May23\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver ;
		driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(" /html/body/div[2]/div/div/button")).click() ;
		driver.findElement(By.name("q")).sendKeys("mobile" +Keys.ENTER);
		
		
		
		
	
		
					
			
			
		  
	}

}
