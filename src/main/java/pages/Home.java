package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helper.Pages.home;

public class Home {

    private final WebDriver driver;

    private Home(WebDriver driver) {
        this.driver = driver;
    }

    public void goTo(){
        driver.get(home);
    }

    public static Home home(WebDriver driver) {
        return new Home(driver);
    }

    public WebElement okAlert(){
        return driver.findElement(By.id("ember13"));
    }
}
