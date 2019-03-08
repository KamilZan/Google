package utilis;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions {

    public static void click(WebElement element){
        System.out.println("Clicking on element " + element.toString());
        element.click();
    }
    public static void sendKeys(WebElement element, String text){
        element.click();
        System.out.println("Sending keys: " + text + " to element " +element);
        element.clear();
        element.sendKeys(text);
    }
    public static void sendIntKeys(WebElement element, int digits){
        element.click();
        System.out.println("Sending keys: " + digits + " to element " +element);
        element.clear();
        element.sendKeys(String.valueOf(digits));
    }
    public static String waitForTextToBePresentInElement(WebElement element, String expectedText){
        WebDriverWait wait = new WebDriverWait(WebDriverSingleton.getInstance(), 10);
        System.out.println(element.getText()+" text apear");
        wait.until(ExpectedConditions.textToBePresentInElement(element,expectedText));
        return expectedText;
    }
    public static void waitForElementToBePresent(WebElement element){
        WebDriverWait wait = new WebDriverWait(WebDriverSingleton.getInstance(),10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        System.out.println("Specified element: " + element + " is present");
        }
        public static void waitForElementToBeClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(WebDriverSingleton.getInstance(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
            System.out.println("Specified element: "+ element + " is clickable");
        }

    public static String getTextFromELement (WebElement element){
        System.out.println("Getting text from: " + element);
        return element.getText();
    }
    public static String getTextFromElementAttribute(WebElement element, String value){
        System.out.println("Getting text from value: " + element +" the value from style is ");
        return element.getAttribute(value);
    }
}
