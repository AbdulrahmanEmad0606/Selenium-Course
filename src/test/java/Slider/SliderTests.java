package Slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SliderTests extends BaseTests {
    @Test
    public void testHorizontalSlider(){
        var slider = homePage.sliderPage();
        String val = "4";
        slider.slideHorizontalSlider(val);
        assertEquals(slider.getSliderValue(),val);
    }
}
