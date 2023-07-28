package genericutilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javascriptutility {
	public void enteringdataUsingJavascript(WebDriver driver,WebElement Element,String data) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguements[0].value="+data+"", Element);
		
	}
	public void ClickingOnElement(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;	
		js.executeScript("arguements[0].click();", element);
	}
	


		
	

}
	
