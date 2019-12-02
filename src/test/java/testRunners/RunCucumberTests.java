package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/oprijilevskaia/IdeaProjects/cucumber/src/test/java/Features",plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber.json},"}
        , glue="StepsDefinition")
public class RunCucumberTests {
}
