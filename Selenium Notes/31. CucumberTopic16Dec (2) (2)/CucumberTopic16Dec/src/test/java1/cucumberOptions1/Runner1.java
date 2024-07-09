package cucumberOptions1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java1/features1/Contact.feature"
		, glue = "stepdef"
//		, dryRun = true
		
		)


public class Runner1 extends AbstractTestNGCucumberTests{

}
