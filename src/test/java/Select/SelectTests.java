package Select;

import Pages.DropDownPage;
import Pages.HomePage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class SelectTests extends BaseTests {
    @Test
    public void testSelectOptions(){
       DropDownPage dropDownPage= homePage.clickDropDown();
       String option="Option 1";
       dropDownPage.selectOption(option);
       assertEquals(dropDownPage.getSelectedOptions().size(),1);
       var selectedOptions = dropDownPage.getSelectedOptions();
    }
}
