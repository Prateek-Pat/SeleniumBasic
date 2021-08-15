package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetreivingDataFromDataTable {

	public static void main(String[] args) {
		
		// TO check whether company,contact & country name is present or not in different column
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Selenium By Rahul\\Jar's & Software\\webDriver Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		//CONTACT Column data
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
				
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		String Xpath1 = "//*[@id='customers']/tbody/tr[";
		String Xpath2 = "]/td[1]";
		
		List row = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		int rowCount = row.size();

		for(int i=2;i<=rowCount;i++)
		{
			String Xpath3 = Xpath1 +i+ Xpath2;
			String company = driver.findElement(By.xpath(Xpath3)).getText();
			if(company.equalsIgnoreCase("Ernst Handel"))
			{
				System.out.println(company);
			}
		}
		
		System.out.println("######################");
		
		//CONTACT Column data
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		//*[@id="customers"]/tbody/tr[4]/td[2]
		
		//*[@id="customers"]/tbody/tr[7]/td[2]

		// Reteriving the company name and verifying it
		
		String Xpath4 = "//*[@id='customers']/tbody/tr[";
		String Xpath5 = "]/td[2]";
		for(int i=2;i<=rowCount;i++)
		{
			String Xpath6 = Xpath4+i+Xpath5;
			String contact = driver.findElement(By.xpath(Xpath6)).getText();
			if(contact.equalsIgnoreCase("Roland Mendel"))
			{
				System.out.println(contact);
				break;
			}
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
			String country = driver.findElement(By.xpath(Xpath9)).getText();
			if (country.equalsIgnoreCase("Canada"))
			{
				System.out.println(country);
				break;
			}
		}
	}
}
