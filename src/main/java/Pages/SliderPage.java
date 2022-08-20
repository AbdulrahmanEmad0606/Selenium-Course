package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SliderPage {
    private WebDriver driver;
    private By slider= By.xpath("//*[@id=\"content\"]/div/div/input");
    private By sliderValue=By.id("range");
    public SliderPage(WebDriver driver){
        this.driver=driver;
    }
    public void slideHorizontalSlider(String val){
        while (!getSliderValue().equals(val))
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
    }
    public String getSliderValue(){
        return driver.findElement(sliderValue).getText();
    }

    public static class MultipleWindowsPage {
    }
}
