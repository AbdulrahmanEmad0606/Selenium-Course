package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentPage {
    private WebDriver driver;
    public ShiftingContentPage(WebDriver driver){
        this.driver=driver;
    }
    public MenuPage goTo(){
        driver.findElement(By.linkText("Example 1: Menu Element")).click();
        return new MenuPage(driver);
    }

}
