package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(features = 	"C:\\Projetos\\cucumberTest\\src\\test\\java\\features\\integration.feature"
						,glue={	"steps2"}
		,dryRun = false
		)
public class Runner {

}
