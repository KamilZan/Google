import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonTest extends BaseTest {
    @Test
    public void clickOnDefaultBtn(){
        homePage.clickOnButtonBtn()
                .clickOnButtonLink()
                .clickOnButtonByID("default")
                .clickOnButtonByID("icononly")
                .clickOnButtonByID("disabled");
    }
}
