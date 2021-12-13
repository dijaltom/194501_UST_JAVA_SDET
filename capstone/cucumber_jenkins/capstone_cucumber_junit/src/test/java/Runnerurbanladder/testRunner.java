package Runnerurbanladder;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions; 

@CucumberOptions(features = "src/test/resources/Feature",strict = true,glue={"Stepsurbanladder"})
@RunWith(Cucumber.class)
public class testRunner{
	
}