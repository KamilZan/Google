package Pages;

import Pages.Button.ButtonPage;
import Pages.Button.SplitButtonPage;
import Pages.Input.AutoCompletePage;
import Pages.Input.DatePickerPage;
import Pages.Input.InputTextareaPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilis.WebDriverSingleton;

import static utilis.Actions.click;
import static utilis.Actions.waitForElementToBeClickable;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Left Menu Btn
    @FindBy(xpath = "//span[contains(text(),'Input')]")
    WebElement menuInputBtn;
    @FindBy(xpath = "//span[contains(text(),'Data')]")
    WebElement menuDataBtn;
    @FindBy(xpath = "//span[contains(text(),'Panel')]")
    WebElement menuPanelBtn;
    @FindBy(xpath = "//span[contains(text(),'Overlay')]")
    WebElement menuOverlayBtn;
    @FindBy(xpath = "//span[contains(text(),'Menu')]")
    WebElement menuMenuBtn;
    @FindBy(xpath = "//span[contains(text(),'Messages')]")
    WebElement menuMessagesBtn;
    @FindBy(xpath = "//span[contains(text(),'Multimedia')]")
    WebElement menuMultimediaBtn;
    @FindBy(xpath = "//span[contains(text(),'Misc')]")
    WebElement menuMiscBtn;
    @FindBy(xpath = "//span[contains(text(),'Samples')]")
    WebElement menuSamplesBtn;
    @FindBy(xpath = "//span[@class='MainLinkText'][contains(text(),'Button')]") WebElement menuButton;
    //Containery
    @FindBy(xpath = "//div[@id='MENUSIDEindent']//div[1]") WebElement inputContainer;
    @FindBy(xpath = "//div[@id='MENUSIDEindent']//div[2]") WebElement buttonContainer;

    //Left menu - Button
    @FindBy(xpath = "//a[contains(text(),'● Button')]") WebElement menuButtonBTN;
    @FindBy(xpath = "//a[contains(text(),'● SplitButton')]") WebElement menuSplitButtonBTN;

    // Left menu - INPUT BTN

    @FindBy(xpath = "//a[contains(text(),'AutoComplete')]")
    WebElement menuAutoCompleteBTN;
    @FindBy(xpath = "//a[contains(text(),'InputTextarea')]")
    WebElement menuInputTextareaBTN;
    @FindBy(xpath = "//a[contains(text(),'Datepicker')]")
    WebElement menuDatePickerBTN;
    @FindBy(xpath = "//a[contains(text(),'Listbox')]")
    WebElement menuListBoxBTN;
    @FindBy(xpath = "//a[contains(text(),'Password')]")
    WebElement menuPasswordBTN;
    @FindBy(xpath = "//a[contains(text(),'Rating')]")
    WebElement menuRatingBTN;
    @FindBy(xpath = "//span[@id=\"SubMenu-Input\"][@class=\"MenuSideMainLink bordersOfMenuSide MenuSideMainLinkDark\"]") WebElement menuInputDatePickerVisible;

    //variables
    public String expectedUrl = "https://www.primefaces.org/primeui/";
    public String expectedTitle = "PrimeUI";


    public String getCurrentUrl(){
        String url = WebDriverSingleton.getInstance().getCurrentUrl();
        return url;
    }
    public String getCurrentTitle(){
        String title = WebDriverSingleton.getInstance().getTitle();
        return title;
    }
    public SplitButtonPage clickOnSplitButtonLink(){
        waitForElementToBeClickable(menuSplitButtonBTN);
        click(menuSplitButtonBTN);
        return new SplitButtonPage(WebDriverSingleton.getInstance());
    }
    public HomePage clickOnButtonBtn(){
        if (!buttonContainer.getAttribute("style").contains("display: block;")){
            click(menuButton);
        }
        return this;
    }
    public ButtonPage clickOnButtonLink(){
        waitForElementToBeClickable(menuButtonBTN);
        click(menuButtonBTN);
        return new ButtonPage(WebDriverSingleton.getInstance());
    }
    public HomePage clickOnInputBtn() {
        if (!inputContainer.getAttribute("style").contains("display: block;")){
            click(menuInputBtn);
        }
        return this;
    }
    public InputTextareaPage clickOnInputTextarea() {
        waitForElementToBeClickable(menuInputTextareaBTN);
        click(menuInputTextareaBTN);
        return new InputTextareaPage(WebDriverSingleton.getInstance());
    }
    public AutoCompletePage clickOnAutocomplete() {
        waitForElementToBeClickable(menuAutoCompleteBTN);
        click(menuAutoCompleteBTN);
        return new AutoCompletePage(WebDriverSingleton.getInstance());
    }
    public DatePickerPage clickOnDatepicker(){
        waitForElementToBeClickable(menuDatePickerBTN);
        click(menuDatePickerBTN);
        return new DatePickerPage(WebDriverSingleton.getInstance());
    }
}
