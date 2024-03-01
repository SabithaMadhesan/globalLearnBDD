package globallearn.testrunners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features", glue= "globallearn/stepdefinitions",tags= "@smoke", 
plugin = {"pretty", "html:target/manageLearningPlan-reports" })
public class ManageLearnPlanTestRunner{
	
}
