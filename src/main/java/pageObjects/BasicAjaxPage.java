package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicAjaxPage {

    public BasicAjaxPage(ChromeDriver driver){
        PageFactory.initElements(driver, "https://testpages.herokuapp.com/styled/basic-ajax-test.html");
    }

    @FindBy(css = "input.styled-click-button")
    private WebElement buttonCodeInIt;

    @FindBy(css = "select#combo1")
    private WebElement category;

    @FindBy(css = "select#combo2")
    private WebElement language;

    public WebElement getButtonCodeInIt() {
        return buttonCodeInIt;
    }

    public WebElement getCategory() {
        return category;
    }

    public WebElement getLanguage() {
        return language;
    }
}
