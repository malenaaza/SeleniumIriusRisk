package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static factory.DriverFactory.newDriver;

public class WebDriverTestCase {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        driver = newDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
