package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.List;

public class BaseTests {
    // initialize web driver
    private WebDriver driver;

    public void setUpChromeDriver(){
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement inputs =driver.findElement(By.linkText("inputs"));
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        //find element using x-path;
        //WebElement inputs =driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[27]/a"));
        inputs.click();
    }

public static void main(String args[]){
 BaseTests baseTests=new BaseTests();
 baseTests.setUpChromeDriver();
}
}