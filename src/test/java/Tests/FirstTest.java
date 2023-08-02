package Tests;

import static Steps.StepsAutomationPracticeForm.*;

import Pages.AutomationPracticeForm;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FirstTest extends BaseTest{

    @Test
    @DisplayName("Все поля заполнены")
    public void setFirtsNameToFirstNameField(){
        driver.get("https://demoqa.com/automation-practice-form");
        stepSetFirstName("Андрюха");
        stepSetLastName("Шелухин");
        stepSetEmail("Email_andrew@yandex.ru");
        stepClickGender("Woman");
        stepSetMobile("89625441314");
        stepSetSubjects("English");
        stepSetDateOfBirth("31.12.1899");
        stepSetCurrentAdress("Россия, Саратовская обл, г. Саратов, ул. Пушкина, д. 42.");
        stepUploadPhoto("C:\\Users\\user\\Desktop\\дпнн.png");
        stepSetHobbiesCheckBoxSports();
        stepSetHobbiesCheckBoxMusic();
        stepSetHobbiesCheckBoxReading();
        stepSetSubjects("Chemistry");
        stepSetState("Haryana");
    }
}
