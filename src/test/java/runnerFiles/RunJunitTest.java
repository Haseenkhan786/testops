package runnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/Navigations.feature"
		//features ="@target/rerun.txt"
,glue = "stepDefinitions",
plugin= { "pretty","html:reports/myreport.html",
		"rerun:target/rerun.txt"
		} 
//,tags="@t1 or @t2" 
)
public class RunJunitTest {	
     
	
	
}

