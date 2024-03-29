import Pages.Input.AutoCompletePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutoCompleteTest extends BaseTest {

    @Test
    public void sendKeysToBssicField(){
        homePage.clickOnInputBtn()
                .clickOnAutocomplete()
                .sendKaysToBasicField("Some text to send");
    }

    @Test
    public void selectFromDropdown(){
        homePage.clickOnInputBtn()
                .clickOnAutocomplete()
                .clickOnDropdownBtn()
                .selectCountryFromList("Albania");
    }
    @Test
    public void sendKeysToContentField()  {
        homePage.clickOnInputBtn()
                .clickOnAutocomplete()
                .contentSelectField("s", "start");
    }
    @Test
    public  void chooseSpecifiedValueFromTheMultipleList() throws InterruptedException {
        homePage.clickOnInputBtn()
                .clickOnAutocomplete()
                .multiChoiceAutoComplete("egy", "Egypt");
//                .multipleField("r", "Rwanda");
        Assert.assertTrue(AutoCompletePage.information.getText().contains("Rwanda"));
    }

    @Test
    public void chooseSpecifiedValueInRemoteField(){
        homePage.clickOnInputBtn()
                .clickOnAutocomplete()
                .remoteSelectValue("e","eggplant");
    }
    @Test
    public void chooseSpecificValueInPrimeElementField(){
        homePage.clickOnInputBtn()
                .clickOnAutocomplete()
                .choosePrimeElement("f", "flick");
    }
}
