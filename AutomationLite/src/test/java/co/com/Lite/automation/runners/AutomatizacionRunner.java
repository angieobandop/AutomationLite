package co.com.Lite.automation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;



@RunWith(CustomCucumberRunner.class)
@CucumberOptions(
		features = "src/test/resources/features" ,
		glue = {"co.com.Lite.automation.stepdefinitions.AutomatizacionStepDefinitions"},
		tags= "@tag1",
		snippets = SnippetType.CAMELCASE)

public class AutomatizacionRunner {

   }


