package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//import java.util.concurrent.StructureViolationException;


@RunWith(Cucumber.class)
    @CucumberOptions(
            features = {//"src/test/java/feature/login.feature",
                     "src/test/java/feature/facilitypage.feature"},
            glue = {"steps"},
            plugin = {"pretty","html:target/CucumberReports/CucumberReport.html"}
            //tags = "@HOMEPAGE,@INVENTORY_PAGE"

    )

    public class TestRunnerClass {


    }



