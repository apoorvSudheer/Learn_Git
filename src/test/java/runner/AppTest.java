package runner;

import java.io.IOException;

import org.junit.runner.RunWith;

import ask.auto.App;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features="src/test/resource/functional_tests",glue={"StepDefinition"})
public class AppTest {
	
}
