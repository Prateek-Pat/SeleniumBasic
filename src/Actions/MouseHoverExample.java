package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		Actions actions = new Actions(driver);
		
		// Entering text in Capital letter in search box
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		actions.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		// Right Click on oders section using contextClick method
		WebElement element1 = driver.findElement(By.xpath("//a[@id='nav-orders']"));
		actions.moveToElement(element1).contextClick().build().perform();
	}
 }
