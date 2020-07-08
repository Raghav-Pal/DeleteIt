
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="Include/features/demo2.feature",
		glue="",
		plugin={"pretty",
				"html:BDDReports/HTML",
				"json:BDDReports/JSON/jsonreports.json"}
		
		)
public class CucumberRunnerDemo2 {

}