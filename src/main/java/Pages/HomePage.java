package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.image.Kernel;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public LoginPage authPage(){
        getElement("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage clickDropDown(){
        getElement("Dropdown");
        return new DropDownPage(driver);
    }
    public HoversPage hoverPage(){
        getElement("Hovers");
        return new HoversPage(driver);
    }
    public KeyPresses keyPresses(){
        getElement("Key Presses");
        return new KeyPresses(driver);
    }
    public SliderPage sliderPage(){
        getElement("Horizontal Slider");
        return new SliderPage(driver);
    }
    private void getElement(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
