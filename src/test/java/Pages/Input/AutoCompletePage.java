package Pages.Input;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilis.WebDriverSingleton;

import java.util.List;

import static utilis.Actions.*;

public class AutoCompletePage extends BasePage {
    public AutoCompletePage(WebDriver driver) {
        super(WebDriverSingleton.getInstance());
    }

    @FindBy(id = "basic")
    WebElement basicInputField;
    @FindBy(id = "dropdown")
    WebElement dropdownField;
    @FindBy(xpath = "//span[@class='fa fa-fw fa-caret-down']")
    WebElement dropdownBtn;
    @FindBy(xpath = "//body/div[5]")
    WebElement dropdownList;
    @FindBy(xpath = "//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']")
    WebElement listCountry;
    @FindBy(id = "customcontent")
    WebElement contentField;
    @FindBy(xpath = "//input[@name='multiple']")
    WebElement multipleField;
    @FindBy(xpath = "//input[@name='remote']")
    WebElement remoteField;
    @FindBy(xpath = "//input[@name='element']")
    WebElement primeElementField;


    public AutoCompletePage sendKaysToBasicField(String chars) {
        sendKeys(basicInputField, chars);
        return this;
    }

    public AutoCompletePage clickOnDropdownBtn() {
        click(dropdownBtn);
        return this;
    }

    public AutoCompletePage selectCountryFromList(String country) {
        List<WebElement> countriesList = dropdownList.findElements(By.tagName("li"));
        for (WebElement li : countriesList) {
            if (li.getText().equals(country)) {
                li.click();
            }
        }
        return this;
    }

    public AutoCompletePage multipleField(String firstchar, String value1) {
        sendKeys(multipleField, firstchar);
        List<WebElement> multiSelectList = multipleField.findElements(By.tagName("li"));
        for (WebElement li : multiSelectList) {
            if (li.getText().equals(value1))
                li.click();
        }
        System.out.println("Clicking on pecyfied string: '" + value1 + "'");
        return this;
    }

    public AutoCompletePage contentSelectField(String firstChar, String value1) {
        sendKeys(multipleField, firstChar);
        List<WebElement> contentList = contentField.findElements(By.tagName("li"));
        for (WebElement li : contentList) {
            if (li.getText().equals(value1))
                li.click();
        }
        System.out.println("Clicking on pecyfied string: '" + value1 + "'");
        return this;
    }

    public AutoCompletePage remoteSelectValue(String firstChar, String value) {
        sendKeys(remoteField, firstChar);
        List<WebElement> remoteList = remoteField.findElements(By.tagName("li"));
        for (WebElement li : remoteList) {
            if (li.getText().equals(value)) ;
            li.click();
        }
        System.out.println("Clicking on: '" + value + "'");
        return this;
    }

    public AutoCompletePage choosePrimeElement(String firstChar, String value) {
        sendKeys(primeElementField, firstChar);
        List<WebElement> primeElementList = primeElementField.findElements(By.tagName("li"));
        for (WebElement li : primeElementList) {
            if (li.getText().equals(value)) ;
            li.click();
            System.out.println(li.getText());
        }
        System.out.println("Clicking on: " + value);
        return this;
    }

}



