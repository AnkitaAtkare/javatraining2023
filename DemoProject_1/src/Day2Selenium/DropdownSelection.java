package Day2Selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownSelection {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\#SeleniumLatest_30May23\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/OneDrive/Desktop/testing%20notes/OfflineWebsite/pages/examples/add_user.htm");
		driver.manage().window().maximize();
		List<WebElement> allOption= driver.findElements(By.xpath("//option"));
		Iterator<WebElement>it= allOption.iterator();
		
		

	
			
			
		}

	}

}
