package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99 {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium Chrome Driver\\chromedriver_win32\\chromedriver.exe");
												  
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.guru99.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[contains(text(),'SoapUI')]")).click();
	driver.findElement(By.xpath("//a[contains(@href,'/webservice-testing-beginner-guide.html')]")).click();

	}

}
