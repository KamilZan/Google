import org.testng.Assert;
import org.testng.annotations.Test;

public class InputTextAreaTest extends BaseTest {

    @Test
    public void checkTheUrl(){
        homePage.clickOnInputBtn()
                .clickOnInputTextarea();
        Assert.assertTrue(driver.getCurrentUrl().equals(inputTextareaPage.url));
    }
    @Test
    public void sendTextDefaultField(){
        homePage.clickOnInputBtn()
                .clickOnInputTextarea()
                .sendKeysToField();

    }
}
