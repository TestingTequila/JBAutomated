package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features", glue ="stepdefinition", dryRun = false, plugin = {"pretty", "html:target/janbask.html","junit:target/janbask.xml","json:target/janbask.json"})
public class Runner
{

}
