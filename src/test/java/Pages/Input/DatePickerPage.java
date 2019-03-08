package Pages.Input;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilis.WebDriverSingleton;

import static utilis.Actions.click;

public class DatePickerPage extends BasePage {
    public DatePickerPage(WebDriver driver) {
        super(WebDriverSingleton.getInstance());
    }

    @FindBy(xpath = "//span[@class='ui-datepicker-month']")
    WebElement dateMonthvalue;
    @FindBy(xpath = "//span[@class='ui-datepicker-year']")
    WebElement dateYearValue;
    @FindBy(xpath = "//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all']")
    WebElement datePickerHeader;
    @FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-w']")
    WebElement prevMonth;
    @FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-e']")
    WebElement nextMonth;
    @FindBy(xpath = "//p-datepicker[2]//input[1]")
    WebElement calendarPopupInput;


    public DatePickerPage changeMonth(String value) {
        if (value == "Next") {
            System.out.println("Clicking on Next BTN");
            click(nextMonth);
        } else if (value == "Prev") {
            System.out.println("Clicking on Prev BTN");
            click(prevMonth);
        }
        System.out.println(datePickerHeader.getText());
        return this;
    }

    public String getDateFromPage() {
        String str = datePickerHeader.getText();
        return str;
    }
    public DatePickerPage setDate(String day) {
        By calendar =  By.xpath("//div[@class='ui-datepicker-inline ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all']//a[@class='ui-state-default'][contains(text(),'"+day+"')]");
        WebDriverSingleton.getInstance().findElement(calendar).click();
        return this;
    }
    public DatePickerPage clickOnCalendarPopupInput(){
        click(calendarPopupInput);
        return this;
    }
    public DatePickerPage setDatePopupCalendar(String day){
        By calendarPopup = By.xpath("//div[@class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all']//a[@class='ui-state-default'][contains(text(),'"+day+"')]");
        WebDriverSingleton.getInstance().findElement(calendarPopup).click();
        return this;
    }
}