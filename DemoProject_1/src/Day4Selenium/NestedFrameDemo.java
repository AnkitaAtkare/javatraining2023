package Day4Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\#SeleniumLatest_30May23\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize(); // use to maximize the window

		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[text()=\"Nested Frames\"]")).click();
	    driver.switchTo().frame("frame-top");
	    driver.switchTo().frame("frame-middle");
	    WebElement MiddleText= driver.findElement(By.xpath("//div[@id=\"content\"]"));
		String Text=MiddleText.getText();
		
		System.out.println(Text);
		

        
       

	}

}
