package Day4Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static  void main(String[] args) {
		    System.setProperty("webdriver.chrome.driver", "D:\\#SeleniumLatest_30May23\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver;
			driver= new ChromeDriver();

			driver.manage().window().maximize(); // use to maximize the window
			
			driver.get("https://www.amazon.com/");
		
			Actions a;
			a= new Actions(driver);	
			WebElement Signin = driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
			  a.moveToElement(Signin).contextClick(Signin).build().perform();
			  
			  WebElement TextBox= driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
			  a.moveToElement(TextBox).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
			
			driver.close();

	}

}
