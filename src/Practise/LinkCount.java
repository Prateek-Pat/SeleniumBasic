package Practise;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// 1. Counting total numb of link in page using a(anchor tag)
		int  linkCount = driver.findElements(By.tagName("a")).size();
		System.out.println(linkCount);		
		
		
		// 2. Finding the numb of link present n footer secction 
		// 2_1. By using limiting the driver scope, i.e limiting driver scope and created local driver for footer section
		WebElement FooterElement = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		int FooterCount = FooterElement.findElements(By.tagName("a")).size();
		System.out.println(FooterCount);
		
		// 3. Finding the numb of link present in footer 1st col with local driver
		WebElement FooterCol = FooterElement.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]"));
		int FooterCollink = FooterCol.findElements(By.tagName("a")).size();
		System.out.println(FooterCollink);
		
		for(int i=1;i<FooterCollink;i++)
		{
			String ClickEvent = Keys.chord(Keys.CONTROL, Keys.ENTER);
			FooterCol.findElements(By.tagName("a")).get(i).sendKeys(ClickEvent);
		}
		Set<String> winId = driver.getWindowHandles();
		Iterator<String> it = winId.iterator();
		
		while(it.hasNext())
		{
			String Title =  it.next();
			driver.switchTo().window(Title);
			System.out.println(driver.getTitle());
		}
	}
}
