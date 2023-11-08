package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class JavascriptAlertsTest extends BaseTest{

    JavascriptAlerts alertsPage = new JavascriptAlerts();

    @BeforeMethod
    public void openPage(){
        open("javascript_alerts");
    }

    @Test(description = "Triggering Alert popup")
    public void testJsAlertPopup() {
        Assert.assertEquals(alertsPage.jsAlertButtonClick(),"You successfully clicked an alert");
    }

    @Test(description = "Triggering Confirmation popup and pressing OK")
    public void testJsConfirmOK() {
        Assert.assertEquals(alertsPage.jsConfirmButtonOkClick(), "You clicked: Ok");
    }

    @Test(description = "Triggering Confirmation popup and pressing Cancel")
    public void testJsConfirmCancel() {
        Assert.assertEquals(alertsPage.jsConfirmButtonCancelClick(), "You clicked: Cancel");
    }

    @Test(description = "Triggering Prompt popup and entering Test123 text")
    public void testJsPromptEnterTextTest123() {
        Assert.assertEquals(alertsPage.jsPromptButtonTest123Click(), "You entered: Test123");
    }

    @Test(description = "Triggering Prompt popup and pressing Cancel")
    public void testJsPromptCancel() {
        Assert.assertEquals(alertsPage.jsPromptButtonCancelClick(), "You entered: null");
    }

}