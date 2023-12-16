package Day2Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Alert {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\#SeleniumLatest_30May23\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver;
			driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/delete_customer.php");
			driver.manage().window().maximize();
			
			WebElement CustomerIDtextbox= driver.findElement(By.xpath("//input[@type=\"text\"]"));
			CustomerIDtextbox.sendKeys("123");
			Thread.sleep(2000);
			WebElement SubmitButton= driver.findElement(By.xpath("//input[@type=\"submit\"]"));
			SubmitButton.click();
			Thread.sleep(2000);
			
			Alert alert =driver.switchTo().alert();
			String alertTextValue= alert.getText();
			System.out.println(alertTextValue);
			alert.dismiss();
			
			SubmitButton.click();
			Thread.sleep(2000);
			Alert alert1=driver.switchTo().alert();
			Thread.sleep(2000);
			alert1.accept();
			Thread.sleep(2000);
			alert1.accept();
			
			Thread.sleep(2000);
			
			
			
			
			
			
			
	}

}
