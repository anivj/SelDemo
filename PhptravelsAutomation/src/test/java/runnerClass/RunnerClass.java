package runnerClass;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

//import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java", tags = {"TestDemo"}
,glue= {"stepdefiniton"},plugin ={"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
monochrome = true )

public class RunnerClass {
@AfterClass
	public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("report.xml"));
	}
}