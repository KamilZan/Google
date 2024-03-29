package utilis;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {
    private static WebDriver driver;
    private WebDriverSingleton(){}

public static WebDriver getInstance(){
    WebDriverManager.chromedriver().setup();
        if (driver == null){

            driver = new ChromeDriver();
        }
        return driver;
}
public static void quit() {
    if (driver != null) {
        driver.close();
    }
}
}
