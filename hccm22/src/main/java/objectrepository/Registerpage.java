package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {
	public Registerpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Register")
	private WebElement element;
	
	@FindBy(id="gender-female")
	private WebElement genderRadioButton;
	
	@FindBy(id="FirstName")
	private WebElement FirstnameTf;
	
	@FindBy(id="LastName")
	private WebElement lastnameTf;
	
	@FindBy(id="Email")
	private WebElement EmailTf;
	
	@FindBy(id="Password")
	private WebElement PasswordTf;
	
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmationPassword;
	
	@FindBy(id="register-button")
	private WebElement RegisterbuttonTf;

	public WebElement getElement() {
		return element;
	}

	public WebElement getGenderRadioButton() {
		return genderRadioButton;
	}

	public WebElement getFirstnameTf() {
		return FirstnameTf;
	}

	public WebElement getLastnameTf() {
		return lastnameTf;
	}

	public WebElement getEmailTf() {
		return EmailTf;
	}

	public WebElement getPasswordTf() {
		return PasswordTf;
	}

	public WebElement getConfirmationPassword() {
		return ConfirmationPassword;
	}

	public WebElement getRegisterbuttonTf() {
		return RegisterbuttonTf;
	}
	
	
	
		

	}
