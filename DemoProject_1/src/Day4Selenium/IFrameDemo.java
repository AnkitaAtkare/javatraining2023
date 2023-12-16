package Day4Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IFrameDemo {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "D:\\#SeleniumLatest_30May23\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver;
		
		driver= new ChromeDriver();

		driver.manage().window().maximize(); // use to maximize the window
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
		
		Actions a;
		a= new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		
		WebElement target = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		a.dragAndDrop(source, target).build().perform();
		
		Thread.sleep(2000);
		driver.close();
		
	}
	
	
	
	
	

}
