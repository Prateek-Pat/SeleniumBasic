package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetreivingRowColCount {

	public static void main(String[] args) {
		
		// TO check whether company,contact & country name is present or not in different column
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
				
		//*[@id="customers"]/tbody/tr[1]
		//*[@id="customers"]/tbody/tr[2]
		//*[@id="customers"]/tbody/tr[3]
		//*[@id="customers"]/tbody/tr[4]
		
		//*[@id="customers"]/tbody/tr[7]
		
		//Retreiving row count from data-table
		List rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		int rowsCount = rows.size();
		System.out.println(rowsCount);
		
		//Retreiving column count from data-table
		List column1 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		int colCount2 = column1.size();
		System.out.println(colCount2);
		
		//Retreiving all column count from data-table
		List column = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/td"));
		int colCount = column.size();
		System.out.println(colCount);

		String xpath1 = "//*[@id='customers']/tbody/tr[";
		String xpath2 = "]";
		for(int i=2;i<=rowsCount;i++)
		{
			String xpath3= xpath1+i+xpath2;
			String rowData = driver.findElement(By.xpath(xpath3)).getText();
			System.out.println(rowData);
		}
	}
 }
