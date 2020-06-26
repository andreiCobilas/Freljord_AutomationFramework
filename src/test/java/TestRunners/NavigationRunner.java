package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/resources/feature/Navigation_Bar.feature"},
        strict = true, plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
        "html:target/home-page-html"},
        tags = "@Feature5",
        glue = {"com.Freljord.Infrastructure.Driver",
                "com.Freljord.WebStructure.TestSteps.DefaultSteps"} )
public class NavigationRunner {

}
