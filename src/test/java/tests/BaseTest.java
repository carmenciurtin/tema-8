package tests;

import driver.WebdriverSet;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public abstract class BaseTest {
    protected RemoteWebDriver driver = null;

    @BeforeMethod
    public void AccesareURL() throws MalformedURLException {
        driver = WebdriverSet.getRemoteChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
    }

    @AfterMethod (alwaysRun = true)
    public void InchidereURL(){
        if(driver != null){
            driver.quit();
        }
    }
}
