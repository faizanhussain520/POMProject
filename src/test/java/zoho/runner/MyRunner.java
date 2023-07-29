package zoho.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        //features = "@rerun/failed_scenarios.txt",
        features = "src/test/resources",
        glue = {"zoho.teststeps"},
        plugin = {"html:target/cucumber-reports.html", "rerun:rerun/failed_scenarios.txt"},
        //  tags = "@BuyingTab or @BuyingDesktop or @BuyCar"
        tags = "@CreateLead",
        monochrome = false,
        dryRun = false


)
public class MyRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
