package SeleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDeriverMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\#SeleniumLatest_30May23\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver;
		driver=new ChromeDriver();
//		driver.manage().window().maximize(); // use to maximize the window

		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/add_user.html");

		WebElement usernametextBox = driver.findElement(By.xpath("//input[@id='username']"));

		usernametextBox.sendKeys("Amol12");

		Thread.sleep(2000);

		usernametextBox.clear();

		Thread.sleep(2000);

		usernametextBox.sendKeys("Amol");

		Thread.sleep(2000);

		String attribute = usernametextBox.getAttribute("placeholder");

		System.out.println("Username textbox attribute value is: " + attribute);

		String tagname = usernametextBox.getTagName();

		System.out.println("Username textbox tag name value is: " + tagname);

		WebElement mobileTextBox = driver.findElement(By.xpath("//input[@id='mobile']"));

		System.out.println(mobileTextBox.isDisplayed());

		if (mobileTextBox.isDisplayed()) {
			mobileTextBox.sendKeys("9988776655");
		} else {
			System.out.println("Error");
		}

		Thread.sleep(3000);

		WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='email']"));

		System.out.println(emailTextBox.isEnabled());

		if (emailTextBox.isEnabled()) {
			emailTextBox.sendKeys("amol@gmail.com");
		} else {
			System.out.println("Error");
		}

		WebElement genderMale = driver.findElement(By.xpath("//input[@id='Male']"));

		System.out.println(genderMale.isSelected());

		if (genderMale.isSelected()) {

		} else {
			genderMale.click();
		}

		Thread.sleep(3000);

		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));

		Select obj; 
		obj= new Select(dropdown);

		obj.selectByVisibleText("HP");

		Thread.sleep(3000);
		
		WebElement textBoxPassword = driver.findElement(By.xpath("//input[@id='password']"));
		
		textBoxPassword.sendKeys("12345");
		
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
		
		String submitTextValue = submitButton.getText();
		
		System.out.println("Text value present on submit button is: "+submitTextValue);
		
		submitButton.submit(); // only for button we can use submit method

		Thread.sleep(3000);
		
		driver.close();
	}

}

	}

}
