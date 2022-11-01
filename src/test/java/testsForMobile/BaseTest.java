package testsForMobile;


import driver.WebdriverSetMobile;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    protected ChromeDriver driver = null;

    @BeforeMethod
    public void AccesareURL(){
        driver = WebdriverSetMobile.getChromedriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
    }

    @AfterMethod (alwaysRun = true)
    public void InchidereURL(){
        if(driver != null){
            driver.quit();
        }
    }
}
