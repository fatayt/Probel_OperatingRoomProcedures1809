package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)


@CucumberOptions(
        plugin = {"pretty",
                "json:target/json-reports/cucumber.json",
                "html:target/cucumber-reportsss.json",
                "junit:target/cucumber-reportss/Cucumber.xml",
                },

        features = "src/test/resources",
        glue = "stepdefinitions",
        tags = "@TR0025",
        dryRun = false

)
public class Runner {





}
