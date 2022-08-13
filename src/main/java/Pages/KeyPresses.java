package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPresses {
    private WebDriver driver;
    private By target=By.id("target");
    private By result=By.id("result");
    public KeyPresses(WebDriver driver){
        this.driver=driver;
    }
    public void getTarget(String text){
        driver.findElement(target).sendKeys(text);
    }
    // if I want to click more than one special key like ALT, Shift, Enter, CTRL, up, bottom, left, right, num lock
    public void enterPI(){
        // here I till him click on ALT then p char using Keys.chord function
        driver.findElement(target).sendKeys(Keys.chord(Keys.ALT,"p")+"=3.14");
    }
    public String getResult(){
        return driver.findElement(result).getText();
    }
}
