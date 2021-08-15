package Xpath;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class InvokeBroweser {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium By Rahul\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); //Chrome Driver is class of webDriver Interface
//	driver.get("http://automationpractice.com/index.php");
//	System.out.println(driver.getTitle());
//	driver.close();
	
//	driver.get("https://www.facebook.com/");
//	//driver.findElement(By.id("email")).sendKeys("prateek.innu@gmail.com");
//	//driver.findElement(By.id("pass")).sendKeys("pratfacebook@123");
//	driver.findElement(By.name("email")).sendKeys("prateek.innu@gmail.com");
//	driver.findElement(By.name("pass")).sendKeys("pratfacebook@123");
//	driver.findElement(By.name("login")).click();
//	driver.close();
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prateek.innu@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pratfacebook@123");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	System.out.println(driver.getTitle());
	driver.close();               
	
	driver.get("https://login.salesforce.com/");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Max");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("payne");
	driver.findElement(By.xpath("//input[@id='Login']"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.close();
	
	
	}
}
