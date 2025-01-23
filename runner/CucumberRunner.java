package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/hooksAccount"}, 
                        glue = {"hooksStepDefinition","hooks"},
                        publish = true,
                        monochrome = true,
                        tags ="@Account"
)
public class CucumberRunner extends AbstractTestNGCucumberTests{

}