package testsForMobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicButtonsDisabledTest extends BaseTest {

    @Test(description = "8.5")
    public void dynamicButtonsDisabledTest() {
        driver.findElement(By.cssSelector("a#button02")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("button00")));
        driver.findElement(By.id("button00")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("button01")));
        driver.findElement(By.id("button01")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("button02")));
        driver.findElement(By.id("button02")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("button03")));
        driver.findElement(By.id("button03")).click();

        String expectedMessage = "All Buttons Clicked";
        String actualMessage = driver.findElement(By.cssSelector("p#buttonmessage")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
        System.out.println(driver.findElement(By.cssSelector("p#buttonmessage")).getText());

        String expectedURL = "https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }
}