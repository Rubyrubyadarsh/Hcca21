package genericutilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.LoginPage;
import objectrepository.Registerpage;

public class Baseclass {
	WebDriver driver;
public static	LoginPage loginpage;
public static 	Registerpage registerpage;
	PropertyUtility utility= new ProPertyUtility();
	@BeforeClass
	public void launchingBrowers() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
				
		
	}
	@BeforeMethod
	public void NavigatingToApplication() throws IOException {
		driver.get(utility.readDataFromPropertyFile("url"));
		loginpage=new LoginPage(driver);
		registerpage=new Registerpage(driver);
	}
		@AfterClass
		public void teardownTheBrowers() {
			driver.quit();
		}
		
	}
	
	
	
	

	