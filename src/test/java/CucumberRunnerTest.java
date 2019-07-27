import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:reports/test-report"},
        features = "src/test/resources")
public class CucumberRunnerTest {
   /*
    @BeforeClass
    public static void before() {
        Configuration.browserSize = "1600x1024";
        Configuration.browserCapabilities.setCapability("enableVNC", true);
        if ("true".equals(System.getProperty("video.enabled"))) {
            Configuration.browserCapabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities.setCapability("videoFrameRate", 24);
        }
*/

    }
