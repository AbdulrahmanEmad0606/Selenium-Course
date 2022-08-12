package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private WebDriver driver;
    public DropDownPage(WebDriver driver){
        this.driver=driver;
    }
    // select option from drop down
    public void selectOption(String option){
        Select select=new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText(option);
    }
    // get selected option
    public List<String> getSelectedOptions(){
        Select select=new Select(driver.findElement(By.id("dropdown")));
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        return selectedOptions.stream().map(e->e.getText()).collect(Collectors.toList());
    }

}
