package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicRowWebtable {

	public static void main(String[] args) {
		
		// Dynamic row size is being used in this script
		// To checck the row no: we can find elements on tr and save in one var and can find the rowSize
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		// Row's value is hardcoded, we need to find out the size of the row, By using FindElements and
		// Save the size of the rows in 1 string and then pass the same value in loop
		
		String Xpath1 = "//*[@id='customers']/tbody/tr[";
		String Xpath2 = "]/td[1]";
		
		// Since we need to check the no of row and this is xpath ofr 1st //*[@id="customers"]/tbody/tr[1]
		// Then for all rows //*[@id="customers"]/tbody/tr
		
		List row = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		int rowCount = row.size();
		
		for(int i=2;i<=rowCount;i++)
		{
			String Xpath3 = Xpath1 +i+ Xpath2;
			String name = driver.findElement(By.xpath(Xpath3)).getText();
			System.out.println(name);
		}
		
		System.out.println("######################");
		
		//CONTACT Column data
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		//*[@id="customers"]/tbody/tr[4]/td[2]
		
		//*[@id="customers"]/tbody/tr[7]/td[2]
		
		//Note: td i.e column is comman, while tr is being vary, Hence we can create Xpath
		//Since tr is varying we need to apply loop to retreive the complete xpath to get the name.
		
		String Xpath4 = "//*[@id='customers']/tbody/tr[";
		String Xpath5 = "]/td[2]";
		for(int i=2;i<=rowCount;i++)
		{
			String Xpath6 = Xpath4+i+Xpath5;
			String name1 = driver.findElement(By.xpath(Xpath6)).getText();
			System.out.println(name1);
		}
		
		System.out.println("################");
		
		//COUNTRY Column data
		//*[@id="customers"]/tbody/tr[2]/td[3]
		//*[@id="customers"]/tbody/tr[3]/td[3]
		//*[@id="customers"]/tbody/tr[4]/td[3]
	
		//*[@id="customers"]/tbody/tr[7]/td[3]
		
		String Xpath7 = "//*[@id='customers']/tbody/tr[";
		String Xpath8 = "]/td[3]";
		for(int i=2;i<=rowCount;i++)
		{
			String Xpath9 = Xpath7+i+Xpath8;
			String name3 = driver.findElement(By.xpath(Xpath9)).getText();			
		}
	}
}
