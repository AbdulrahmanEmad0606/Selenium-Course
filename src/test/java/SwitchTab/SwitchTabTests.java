package SwitchTab;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class SwitchTabTests extends BaseTests {
    @Test
    public void testSwitchTab(){
        homePage.multipleWindowsPage().clickHere();
        multipleWindowsPage().switchToTab("New Window");
    }

    @Test
    public void testWindowTabs(){
        var buttonPage = homePage.dynamicLoadingExamplePage().example2RightClick();
        multipleWindowsPage().switchToNewTab();
        assertEquals(buttonPage.isStartButtonDisplayed(), true);
    }
}
