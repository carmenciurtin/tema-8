package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicButtonsSimpleTest extends BaseTest {

    @Test(description = "8.4")
    public void dynamicButtonsSimpleTest() {
        driver.findElement(By.cssSelector("a#button01")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("button00")).click();
        driver.findElement(By.id("button01")).click();
        driver.findElement(By.id("button02")).click();
        driver.findElement(By.id("button03")).click();

        String expectedMessage = "All Buttons Clicked";
        String actualMessage = driver.findElement(By.cssSelector("p#buttonmessage")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
        System.out.println(driver.findElement(By.cssSelector("p#buttonmessage")).getText());

        String expectedURL = "https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }
}
