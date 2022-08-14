package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuPage {
    private WebDriver driver;
    public MenuPage(WebDriver driver){
        this.driver=driver;
    }
    public int getListCounts(){
       List<WebElement>lists= driver.findElements(By.cssSelector("ul li"));
        return lists.size();
    }
}
