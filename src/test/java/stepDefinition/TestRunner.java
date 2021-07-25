package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//Swaglab Project with Login and Product add to cart
@RunWith(Cucumber.class)
@CucumberOptions (
		monochrome=true,
		plugin= {"pretty", "json:target/cucumber.json", "html:target/cucumber-html"},
		features = "src/test/java",
		tags = {"@Product,@Login"},
		glue = {"stepDefinition"}
		)

public class TestRunner {

}
