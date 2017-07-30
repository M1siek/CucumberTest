package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by shandj on 26/06/2017.
 */


@CucumberOptions(features = {"src/test/regression/java/features"},
                format ={"html:target/site/cucumber-pretty/test"},
                glue = {"Steps"})

public class TestRunner extends AbstractTestNGCucumberTests {


}
