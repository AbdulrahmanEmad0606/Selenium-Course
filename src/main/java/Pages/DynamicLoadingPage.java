package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage {
    private final WebDriver driver;
    private By loadingIndicator = By.id("loading");
    private final By message = By.id("finish");
    private  By startBtn = By.cssSelector("#start button");
    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

       // click first button
    public void clickStartButton(){
       driver.findElement(startBtn).click();
        WebDriverWait wait =new WebDriverWait(driver,5);
        // wait till loading hidden
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));

    }
    public void clickOnSecondButton() {
        driver.findElement(startBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(message));
    }

    public String getMessageAfterLoadingHidden() {
        return driver.findElement(message).getText();
    }
    public boolean isStartButtonDisplayed(){
        boolean exists = driver.findElements(startBtn).size() != 0;
        return exists;

    }
    // second button

}
