package stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	
	WebDriver driver = Baseclass.driver;

    @Given("^User Opened Swag Lab Application$")
    public void user_opened_swag_lab_application() throws Throwable {
    	
    	driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);

    }

    @When("^User Enters username \"([^\"]*)\"$")
    public void user_enters_username_something(String Username) throws Throwable {
    	WebElement usrname = driver.findElement(By.id("user-name"));
    	usrname.sendKeys(Username);
    	
    }

    @And("^User Enter Password \"([^\"]*)\"$")
    public void user_enter_password_something(String Password) throws Throwable {
    	
    	WebElement pass = driver.findElement(By.id("password"));
    	pass.sendKeys(Password);
    }

    @And("^Clicks on Login Button$")
    public void clicks_on_login_button() throws Throwable {
    	WebElement login_btn = driver.findElement(By.name("login-button"));
    	login_btn.click();
    }
    
    @Then("^User Should be on the Products Page$")
    public void user_should_be_on_the_products_page() throws Throwable {
    }
    
    @Then("^User Should get the \"([^\"]*)\"$")
    public void user_should_get_the_something(String error) throws Throwable {
    	
    	WebElement er = driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match any user in this service')]"));
        Assert.assertEquals(error, er.getText());
    }

}
