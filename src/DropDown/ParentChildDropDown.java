package DropDown;

import java.util.concurrent.TimeUnit;

//Handling dynamic dropd down using ParentChild relation without hardcoding the index values

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Handling Dynamic Dropdown using parent child relation

public class ParentChildDropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    
	    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[contains(text(),'Delhi')]")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[contains(text(),'Goa')]")).click();
	    driver.close();
	    
	}
}
