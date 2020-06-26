package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/resources/feature/Product_Page_Quantity.feature"},
        strict = true, plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
        "html:target/home-page-html"},
        tags = "@Feature3",
        glue = {"com.Freljord.Infrastructure.Driver",
                "com.Freljord.WebStructure.TestSteps.DefaultSteps",
                "com.Freljord.WebStructure.TestSteps.AddToCartSteps",
               } )

public class ProductPageQuantity {

}
