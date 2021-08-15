package WebTable2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("prateek.innu@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Crm@123");
		driver.findElement(By.xpath("//div[@class='ui stacked segment'] //div[contains(text(),'Login')] ")).click();
		
		driver.findElement(By.xpath("//i[@class='users icon']")).click();
		
		//Retreiving row count
		int rowCount = driver.findElements(By.xpath("//table[@class='ui celled sortable striped table custom-grid table-scroll']/tbody/tr")).size();
		System.out.println("Row count is:"+ rowCount);
				
		//Retreiving unique col count
		int UniquecolCount = driver.findElements(By.xpath("//table[@class='ui celled sortable striped table custom-grid table-scroll']/tbody/tr[1]/td")).size();
		System.out.println("Unique Column count is: "+ UniquecolCount);

		//Retreiving col count
		int colCount =  driver.findElements(By.xpath("//table[@class='ui celled sortable striped table custom-grid table-scroll']/tbody/tr/td")).size();
		System.out.println("Coulumn count is: "+ colCount);
	}
}
