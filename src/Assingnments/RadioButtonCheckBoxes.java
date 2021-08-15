package Assingnments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RadioButtonCheckBoxes {
	
	/*Ques1) Check the first  Checkbox and verify if it is successfully checked and Uncheck it again
	to verify if it is successfully Unchecked */

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Selecting 1st checckbox
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		
		//Applying Assertion to check if checckbox is checcked or not
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		//UnSelecting 1st Checckbox
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		
		//Applying Assertion to check if checckbox is Unchecked or not
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
	}

}
