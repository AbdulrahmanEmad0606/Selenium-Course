package Navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigator() {
        homePage.dynamicLoadingExamplePage().loadPage().clickStartButton();
        homePage.getWindowManager().goBack();
        homePage.getWindowManager().refreshPage();
        homePage.getWindowManager().goForward();
        homePage.getWindowManager().goTo("https://www.google.com");
    }
}
