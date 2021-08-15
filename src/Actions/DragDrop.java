package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// created Actions class and passed drivver and refrence variable
		// drag and drop functionlity will be performed by Actionas class
		
		Actions action = new Actions(driver);
		
		WebElement iframe = driver.findElement(By.cssSelector("iframe.demo-frame"));
		
		driver.switchTo().frame(iframe);
		
		WebElement source = driver.findElement(By.id("draggable")); // Source WebElement
		WebElement target = driver.findElement(By.id("droppable")); // Target WebElement
		
		action.dragAndDrop(source, target).build().perform();
	}
}
