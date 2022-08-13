package KeyPresses;

import Pages.KeyPresses;
import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeyPressessTests extends BaseTests {
    @Test
    public void testBackSpace(){
        KeyPresses keyPresses = homePage.keyPresses();
        keyPresses.getTarget("A" + Keys.BACK_SPACE);
        assertEquals(keyPresses.getResult(),"You entered: BACK_SPACE","you don't enter backspace");
    }
    @Test(priority = 1)
    public void testPi(){
        KeyPresses keyPresses = homePage.keyPresses();
        keyPresses.enterPI();
        assertEquals(keyPresses.getResult(),"You entered: 4");
    }
}
