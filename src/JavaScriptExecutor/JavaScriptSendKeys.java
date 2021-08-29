package JavaScriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSendKeys extends JavaScriptUtilities {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
				
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//WebElement TextBox = driver.findElement(By.className("inputs"));
		WebElement textbox = driver.findElement(By.xpath("//input[@id='name']"));
		
		JavaScriptUtilities.sendKeys2(driver, textbox);
	}
}
