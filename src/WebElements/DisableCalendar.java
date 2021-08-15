package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// This test is incomplete
// Need to verify disbale functionality

public class DisableCalendar {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("input[id*='rbtnl_Trip_0']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div[class='picker-second']")).getAttribute("style"));
		
		driver.findElement(By.cssSelector("input[id*='rbtnl_Trip_1']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div[class='picker-second']")).getAttribute("style"));
		
		driver.findElement(By.xpath("//span[@class='btn-find-flight-home']//input[@value='Search'] ")).click();
	}
}
