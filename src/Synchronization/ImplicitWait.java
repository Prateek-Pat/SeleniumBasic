package Synchronization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	
	public static void main(String[] args) throws InterruptedException {
		
		//int j=0; // initialized j variable so that evrytime when condition is met it's incremented by 1, only when harcoded var is decclared 
		
		// Step 1) Initialize array with String which every items needs to be added in cart
		
		String[] arr ={"Cucumber", "Carrot", "Brinjal", "Potato"};
		
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.manage().window().maximize();
		
		// Implicit wait is defined here and it's applicable golbally i.e where ever the driver reference is..
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// If we don't use implicit wait here then at the time of promo code it'll through error
		
		TestData(driver, arr);		
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	
	}
	
	// Created method so that main implmentaion can be hide and same method can be called in main method
	public static void TestData(WebDriver driver, String[] arr)
	{
		int j=0;
		
		// Since driver object is declared outside the main method we need to use here in this method as arg

		//Thread.sleep(3000);
		
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<items.size(); i++)
		{
			//split[0]= Cucumber;
			//split[1]= 1kg
			String[] name = items.get(i).getText().split("-");
			String trimString = name[0].trim();
			
			// Step 2) Convert Array into ArrayList after retreiving the text using getText() from loop
			// Changing array to arraylist so that validate text
			List itemNeeded = Arrays.asList(arr); 
			
			// Step 3) Now check whether arraylist contains that item or not using contains method
			// if this condition gets true, then below block would be executed
			if(itemNeeded.contains(trimString))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==arr.length) // arr.length is being used so that whenever randomly item is being added it's updated automatically irrespective of it's arraylength
				{
					break;
			  }
			}
		 }
	  }
   }
 
