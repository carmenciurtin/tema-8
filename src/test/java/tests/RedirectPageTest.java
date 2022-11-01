package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RedirectPageTest extends BaseTest {

    @Test (description = "8.2")
    public void clickButtonsTest() {
        driver.findElement(By.id("redirecttest")).click();

        driver.findElement(By.id("delaygotobasic")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.id("goback")).click();

        driver.findElement(By.id("delaygotobounce")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.id("goback")).click();

        String expectedURL = "https://testpages.herokuapp.com/styled/javascript-redirect-test.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);

    }
}
