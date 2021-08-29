package Windows;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Default controll will be on parent window until, not switched to child
		// System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//a[@class='btn btn-primary btn-lg btn-block'])[1]")).click();
		
		Set<String> winIds = driver.getWindowHandles();
		Iterator<String> it = winIds.iterator();
		String partnId = it.next();
		
		driver.switchTo().window(partnId);
		System.out.println(partnId);
		System.out.println("Below is Parent window title");
		System.out.println(driver.getTitle());
		
		String chldId = it.next();
		driver.switchTo().window(chldId);
		System.out.println("Below is Child window title");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Flights')]"));
		
		
		driver.switchTo().defaultContent();
		driver.switchTo().window(partnId);
		System.out.println(driver.getTitle());	
	}
}
