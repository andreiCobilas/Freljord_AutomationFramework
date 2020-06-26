package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/resources/feature/Checkout.feature"},
        strict = true, plugin = {"pretty",
        "json:target/cucumber_json_reports/checkout.json",
        "html:target/checkout-html"},
        tags = "@Feature5",
        glue = {"com.Freljord.Infrastructure.Driver",
                "com.Freljord.WebStructure.TestSteps.DefaultSteps",
                "com.Freljord.WebStructure.TestSteps.LoginPageSteps",
                "com.Freljord.WebStructure.TestSteps.CheckoutSteps",
        } )


public class Checkout {
}

