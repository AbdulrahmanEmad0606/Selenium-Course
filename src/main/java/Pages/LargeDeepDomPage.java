package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeDeepDomPage {
    private WebDriver driver;
    private By table = By.id("large-table");
    public LargeDeepDomPage(WebDriver driver){
        this.driver=driver;
    }
    // scroll by executing js
    public void scrollToTable(){
       WebElement tableToScroll =driver.findElement(table);
       // we write js script in string : arguments[0] => webElement we want to scroll to
       String script ="arguments[0].scrollIntoView()";
       // here we cast our driver to js driver to be able to execute js scripts
        ((JavascriptExecutor)driver).executeScript(script,tableToScroll);
    }
}
