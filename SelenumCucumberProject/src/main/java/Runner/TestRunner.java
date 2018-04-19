package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\1\\eclipse-workspace\\SelenumCucumberProject\\src\\main\\java\\features"
		,glue= {"stepDefinitions"}
		//format={"pretty", "html:test-output"}
		)

public class TestRunner {

	
}
