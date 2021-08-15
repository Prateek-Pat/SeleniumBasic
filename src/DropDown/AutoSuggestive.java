package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Handling Autosuggestive drop down 

public class AutoSuggestive {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.manage().window().maximize();
	driver.findElement(By.id("autosuggest")).sendKeys("ind");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	
	for(WebElement options1:options)
	{
		if(options1.getText().equalsIgnoreCase("India"))
		{
			options1.click();
			break;
		}
	}
	
	//driver.close();

	}
}
