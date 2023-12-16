package Day3Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\#SeleniumLatest_30May23\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();

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

		List<WebElement> allHeadings = driver.findElements(By.xpath("//table/tbody/tr"));
		List<WebElement> allRows = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (int i = 2; i <= allHeadings.size(); i++) {
			String Heading = allHeadings.get(i).getText();
			System.out.println(i + Heading);

			for (int j = 0; j <= allRows.size(); j++) {
				String Alltable = allRows.get(j).getText();
				System.out.println(j + Alltable);
			}
		}

		driver.quit();
	}

}
