package LoadingTests;

import Pages.DynamicLoadingExamplePage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestWaitUntilHidden extends BaseTests {
    @Test
    public void testWait1(){
        var loading1= homePage.dynamicLoadingExamplePage();
        var loading2= loading1.loadPage();
        loading2.clickStartButton();
            assertEquals(loading2.getMessageAfterLoadingHidden(),"Hello World!");
    }
    @Test
    public void testWaitTillTextLoaded(){
        var loading1= homePage.dynamicLoadingExamplePage();
        var loading2= loading1.loadPage2();
        loading2.clickOnSecondButton();
        assertEquals(loading2.getMessageAfterLoadingHidden(),"Hello World!");
    }
}
