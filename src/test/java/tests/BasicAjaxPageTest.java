package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class BasicAjaxPageTest extends BaseTest {

    @Test (description = "8.1")
    public void dropDownTest() {
        driver.findElement(By.id("basicajaxtest")).click();
        Select dropDownCategory = new Select(driver.findElement(By.id("combo1")));
        String categoryId = "2";
        dropDownCategory.selectByValue(categoryId);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ajaxBusy")));
        Select dropDownLanguage = new Select(driver.findElement(By.id("combo2")));
        String languageId = "12";
        dropDownLanguage.selectByValue(languageId);
        driver.findElement(By.cssSelector("input.styled-click-button")).click();

        String expectedURL = "https://testpages.herokuapp.com/styled/the_form_processor.php?ajax=1";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);

        WebElement categoryId2 = driver.findElement(By.id("_valueid"));
        Assert.assertEquals(categoryId, categoryId2.getText());
        WebElement languageId2 = driver.findElement(By.id("_valuelanguage_id"));
        Assert.assertEquals(languageId, languageId2.getText());
    }
}