package runnerTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions; 
@RunWith(Cucumber.class)

@Cucumber.Options(features = "src\\test\\resources\\Feature",glue={"runnerTest"})

public class testRunner { }	