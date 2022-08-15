package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By jsAlert=By.xpath("//ul/li[1]/button");
    private By jsConfirm=By.xpath("//ul/li[2]/button");
    private By jsPrompt=By.xpath("//ul/li[3]/button");
    private By resultText=By.id("result");
    public AlertsPage(WebDriver driver){
        this.driver=driver;
    }
    public void alertAction(){
         driver.findElement(jsAlert).click();
    }
    public void acceptAlertMessage(){
        driver.switchTo().alert().accept();
    }
    public String getRes(){
        return driver.findElement(resultText).getText();
    }
    public void confirmAction(){
        driver.findElement(jsConfirm).click();
    }
    public void dismissConfirmAlert(){
        driver.switchTo().alert().dismiss();
    }

    public void promptAction(){
        driver.findElement(jsPrompt).click();
    }
    public void setPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public void acceptPromptAlert(){
        driver.switchTo().alert().accept();
    }

}
