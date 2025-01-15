	package runners;
	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;
public class TestRunner {

	@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = "stepDefinitions",
	    plugin = {"pretty", "html:target/cucumber-reports.html"},
	    monochrome = true
	)
	public class TestNGRunner extends AbstractTestNGCucumberTests {
		
	}

	
}
