package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions; 

@CucumberOptions(features = "src/test/resources/Feature",glue={"StepsTest"},monochrome=true)

public class testRunner extends AbstractTestNGCucumberTests{
	
}