package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void TestUpload(){
        var fileUpload =homePage.fileUpload();
        fileUpload.UploadFile("E:/Testing/Automation Testing/Java/OOP/SeleniumCourse/Resources/chromedriver.exe");
        assertEquals(fileUpload.uploadFileSuccessfully(),"File Uploaded!","File not uploaded");
    }
}
