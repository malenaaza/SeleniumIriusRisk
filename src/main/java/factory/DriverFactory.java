package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverFactory {

    public static WebDriver newDriver() {
        ChromeOptions chromeoption = new ChromeOptions();
        chromeoption.addArguments("--remote-allow-origins=*");
        //chromeoption.setHeadless(true);
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeoption);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        //driver.get("https://exercise.com/login.html");

        return driver;
    }
}
