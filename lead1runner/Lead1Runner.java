package lead1runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features="src/test/java/lead1feature/lead1.feature",
glue="lead1steps" ,
monochrome=true,
dryRun=false,
snippets=SnippetType.CAMELCASE)


public class Lead1Runner extends AbstractTestNGCucumberTests
{
	
}
