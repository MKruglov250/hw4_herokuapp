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

    @Test
    public void testJsAlertPopup() throws InterruptedException {
        Assert.assertEquals(alertsPage.jsAlertButtonClick(),"You successfully clicked an alert");
    }

    @Test
    public void testJsConfirmOK() throws InterruptedException {
        Assert.assertEquals(alertsPage.jsConfirmButtonOkClick(), "You clicked: Ok");
    }

    @Test
    public void testJsConfirmCancel() throws InterruptedException {
        Assert.assertEquals(alertsPage.jsConfirmButtonCancelClick(), "You clicked: Cancel");
    }

    @Test
    public void testJsPromptEnterTextTest123() throws InterruptedException {
        Assert.assertEquals(alertsPage.jsPromptButtonTest123Click(), "You entered: Test123");
    }

    @Test
    public void testJsPromtCancel() throws InterruptedException {
        Assert.assertEquals(alertsPage.jsPromptButtonCancelClick(), "You entered: null");
    }

}