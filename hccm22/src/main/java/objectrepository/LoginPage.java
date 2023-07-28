package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver,this);



	}




	//input[@value='Log in']
	@FindBy(linkText="Log in")
	private WebElement LoginLink;
	@FindBy(id="Email")
	private WebElement emailTf;
	@FindBy(id="Password")
	private WebElement passwordtTf;
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginbutton;
	public WebElement getLoginLink() {
		return LoginLink;
	}
	public WebElement getEmailTf() {
		return emailTf;
	}
	public WebElement getPasswordtTf() {
		return passwordtTf;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}


}


