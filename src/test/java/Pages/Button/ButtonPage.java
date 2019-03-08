package Pages.Button;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilis.WebDriverSingleton;

import java.util.List;

public class ButtonPage extends BasePage {
    public ButtonPage(WebDriver driver) {
        super(WebDriverSingleton.getInstance());
    }

    @FindBy(xpath = "//span[contains(text(),'Default')]")
    WebElement buttonDefault;
    @FindBy(xpath = "//span[contains(text(),'Left Icon')]")
    WebElement buttonLeftIcon;

    public ButtonPage clickOnButton(String buttonText) {
        By buttonChoose = By.xpath("//span[contains(text(),'" + buttonText + "')]");
        WebDriverSingleton.getInstance().findElement(buttonChoose).click();
        return this;
    }

    public ButtonPage clickOnButtonByID(String buttonId) {
        By buttonChoose = new By.ById("" + buttonId + "");
        WebDriverSingleton.getInstance().findElement(buttonChoose).click();
        return this;
    }



}

