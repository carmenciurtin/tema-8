package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class WebdriverSetMobile {

    public static ChromeDriver getChromedriver(){

        ChromeOptions chromeOptions = new ChromeOptions();
        Map<String, String> map = new HashMap<>();
        map.put("deviceName", "iPhone SE");
        chromeOptions.setExperimentalOption("mobileEmulation", map);

        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(chromeOptions);
    }
    public static RemoteWebDriver getRemoteChromeDriver() throws MalformedURLException {
        return new RemoteWebDriver(new URL("http://localhost:4444/"), new ChromeOptions());
    }
}
