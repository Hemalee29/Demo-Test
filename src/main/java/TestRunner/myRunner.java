package TestRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\htshe\\eclipse-workspace\\friday\\src\\main\\java\\Features\\GoogleSearch.feature",
glue={"StepDefination"},
monochrome=true,
plugin = {"json","json:target/JsonReports"}

)


public class myRunner {
	
}
