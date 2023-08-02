package Pages;

import DriverManager.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class AutomationPracticeForm{
    private static WebDriver driver = DriverManager.getDriver();
    private static String FirstNameLocator = "//input[@id = \"firstName\"]";
    private static String LastNameLocator = "//input[@id = \"lastName\"]";
    private static String MaleLocator = "//input[@id = \"gender-radio-1\"]";
    private static String FemaleLocator = "//input[@id = \"gender-radio-2\"]";
    private static String OtherLocator = "//input[@id = \"gender-radio-3\"]";
    private static String EmailLocator = "//*[@id=\"userEmail\"]";
    private static String MobileLocator = "//div[@id = \"userNumber-wrapper\"]/div[@class = \"col-md-9 col-sm-12\"]/input[@id=\"userNumber\"]";
    private static String DateOfBirthLocator = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[1]/div/input";
    private static String DateMonthLocator = "#dateOfBirth > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__header > div.react-datepicker__header__dropdown.react-datepicker__header__dropdown--select > div.react-datepicker__month-dropdown-container.react-datepicker__month-dropdown-container--select > select > option:nth-child(";
    private static String DateYearLocator = "//*[@class = 'react-datepicker__year-select' ]//*[text() = '";
    private static String SubjectsLocator = "//*[@id=\"subjectsInput\"]";
    private static String HobbiesSportsLocator = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label";
    private static String HobbiesReadingLocator = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label";
    private static String HobbiesMusicLocator = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label";
    private static String SelectPictureLocator = "//input[@id = \"uploadPicture\"]";
    private static String CurrentAddressLocator = "//textarea[@placeholder='Current Address']";
    private static String SelectStateLocator = "<div class=\" css-1uccc91-singleValue\">Uttar Pradesh</div><div class=\"css-1g6gooi\"><div class=\"\" style=\"display: inline-block;\"><input autocapitalize=\"none\" autocomplete=\"off\" autocorrect=\"off\" id=\"react-select-3-input\" spellcheck=\"false\" tabindex=\"0\" type=\"text\" aria-autocomplete=\"list\" value=\"\" style=\"box-sizing: content-box; width: 2px; background: 0px center; border: 0px; font-size: inherit; opacity: 1; outline: 0px; padding: 0px; color: inherit;\"><div style=\"position: absolute; top: 0px; left: 0px; visibility: hidden; height: 0px; overflow: scroll; white-space: pre; font-size: 16px; font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, Roboto, &quot;Helvetica Neue&quot;, Arial, &quot;Noto Sans&quot;, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;, &quot;Noto Color Emoji&quot;; font-weight: 400; font-style: normal; letter-spacing: normal; text-transform: none;\"></div></div></div>";
    public static String SelectStateFieldLocator = "//*[@id=\"state\"]/div/div[1]";
    private static String SelectCityLocator;
    private static String SumbitLocator = "#userEmail";
    private static String NonClickedSpace = "//*[@id=\"app\"]/div/div/div[1]";

    public static void setFirstName(String firstName) {
        driver.findElement(By.cssSelector(FirstNameLocator)).sendKeys(firstName);
    }

    public static void setLastName(String lastName) {
        driver.findElement(By.cssSelector(LastNameLocator)).sendKeys(lastName);
    }

    public static void clickSumbit(){
        driver.findElement(By.xpath(SumbitLocator)).click();
    }

    public static void setMaleGener(){
        WebElement male = driver.findElement(By.cssSelector(MaleLocator));
        male.click();
        driver.findElement(By.xpath(NonClickedSpace)).click();
    }

    public static void setFemaleGener(){
        WebElement female = driver.findElement(By.cssSelector(FemaleLocator));
        female.click();
        driver.findElement(By.xpath(NonClickedSpace)).click();
    }

    public static void setOtherGener(){
        WebElement other = driver.findElement(By.cssSelector(OtherLocator));
        other.click();
        driver.findElement(By.xpath(NonClickedSpace)).click();
    }

    public static void setEmail(String email) {
        driver.findElement(By.xpath(EmailLocator)).sendKeys(email);
    }

    public static void setMobile(String mobile){
        driver.findElement(By.xpath(MobileLocator)).sendKeys(mobile);
        driver.findElement(By.xpath(NonClickedSpace)).click();
    }

    public static void setSubjects(String subject){
        WebElement subjects = driver.findElement(By.xpath(SubjectsLocator));
        subjects.click();
        subjects.sendKeys(subject);
        subjects.sendKeys(Keys.ENTER);
    }

    public static void setDateOfBirth(String mm, String yy, String dd){
        WebElement dateField = driver.findElement(By.xpath(DateOfBirthLocator));
        dateField.click();
        driver.findElement(By.cssSelector(DateMonthLocator + mm + ")")).click();
        driver.findElement(By.xpath(DateYearLocator + yy + "']")).click();
        WebElement monthXpath = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[" + mm + "]"));
        String month = monthXpath.getText();
        driver.findElement(By.xpath("//div[@aria-label[contains(.,'"+ month +"')] and text()=\"" + dd + "\"]")).click();
    }

    public static void setCurrentAddress(String currentAddress){
        driver.findElement(By.xpath(CurrentAddressLocator)).sendKeys(currentAddress);
    }

    public static void setPicture(String pathToFile){
        driver.findElement(By.xpath(SelectPictureLocator)).sendKeys(pathToFile);
    }

    public static void setHobbiesCheckBoxSports(){
        driver.findElement(By.xpath(HobbiesSportsLocator)).click();
    }

    public static void setHobbiesCheckBoxReading(){
        driver.findElement(By.xpath(HobbiesReadingLocator)).click();
    }

    public static void setHobbiesCheckBoxMusic(){
        driver.findElement(By.xpath(HobbiesMusicLocator)).click();
    }

    public static void setState(String state) {
        WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[10]/div[2]/div/div/div[2]/div"));
        element.click();
        driver.findElement(By.xpath(SelectStateFieldLocator)).sendKeys(state);
        driver.findElement(By.xpath(SelectStateFieldLocator)).sendKeys(Keys.ENTER);
// Close the browser
    }

}
