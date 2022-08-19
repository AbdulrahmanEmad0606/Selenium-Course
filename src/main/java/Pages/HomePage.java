package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.image.Kernel;
import java.io.File;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public ShiftingContentPage shiftting(){
        getElement("Shifting Content");
        return new ShiftingContentPage(driver);
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
    public AlertsPage alertsPage(){
        getElement("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public IframePage iframePage(){
        getElement("WYSIWYG Editor");
        return new IframePage(driver);
    }
    public FileUploadPage fileUpload(){
        getElement("File Upload");
        return new FileUploadPage(driver);
    }

    private void getElement(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
