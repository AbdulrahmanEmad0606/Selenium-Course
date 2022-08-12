package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public LoginPage authPage(){
        driver.findElement(By.linkText("Form Authentication")).click();
        return new LoginPage(driver);
    }
    public DropDownPage clickDropDown(){
        driver.findElement(By.linkText("Dropdown")).click();
        return new DropDownPage(driver);
    }
}
