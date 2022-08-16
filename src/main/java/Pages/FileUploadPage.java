package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By uploadBtn= By.id("file-upload");
    private By submitBtn=By.id("file-submit");
    private By message=By.cssSelector(".example h3");
    public FileUploadPage(WebDriver driver){
        this.driver=driver;
    }
    public void uploadFileAction(){
        driver.findElement(submitBtn).click();
    }
    public void UploadFile(String path){
        driver.findElement(uploadBtn).sendKeys(path);
        uploadFileAction();
    }
    public String uploadFileSuccessfully(){
        return driver.findElement(message).getText();
    }
}

