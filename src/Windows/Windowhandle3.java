package Windows;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle3 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Open Tab')]")).click();
		
		Set<String> windID = driver.getWindowHandles();
		Iterator<String> it = windID.iterator();
		String parentID = it.next();
		System.out.println(parentID);
		System.out.println(driver.getTitle());
		
		String childID = it.next();
		System.out.println(childID);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[contains(text(),'JOIN NOW')])[1]")).click();
	}

}
