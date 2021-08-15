package AddToCart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart2 {

	// Step 1) Initialize array with String which ever items needs to be added in cart
	// Step 2) Convert Array into ArrayList after retreiving the text getText() from looop
	// Step 3) Now check whether arraylist contains that item or not using contains method
	
	public static void main(String[] args) {
		
		// Step 1) Initialize array with String which ever items needs to be added in cart
		String[] arr ={"Cucumber", "Carrot", "Brinjal", "Potato"};
		
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<items.size(); i++)
		{
			String name = items.get(i).getText();
			
			// Step 2) Convert Array into ArrayList after retreiving the text using getText() from loop
			// Changing array to arraylist so that validate text
			List itemNeeded = Arrays.asList(arr); 
			
			// Step 3) Now check whether arraylist contains that item or not using contains method
			// if this condition gets true, then below block would be executed
			if(itemNeeded.contains(name))
			{
				driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")).get(i).click();	
			}
		}	
	}
 }
