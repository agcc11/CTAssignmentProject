package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

	(
	features=".//Features/DataDriven.feature",
	glue="stepDefination",
	dryRun=false,
	monochrome=true,
	plugin= {"pretty","html:test-output"},
	tags="@ref"
	     	
	)

public class TestRun {

}
