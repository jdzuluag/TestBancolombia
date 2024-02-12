package co.com.certification.bancolombia.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class OwnWebDriver {
    private static WebDriver driver;

    public static OwnWebDriver nuevo(){return new OwnWebDriver();}

    public WebDriver chrome(String url){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("PageLoadStrategy","none");
        capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,"true");

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("enable-automation");

        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        capabilities.setCapability(ChromeOptions.CAPABILITY,options);

        driver = new ChromeDriver(capabilities);
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.get(url);
        return driver;
    }
}
