package Iframe;

import Pages.HomePage;
import Pages.IframePage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class IframeTests extends BaseTests {
    @Test(priority = 1)
    public void testIframe(){
        var editorPage = homePage.iframePage();
        editorPage.clearTextArea();

        String text1 = "hello ";
        String text2 = "world";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(), text1, "Text from editor is incorrect");
    }

    /*
    @Test(priority = 2)
    public void testIdentation(){
        IframePage iframePage = homePage.iframePage();
        iframePage.setIdentation();
    }*/
}
