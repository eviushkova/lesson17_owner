package guru.qa;

import com.codeborne.selenide.Configuration;
import config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void setConfig() {

        WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

        Configuration.baseUrl = config.getBaseURL();
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getBrowserVersion();

        if (config.getRemoteWebDriver()) {
            Configuration.remote = config.getRemoteURL();
        }
    }
}
