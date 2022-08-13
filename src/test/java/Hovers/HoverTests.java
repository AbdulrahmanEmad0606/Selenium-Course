package Hovers;

import Pages.HoversPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {
    @Test
    public void testHoverUser1(){
        HoversPage hoversPage =homePage.hoverPage();
       HoversPage.FigureCaption figureCaption= hoversPage.hoverOverFigure(1);
       assertTrue(figureCaption.isDisplayed(),"this is not correct caption");
        assertEquals(figureCaption.getHeaderTitle(),"name: user1","incorrect header title");
        assertTrue(figureCaption.getLink().endsWith("/users/1"),"incorrect Link");
        assertEquals(figureCaption.getLinkText(),"View profile","incorrect link text");
    }
}
