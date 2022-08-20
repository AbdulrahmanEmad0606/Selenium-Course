package base;

import Pages.HomePage;
import Pages.MultipleWindowsPage;
import Utils.WindowManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

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