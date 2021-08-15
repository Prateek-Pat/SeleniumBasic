package DropDown;

import java.util.concurrent.TimeUnit;

//Handling dynamic dropd down using hardcoded index value

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Handling Dynamic DropdDown

public class DynamicDropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    driver.findElement(By.xpath("(//input[contains(@value,'Departure City')])[1]")).click();
		//since after selecting "FROM" city, "TO" dropdown is automatically opens no need to find element again for same

		driver.findElement(By.xpath("//a[contains(text(),'Delhi')]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Dehradun')])[2]")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.close();
	}
}
