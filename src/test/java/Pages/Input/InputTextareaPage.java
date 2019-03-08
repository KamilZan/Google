package Pages.Input;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import utilis.WebDriverSingleton;

import static utilis.Actions.sendKeys;


public class InputTextareaPage extends BasePage {

    public InputTextareaPage(WebDriver driver) {
        super(WebDriverSingleton.getInstance());
    }

    //Input fields
    @FindBy(id = "basic")
    WebElement defaultField;



    // variables
    public String url = "https://www.primefaces.org/primeui/#inputtextarea";
    public String defaultText = "Some kind of default Text to send!";


    public InputTextareaPage sendKeysToField(){
        sendKeys(defaultField,defaultText);
        return this;
    }




}
