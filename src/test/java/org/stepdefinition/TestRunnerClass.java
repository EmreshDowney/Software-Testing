package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue = "org.stepdefinition", dryRun = false, strict = true,
monochrome = true,
snippets = SnippetType.CAMELCASE,tags = "@ama", plugin = {"html:report" , "junit:report\\junitreport.xml" , "json:report\\jsonreport.json"}
 
)
public class TestRunnerClass {

}
