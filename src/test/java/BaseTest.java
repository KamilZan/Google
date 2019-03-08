import Pages.Input.AutoCompletePage;
import Pages.Button.ButtonPage;
import Pages.Button.SplitButtonPage;
import Pages.Input.DatePickerPage;
import Pages.HomePage;
import Pages.Input.InputTextareaPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utilis.WebDriverSingleton;


public class BaseTest {
    protected WebDriver driver;
    HomePage homePage;
    InputTextareaPage inputTextareaPage;
    AutoCompletePage autoCompletePage;
    DatePickerPage datePickerPage;
    ButtonPage buttonPage;
    SplitButtonPage splitButtonPage;



    @BeforeTest

    public void setUp() {
        driver = WebDriverSingleton.getInstance();
        driver.get("https://www.primefaces.org/primeui/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        inputTextareaPage = new InputTextareaPage(driver);
        autoCompletePage = new AutoCompletePage(driver);
        datePickerPage = new DatePickerPage(driver);
        buttonPage = new ButtonPage(driver);
        splitButtonPage = new SplitButtonPage(driver);


    }

    @AfterTest
    public void tearDown() {
        WebDriverSingleton.quit();
    }

}
