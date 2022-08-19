package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingExamplePage {
    private WebDriver driver;
    private By link = By.linkText("Example 1: Element on page that is hidden");
    private By startLink2=By.linkText("Example 2: Element rendered after the fact");
    public DynamicLoadingExamplePage(WebDriver driver){
        this.driver=driver;
    }
    public DynamicLoadingPage loadPage(){
        driver.findElement(link).click();
        return new DynamicLoadingPage(driver);
    }
    public DynamicLoadingPage loadPage2(){
        driver.findElement(startLink2).click();
        return new DynamicLoadingPage(driver);
    }
}
