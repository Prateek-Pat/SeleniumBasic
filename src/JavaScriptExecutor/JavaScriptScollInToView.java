package JavaScriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptScollInToView extends  JavaScriptUtilities{
	
	
	public static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");		
		WebElement we = driver.findElement(By.xpath("//img[@alt='Printed Summer Dress']"));
		
		JavaScriptUtilities.scrollInToView(driver, we);	
		Thread.sleep(5000);
		driver.close();
	}

}
