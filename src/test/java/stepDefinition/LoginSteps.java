package stepDefinition;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = Base.driver;
	
	
	@Given("^User has opened the Swaglabs application$")
    public void user_has_opened_the_swaglabs_application() throws Throwable {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }

    @When("^User provides usernmae \"([^\"]*)\"$")
    public void user_provides_usernmae_something(String username) throws Throwable {
    	WebElement Uname = driver.findElement(By.xpath("//input[@name='user-name']"));
    	Uname.sendKeys(username);
    }

    @Then("^User should be logged in successfully$")
    public void user_should_be_logged_in_successfully() throws Throwable {
    	String PageTitle = "PRODUCTS";
    	WebElement LandedPage = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        String LandedPageTitle = LandedPage.getText();
        System.out.println("Expected : " + PageTitle );
        System.out.println("Actual : " + LandedPageTitle );
        Assert.assertEquals(PageTitle, LandedPageTitle);
    }
    

    @Then("^User should get error message \"([^\"]*)\"$")
    public void user_should_get_error_message_something(String error) throws Throwable {
    	WebElement ErrorMsg = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
        String ErrorMsgInfo = ErrorMsg.getText();
        System.out.println("Expected : " + error );
        System.out.println("Actual : " + ErrorMsgInfo );
        Assert.assertEquals(error, ErrorMsgInfo);
    }

    @And("^User provides  password \"([^\"]*)\"$")
    public void user_provides_password_something(String password) throws Throwable {
     	WebElement Pword = driver.findElement(By.xpath("//input[@name='password']"));
    	Pword.sendKeys(password);
    }
    

    @And("^User clicks on Login button$")
    public void user_clicks_on_login_button() throws Throwable {
     
        WebElement Login = driver.findElement(By.xpath("//input[@name='login-button']"));
    	Login.click();
    }
}
