package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\STUDY Mate\\SELENIUM\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		WebElement element = driver.findElement(By.id("nav-link-accountList"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
		//actions.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		//driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//a[@class='nav-action-button'] //span[contains(text(), 'Sign in')] ")).click();
       WebElement IndiaHover = driver.findElement(By.xpath("(//span[@class='nav-line-2'])[1]"));
       
       actions.moveToElement(IndiaHover).build().perform();
       
       driver.findElement(By.xpath("(//span[text()='हिंदी - HI'])[1]")).click();
	}
 }
