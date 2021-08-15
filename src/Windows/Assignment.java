package Windows;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "E:\\STUDY Mate\\SELENIUM\\ChromeDriver\\chromedriver_win32.zip");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		Set<String> winId = driver.getWindowHandles();
		
		Iterator<String> it = winId.iterator();
		
		String parntId = it.next(); // Parent window
		//driver.switchTo().window(parntId);
		
		String chldId = it.next();  // Child window
		driver.switchTo().window(chldId);
		System.out.println(driver.getTitle());
		
		
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		
		driver.switchTo().window(parntId);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
	}
}
