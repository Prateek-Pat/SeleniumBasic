package JavaScriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptScrollWindow extends JavaScriptUtilities {
	
	public static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
		//JavaScriptUtilities.scrollTo(driver);
		JavaScriptUtilities.scrollBy(driver);
		
		Thread.sleep(5000);
		WebElement we = driver.findElement(By.xpath("//div[@class='tableFixHead']"));
		
		JavaScriptUtilities.scrollTop(driver);		
	}
}
