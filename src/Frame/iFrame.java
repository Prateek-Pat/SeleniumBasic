package Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//iframe[@name='IGetButton']"));
		
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("//*[@class='wh-messenger-svg-whatsapp wh-svg-icon']")).click();

	}
}
