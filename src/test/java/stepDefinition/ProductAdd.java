package stepDefinition;


import java.lang.reflect.Array;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ProductAdd {
	WebDriver driver = Base.driver;
	
	    @When("^User selects adds Sauce Labs Backpack to cart$")
	    public void user_selects_adds_sauce_labs_backpack_to_cart() throws Throwable {
	    	WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
	    	addToCart.click();
	    }

	    @Then("^Item must be added successfully$")
	    public void item_must_be_added_successfully() throws Throwable {
	    	 System.out.println("Item must be added successfully");
	    }

	    @When("^User selects products to add$")
	    public void user_selects_products_to_add(DataTable table) throws Throwable {
	    	
	    	String product1 = table.cell(1,1);
	    	String product2 = table.cell(2,1);
	    	System.out.println(product1);
	    	System.out.println(product2);
	    	
	    	WebElement addToCart1 = driver.findElement(By.xpath(product1));
	    	addToCart1.click();
	    	WebElement addToCart2 = driver.findElement(By.xpath(product2));
	    	addToCart2.click();
	    }

	    @Then("^Items must be added successfully$")
	    public void items_must_be_added_successfully() throws Throwable {
	    	System.out.println("Item must be added successfully");
	    }
	
}
