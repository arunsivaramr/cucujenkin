package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(monochrome=true,plugin= {"pretty","html:C:\\Users\\Admin\\Desktop\\Arun\\cucu-reports"})
//@CucumberOptions(tags= {"@Smoke","@Tag"})//Scenarios containing both names(AND)
@CucumberOptions(tags= {"@unit,@Smoke"})//Running scenarios(OR) either 1 is present in the tag name
public class Runner {
	
}
