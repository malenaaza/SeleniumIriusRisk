package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static helper.Pages.login;

public class Login {
    private final WebDriver driver;

    private Login(WebDriver driver) {
        this.driver = driver;
    }

    public void goToLoginPage() {
        driver.get(login);
    }
    public static Login login(WebDriver driver) {
        return new Login(driver);
    }

    public WebElement usermail(){
        return driver.findElement(By.id("user_email"));
    }

    public WebElement password(){
        return driver.findElement(By.id("password"));
    }

    public WebElement loginButton(){
        return driver.findElement(By.name("commit"));
    }

    public WebElement failAlert(){
        return driver.findElement(By.id("flash_alert"));
    }

    public void fillUsername(String username){
        driver.findElement(By.id("user_email")).sendKeys(username);

    }

    public void fillPassword(String password){
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(By.name("commit")).click();
    }
}
