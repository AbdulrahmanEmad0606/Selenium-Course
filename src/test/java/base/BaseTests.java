package base;

import Pages.HomePage;
import Pages.MultipleWindowsPage;
import Utils.WindowManager;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

public class BaseTests {
        protected HomePage homePage;
    // initialize web driver
    private WebDriver driver;
    @BeforeClass
    public void setUpChromeDriver() {
            System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/");
            homePage = new HomePage(driver);
    }
    // after every test that failed take a screenshot
    @AfterMethod
    public void recordFailure(ITestResult result){
        // if test fail then take a screenshot
        if(ITestResult.FAILURE == result.getStatus())
        {
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try{
                Files.move(screenshot, new File("Resources/Screenshots/" + result.getName() + ".png"));
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    @AfterMethod
    public void recordSuccess(ITestResult result){
        // if test fail then take a screenshot
        if(ITestResult.SUCCESS == result.getStatus())
        {
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try{
                Files.move(screenshot, new File("Resources/Screenshots/" + result.getName() + ".png"));
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
   public MultipleWindowsPage multipleWindowsPage(){
        return new MultipleWindowsPage(driver);
   }
    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
/*
    @AfterClass

    public void closeWebSite() {
        driver.quit();
    }*/
}