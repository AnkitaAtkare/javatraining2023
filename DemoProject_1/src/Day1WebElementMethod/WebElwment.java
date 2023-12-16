package Day1WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElwment {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\#SeleniumLatest_30May23\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/OneDrive/Desktop/testing%20notes/OfflineWebsite/pages/examples/add_user.html");
		driver.manage().window().maximize(); 
		
//		WebElement EmailTextBox = driver.findElement(By.xpath("//input[@id=\"email\"]"));
//		EmailTextBox.sendKeys("kiran@gmail.com");
//		WebElement PasswordTextBox = driver.findElement(By.xpath("//input[@id=\"password\"]"));
//		PasswordTextBox.sendKeys("123456");
//		WebElement LoginButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
//		LoginButton.click();
//		WebElement EmailTextBox = driver.findElement(By.xpath("//input[@id=\"email\"]"));
//		EmailTextBox.sendKeys("kiran@gmail.com");
		
		WebElement UserName= driver.findElement(By.xpath("//input[@id=\"username\"]"));
		UserName.sendKeys("Abcd");
		Thread.sleep(2000);
		UserName.clear();
		Thread.sleep(2000);
		UserName.sendKeys("Abcderf");
		Thread.sleep(2000);
		String Attribute= UserName.getAttribute("placeholder");
		System.out.println("UserName Placeholder is " + Attribute);
		String Tagname=UserName.getTagName();
		System.out.println("UserName TagName is " + Tagname);
		WebElement MobileTextbox= driver.findElement(By.xpath("//input[@id=\"mobile\"]"));
		System.out.println(MobileTextbox.isDisplayed());
		
		if(MobileTextbox.isDisplayed()){
			MobileTextbox.sendKeys("9952158455");
			
		}
		else {
			System.out.println("Error");
		}
		Thread.sleep(2000);
		WebElement EmailTextBox = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		System.out.println(EmailTextBox.isEnabled());
		if(EmailTextBox.isEnabled()) {
			EmailTextBox.sendKeys("123@gmail.com");
		}
		else {
			System.out.println("Error");
		}
		Thread.sleep(2000);
		
		WebElement GenderMale =driver.findElement(By.xpath("//input[@id=\"Male\"]"));
		System.out.println(GenderMale.isSelected());
		
		if(GenderMale.isSelected()) {}
		else {
			GenderMale.click();
		}
		
		Thread.sleep(2000);
		WebElement dropDown=driver.findElement(By.xpath("//select[@class=\"form-control\"]"));
		Select obj;
		obj=new Select(dropDown);
		System.out.println(obj.isMultiple());
		
		
		obj.selectByVisibleText("HP");
		Thread.sleep(2000);
		
		obj.selectByValue("Punjab");
		Thread.sleep(2000);
		
		obj.selectByIndex(1);
		Thread.sleep(2000);
		
		WebElement PassWordTextBox= driver.findElement(By.xpath("//input[@id=\"password\"]"));
		PassWordTextBox.sendKeys("123456789");
		
		WebElement SubmitButton= driver.findElement(By.xpath("//button[@id=\"submit\"]"));
		String Submit=SubmitButton.getText();
		System.out.println("Text on sunmit Button "+ Submit);
		SubmitButton.submit();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
