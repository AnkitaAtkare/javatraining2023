package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   
		System.out.println("This is first project");
		System.setProperty("webdriver.chrome.driver", "D:\\#SeleniumLatest_30May23\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		}

}
