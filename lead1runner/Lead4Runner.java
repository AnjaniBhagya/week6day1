package lead1runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features="src/test/java/lead1feature/lead4merge.feature",
glue="lead1steps" ,
monochrome=true,
dryRun=false,
snippets=SnippetType.CAMELCASE,publish=false)

public class Lead4Runner extends AbstractTestNGCucumberTests
{

}
