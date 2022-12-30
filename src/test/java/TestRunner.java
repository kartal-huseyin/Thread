import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "src/test/java",
        plugin={"html:test-output/Pcucumber-reports2.html",
                "json:test-output/json-reports/Pcucumber2.json",
                "junit:test-output/xml-report/Pcucumber2.xml"}


)

public class TestRunner {

}
