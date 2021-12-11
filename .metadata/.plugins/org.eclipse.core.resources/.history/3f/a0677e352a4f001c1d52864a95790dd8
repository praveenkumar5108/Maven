package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ProductAdd {
	WebDriver driver = Baseclass.driver;
	
    @And("^user adds the product to the cart \"([^\"]*)\"$")
    public void user_adds_the_product_to_the_cart_something(String product) throws Throwable {
    	WebElement product_add = driver.findElement(By.name("add-to-cart-sauce-labs-bike-light"));
    	product_add.click();
    	
    }
    
    @Then("^user can see the product added to the cart$")
    public void user_can_see_the_product_added_to_the_cart() throws Throwable {
    	
    	WebElement cart = driver.findElement(By.xpath("//*[@class='shopping_cart_badge']"));
    	Assert.assertEquals("1", cart.getText());
    }




}
