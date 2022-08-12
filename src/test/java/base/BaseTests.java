package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class BaseTests {
    // initialize web driver
    private WebDriver driver;

    public void setUpChromeDriver(){
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        // get title of the current page
        System.out.println(driver.getTitle());
        // set window with a specific dimensions
        driver.manage().window().setSize(new Dimension(375,812));
        // full screen page
        //driver.manage().window().fullscreen();
        // maximize page
        //driver.manage().window().maximize();
    }

public static void main(String args[]){
 BaseTests baseTests=new BaseTests();
 baseTests.setUpChromeDriver();
}
}