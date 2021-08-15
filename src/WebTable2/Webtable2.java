package WebTable2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webtable2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//Retreiving row count form data-table
		//int rowCount = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr")).size();
		List row = driver.findElements(By.xpath("//*[@id='countries']/tbody/tr"));
		int rowCount = row.size();
		System.out.println(rowCount);
		
		
		//Retreiving col count from data-table
		//int colCount = driver.findElements(By.xpath("//*[@id='countries']/tbody/tr[1]/td")).size();
		List col = driver.findElements(By.xpath("//*[@id='countries']/tbody/tr[1]/td"));
		int colCount = col.size();
		System.out.println(colCount);
		
		//Need to selecct Checckbox for belarus from countries list
		//Checkbox Xpath for Belarus is //table[@id='countries']/tbody/tr[17]/td[1] 
		//Country Xpath for Belarus is //table[@id='countries']/tbody/tr[17]/td[2]
		
		// ChecckBox Xpath
		String Xpath1 = "//*[@id='countries']/tbody/tr[";
		String Xpath2 = "]/td[1]";
		// Retreiving vlaue of i after applying loop
		
		// Country Xpath
		String Xpath4 = "//table[@id='countries']/tbody/tr[";
		String Xpath5 = "]/td[2]";
		//Retreiving vlaue of i after applying loop
		
		//Retreiving the list of countries
		for(int i=2;i<rowCount;i++)
		{
			String Xpath3 = Xpath1+i+Xpath2;
			String Xpath6 = Xpath4+i+Xpath5;
			/* if(row.contains("Norway"))
			{
				String Details = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr")).get(i).getText();
				System.out.println("Norway Country details are "+ Details);
			} */
			
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath6)));
			
			String Countries = driver.findElements(By.xpath(Xpath6)).get(i).getText();
			if (Countries.equalsIgnoreCase("Belarus"))
			{
				driver.findElement(By.xpath(Xpath3)).click();
			}
		}
	}
}
