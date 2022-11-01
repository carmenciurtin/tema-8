package testsForMobile;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RefreshPageTest extends BaseTest {

    @Test (description = "8.3")
    public void refreshPageTest() throws InterruptedException {
        driver.findElement(By.id("refreshtest")).click();

        String valueId1 = driver.findElement(By.id("refreshdate")).getText();
        System.out.println(valueId1);

        Thread.sleep(2000);
        driver.navigate().refresh();
        String valueId2 = driver.findElement(By.id("refreshdate")).getText();
        System.out.println(valueId2);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Thread.sleep(2000);
        driver.navigate().refresh();
        String valueId3 = driver.findElement(By.id("refreshdate")).getText();
        System.out.println(valueId3);

        Assert.assertNotEquals(valueId1, valueId2);
        Assert.assertNotEquals(valueId2, valueId3);
    }
}
