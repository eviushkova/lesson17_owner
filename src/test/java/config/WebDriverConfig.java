package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${environment}.properties"
})

public interface WebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("baseUrl")
    @DefaultValue("https://qa.guru/#")
    String getBaseURL();

    @Key("remoteWebDriver")
    @DefaultValue("false")
    Boolean getRemoteWebDriver();

    @Key("remoteUrl")
    String getRemoteURL();

}
