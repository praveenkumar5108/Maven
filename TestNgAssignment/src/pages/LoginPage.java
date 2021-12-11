package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test.BaseClass;


public class LoginPage {
	
	WebDriver driver = BaseClass.driver;
	ExtentTest test = BaseClass.test;
	
	@FindBy(id = "user-name")
	WebElement UserName;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(id = "login-button")
	WebElement LoginButtton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void Login(String UserNameVal, String PasswordVal) {
		
        WebDriverWait wait = new WebDriverWait(driver,30);
		
				
		UserName.sendKeys(UserNameVal);
		//test.log(LogStatus.PASS,"Enter Username" + UserNameVal, "Successfully entered the username");
		
		Password.sendKeys(PasswordVal);
		//test.log(LogStatus.PASS,"Enter Username" + PasswordVal, "Successfully entered the Password");
		
		LoginButtton.click();
		//test.log(LogStatus.PASS,"Click On Login Button", "Successfully Clicked The Login button");

		
	}
	



}
