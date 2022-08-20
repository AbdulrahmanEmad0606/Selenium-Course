package JsExecutedTests;

import base.BaseTests;
import org.testng.annotations.Test;

public class ScrollToElementTests extends BaseTests {
    @Test
    public void scrollToTable(){
        var scrollTo = homePage.largeDeepDom();
        scrollTo.scrollToTable();
    }
}
