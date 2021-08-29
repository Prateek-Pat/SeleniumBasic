package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptImplementation extends JavaScriptUtilities{
	
public  static WebDriver driver;
	
public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		WebElement we  = driver.findElement(By.xpath("//button[@name='submit_search']"));
	
		JavaScriptUtilities.clickElementByJS(driver, we);
		driver.close();
	}
	
}
