package testscripts;

import org.testng.annotations.Test;

import genericutilities.Baseclass;

public class TC_01Test extends Baseclass{
	@Test

	public void LoginWithValidCredential() {
	loginpage.getLoginLink().click();
	loginpage.getEmailTf().sendKeys("mamtha@gmail.com");
	loginpage.getPasswordtTf().sendKeys("******************");
	loginpage.getLoginLink().click();
	}

}
