package Tests;

import DriverManager.DriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {

    protected WebDriver driver = DriverManager.getDriver();

    @AfterEach
    public void kill() {
        //driver.close();
        //driver.quit();
    }
}
