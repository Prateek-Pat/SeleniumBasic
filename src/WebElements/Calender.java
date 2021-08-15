package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

// Current date selection from Calendar

public class Calender {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("input[id*='Trip_0']")).click();
		
		driver.findElement(By.cssSelector("input[id*='originStation1_CTXT']")).click();
		
		driver.findElement(By.xpath("(//a[contains(text(),'Delhi')])[1]")).click();
		
		driver.findElement(By.xpath("(//a[contains(text(),'Jaipur')])[2]")).click();
		
		// since cursor is automatically jumping to claendar no need to perform click action on saame
		
		//driver.findElement(By.cssSelector("input[class*='home-date-pick valid']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("a[class*='ui-state-hover']")).click();
		
		driver.findElement(By.xpath("//span[@class='btn-find-flight-home']//input[@value='Search'] ")).click();
	}
}
