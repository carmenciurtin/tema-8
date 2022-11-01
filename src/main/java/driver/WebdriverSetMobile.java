package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
}
