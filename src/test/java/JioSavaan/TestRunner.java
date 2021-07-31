package JioSavaan;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/feature/Homepage.feature",
            glue = {"JioSavaan.stepdef","listener"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
