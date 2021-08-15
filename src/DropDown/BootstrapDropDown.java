package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("li.menu_Trains")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for='travelFor']")).click();
		List<WebElement> DDlist = driver.findElements(By.xpath("//ul[@class='travelForPopup']//li"));
		int DDCount = DDlist.size();
		
		for(int i=0;i<DDCount;i++)
		{
			String DDname = DDlist.get(i).getText();
			if(DDname.contains("Third AC"))
			{
				DDlist.get(i).click();
				break;
			}
		}
		driver.close();
	}
 }