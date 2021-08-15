package AddToCart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Retreiving Hardcoded (Cucumber) value from cart

public class Cart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		// All 30 Vegetables are being stored in items
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));

		// Now apply for loop to traverse all the items
		for (int i = 0; i <items.size(); i++) //i=2
		{
			
			// After traversing all the vegitable, items are being stored in name
			String name = items.get(i).getText();

			// Comparing if getText value is same as below i.e Cucumber
			if (name.contains("Cucumber"))
			{
				// Clicking Add to Cart button if getText value retreive is  Cucumber
				driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")).get(i).click();
				break; //So that once the required item found break the loop and no need to do un-ncesssary  
				       //looping for rest of the items
			}
		}
	}
}
