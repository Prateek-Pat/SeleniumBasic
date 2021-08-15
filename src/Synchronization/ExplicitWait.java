package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait<webdriverwait> {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement fisrtname = driver.findElement(By.id("email"));
		WebElement lastname = driver.findElement(By.id("pass"));
		WebElement Button = driver.findElement(By.xpath("//button[@type='submit']"));

		sendKeysTo(driver, fisrtname, 10, "prateek.innu@gmail.com");
		sendKeysTo(driver, lastname, 5, "pratfacebook@123");

		clickOn(driver, Button, 5);
	}

	public static void sendKeysTo(WebDriver driver, WebElement element,int timeout, String value)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

	public static void clickOn(WebDriver driver, WebElement element, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
