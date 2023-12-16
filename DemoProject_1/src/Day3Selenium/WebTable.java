package Day3Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\#SeleniumLatest_30May23\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver;
			driver= new ChromeDriver();

			driver.manage().window().maximize(); // use to maximize the window
			
			driver.get("file:///C:/Users/LENOVO/OneDrive/Desktop/testing%20notes/OfflineWebsite/index.html");
				
			Thread.sleep(2000);
			
			driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
			
			WebElement passwordTextBox = driver.findElement(By.id("password"));
			
			passwordTextBox.sendKeys("123456");
			
			Thread.sleep(2000);
			
			WebElement signInButton = driver.findElement(By.tagName("button"));
			
			signInButton.click();
		
		
		    WebElement UserTab = driver.findElement(By.xpath("//span[text()=\"Users\"]"));
		    UserTab.click();
		   
		    
		    WebElement TableData= driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]"));
		    String TableEmail= TableData.getText();
		    System.out.println("firstEmail: "+TableEmail);
		   
		   
		   
		    driver.close();
		

	}

}
