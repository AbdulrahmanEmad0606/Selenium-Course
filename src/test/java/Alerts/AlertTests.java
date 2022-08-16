package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AlertTests extends BaseTests {
    @Test
    public void testSuccessAlert(){
        var alertConfirm= homePage.alertsPage();
        alertConfirm.alertAction();
        alertConfirm.acceptAlertMessage();
        assertEquals(alertConfirm.getRes(),"You successfully clicked an alert");
    }
    @Test
    public void testDismissConfirm(){
        var alertConfirm= homePage.alertsPage();
        alertConfirm.confirmAction();
        alertConfirm.dismissConfirmAlert();
        assertEquals(alertConfirm.getRes(),"You clicked: Cancel");
    }

    @Test
    public void testAcceptPrompt(){
        var alertConfirm= homePage.alertsPage();
        alertConfirm.promptAction();
        String text = "Egypt";
        alertConfirm.setPrompt(text);
        alertConfirm.acceptPromptAlert();
        assertEquals(alertConfirm.getRes(),"You entered: "+text);
    }
}
