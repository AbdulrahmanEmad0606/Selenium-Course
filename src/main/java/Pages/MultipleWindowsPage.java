package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {
    private WebDriver driver;
    private By clickHereLink = By.linkText("Click Here");

    public MultipleWindowsPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickHere(){
        driver.findElement(clickHereLink).click();
    }
    public void switchToTab(String tabTitle){
        var windows = driver.getWindowHandles();

        System.out.println("Number of tabs: " + windows.size());

        System.out.println("Window handles:");
        windows.forEach(System.out::println);

        for(String window : windows){
            System.out.println("Switching to window: " + window);
            driver.switchTo().window(window);

            System.out.println("Current window title: " + driver.getTitle());

            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }
    public void switchToNewTab(){
        var windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);
    }
}
