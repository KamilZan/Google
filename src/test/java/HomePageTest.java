import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void checkUrl(){
        Assert.assertTrue(homePage.getCurrentUrl().equals(homePage.expectedUrl));
    }
    @Test
    public void checkTitle(){
        Assert.assertTrue(homePage.getCurrentTitle().equals(homePage.expectedTitle));
    }
}
