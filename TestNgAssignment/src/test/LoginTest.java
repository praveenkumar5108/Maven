package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass {
	
	@Parameters({"UserName" , "Password"})
	@Test
	public void NegativeLogin(String UserNameVal, String PasswordVal) {
		
		LoginPage login = new LoginPage();
        login.Login(UserNameVal, PasswordVal);	
		
		
	}
	
	@Parameters({"UserName" , "CorrectPassword"})
	@Test
	public void PositiveLogin(String UserNameVal, String PasswordVal) {
		LoginPage login = new LoginPage();

		login.Login(UserNameVal, PasswordVal);
		
	}

}
