import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SplitButtonTest extends BaseTest {
    @Test
    public void selectButtonFromList(){
        homePage.clickOnButtonBtn()
                .clickOnSplitButtonLink()
                .showFirstList()
                .clickSaveBtn();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='ui-growl-message']")).isDisplayed());
    }
    @Test
    public void selectButtonFromSecondList() throws InterruptedException {
        homePage.clickOnButtonBtn()
                .clickOnSplitButtonLink()
                .showSecondList()
                .chooseFromSecondList("Delete");
    }
}
