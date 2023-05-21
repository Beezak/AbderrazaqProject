package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"step_definitions"},
        plugin = {"pretty", "summary", "json:target/cucumber-reports/cucumber-html-reports/report.json"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@international_travel_test"
        //"me.jvt.cucumber.report.PrettyReports:target/cucumber-reports"
)
public class TestRunner {
}
