package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.file.WatchEvent;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void setUserName(String userName){
        WebElement userNameInput = driver.findElement(By.id("username"));
        userNameInput.sendKeys(userName);
    }
    public void SetPassword(String password){
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(password);
    }
    public SecureAreaPage clickLoginButton(){
        driver.findElement(By.tagName("button")).click();
        return new SecureAreaPage(driver);
    }

}
