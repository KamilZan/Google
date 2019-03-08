package Pages.Button;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilis.Actions;
import utilis.WebDriverSingleton;

import java.util.List;

import static utilis.Actions.*;

public class SplitButtonPage extends BasePage {
    public SplitButtonPage(WebDriver driver) {
        super(WebDriverSingleton.getInstance());
    }

    @FindBy(xpath = "//div[@id='ui-id-2']//ul[@class='ui-menu-list ui-helper-reset']")
    WebElement firstTable;
    @FindBy(xpath = "//div[@id='ui-id-1']//ul[@class='ui-menu-list ui-helper-reset']") WebElement secondTable;
    @FindBy(xpath = "//div[@id='ui-id-1']//div[@class='ui-menu ui-menu-dynamic ui-widget ui-widget-content ui-corner-all ui-helper-clearfix ui-shadow']")
    WebElement secondList;
    @FindBy(xpath = "//button[@id='btn']")
    WebElement firstBtn;
    @FindBy(xpath = "//button[@name='save-btn']")
    WebElement scondBTN;
    @FindBy(xpath = "//div[@id='ui-id-2']//button[2]")
    WebElement firstTableBTN;
    @FindBy(xpath = "//div[@id='ui-id-1']//button[@type='button']")
    WebElement secondListBTN;
    @FindBy(xpath = "//div[@id='messages']") WebElement message;
    // First buttonTable
    @FindBy(xpath = "//button[@type='button']//span[contains(text(),'Save')]") WebElement saveBtn;
    // Second buttonTable
    @FindBy(xpath = "//div[@id='ui-id-1']//span[contains(text(),'Update')]") WebElement updateBtnSec;
    @FindBy(xpath = "//div[@id='ui-id-1']//span[contains(text(),'Delete')]") WebElement deleteBtnSec;
    @FindBy(xpath = "//div[@id='ui-id-1']//span[contains(text(),'Homepage')]") WebElement homepageBtnSec;

    //variables


    public SplitButtonPage showFirstList() {
        waitForElementToBeClickable(firstTableBTN);
        click(firstTableBTN);
        return this;
    }

    public SplitButtonPage showSecondList() {
        waitForElementToBeClickable(secondListBTN);
        click(secondListBTN);
        return this;
    }

    public SplitButtonPage clickSaveBtn(){
        click(saveBtn);
        return this;
    }
    public SplitButtonPage chooseFromFirstList(String value) {
        List<WebElement> elementList = firstTable.findElements(By.tagName("span"));
        for (WebElement span : elementList) {
            if (span.getText().contains(value));
                span.click();
            System.out.println("Clicked on element " + value);
        }
        return this;
    }

public SplitButtonPage chooseFromSecondList(String choosed) {
    switch (choosed) {
        case "Update":
            click(updateBtnSec);
            break;
        case "Deleted":
            click(deleteBtnSec);
            break;
        case "Homepage":
            click(homepageBtnSec);
            break;
        default:
            System.out.println("Element not found, please use Update,Delete or Homepage");
    }            return this;
}
    public String getMessage(){
        waitForElementToBePresent(message);
        String mess = message.getText();
        return mess;
    }
    public String assertionMessage(String value){
        String expMess = value;
        return expMess;
    }
}
