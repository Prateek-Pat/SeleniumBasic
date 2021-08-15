package SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElemment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/index.html");
		WebElement phone = driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]"));
		phone.click();
		

	}

}
