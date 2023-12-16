package SeleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWebDriverMethod {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\#SeleniumLatest_30May23\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/LENOVO/Downloads/index.html");
		Thread.sleep(3000);
		System.out.println("Trail Program Log");
		driver.close();
		

	}

}
