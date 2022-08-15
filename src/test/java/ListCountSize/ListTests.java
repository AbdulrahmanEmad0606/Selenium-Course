package ListCountSize;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class ListTests extends BaseTests {
    @Test
    public void testListCount(){
        var m = homePage.shiftting();
        var g = m.goTo();
        assertEquals(g.getListCounts(),5);
    }
}
