import org.testng.annotations.Test;

public class DatePickerTest extends BaseTest {


    @Test
    public void changeMonth(){
        homePage.clickOnInputBtn()
                .clickOnDatepicker()
                .changeMonth("Next")
                .changeMonth("Next");
    }
    @Test
    public void setDayInCalendar() {
        homePage.clickOnInputBtn()
                .clickOnDatepicker()
                .setDate("15")
                .setDate("28");
    }
    @Test
    public void setDayOnCalendarPopup(){
        homePage.clickOnInputBtn()
                .clickOnDatepicker()
                .clickOnCalendarPopupInput()
                .setDatePopupCalendar("21");
    }
}
