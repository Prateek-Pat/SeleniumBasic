package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Different javaScriptExecutor Utilities

public class JavaScriptUtilities {
		
	public static void clickElementByJS(WebDriver driver, WebElement element){
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);		
		}
		
	public static void scrollInToView(WebDriver driver, WebElement element){
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);		
	}
	
	public static void scrollTo(WebDriver driver){
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,700)" );
	}
		
	public static void scrollBy(WebDriver driver){
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,700)" );
	}
			
	public static void scrollTop(WebDriver driver){
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
	}
	
	public static void sendKeys(WebDriver driver){
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		//js.executeScript("document.getElementById('name').value='MaxPayne;'");
		//js.executeScript("document.getElementsByName('enter-name')[0].value='SeriousSam;'" );		
		js.executeScript("document.getElementsByClassName('inputs ui-autocomplete-input')[0].value='Chris Jericho;'" );		
	}
	
	public static void sendKeys2(WebDriver driver, WebElement element){
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].value='John Cena'", element);		
	}
	
	
	
}

