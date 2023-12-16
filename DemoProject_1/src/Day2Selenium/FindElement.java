package Day2Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "\"C:\\#SeleniumLatest_30May23\\chromedriver-win64\\chromedriver-win64\"");
		
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
		
		
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		
		System.out.println("Number of Links : "+ allLinks.size());
		allLinks.get(4).click();	
		for(int i = 0; i<=allLinks.size(); i++) {
			String attribute =allLinks.get(i).getAttribute("href");
			System.out.println(attribute);
		}
		
		
		
		driver.quit();

	}

}
