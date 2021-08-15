package Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyStore {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Chrome Driver is class of webDriver Interface
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("WOMEN");
		driver.findElement(By.xpath("//button[contains(@name,'submit_search')]")).click();

	}

}
