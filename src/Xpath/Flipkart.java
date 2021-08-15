package Xpath;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	// Xpath locator usng contains() method
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.netmeds.com/");
		
		
		/* xpath using contains() method 
		  image click using url dynamically hnadled 
		  both the image url handled by contains() method */
		  	
		/*driver.findElement(By.xpath("//img[contains(@src,'image/929c19aa238c1ed5')]")).click();	
		driver.findElement(By.xpath("//img[contains(@src,'image/4adb048c4dd44ff5')]")).click();*/
				
		//<img src="https://www.netmeds.com/images/category/3052/thumb/eyewear_0.jpg" alt="Eyewear">
		driver.findElement(By.xpath("//img[contains(@src,'/thumb/eyewear_')]")).click();
		
		//<a class="category_name" href="https://www.netmeds.com/non-prescriptions/eyewear/eye-glasses" 
		driver.findElement(By.xpath("//div[@class='cat-item ']//a[contains(@href,'eyewear/eye-glasses')]")).click();
		
		/*
		// <img class="product-image-photo" src="https://www.netmeds.com/images/product-v1/150x150/909868
		/full_rim_incl_lenses_rounds_transparent_transparent_small_0_0.jpg
		*/
		driver.findElement(By.xpath("//div[@class='col-md-3 padding-none']//img[@alt='DbyD DBJU08 (including UV blue lens) - Clear']")).click();
	
		driver.findElement(By.xpath("//a[contains(@href,'beauty')]//span[@class='content-txt']")).click();
		
		driver.findElement(By.xpath("//img[contains(@src,'msite/garnier.')]")).click();
		
	}

}
