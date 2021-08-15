package Blazedemo;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "E:\\STUDY Mate\\SELENIUM\\ChromeDriver\\chromedriver_win32.zip");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://blazedemo.com/");
		java.util.List<WebElement> cityList = driver.findElements(By.xpath("//select[@name='fromPort']"));
			int cityCount = cityList.size();		
		
		for(int i=0;i<cityCount;i++){
			
			System.out.println(cityList.get(0));
			System.out.println(cityList.get(i));
			
			
			
		}
		
		
		
	}

}
