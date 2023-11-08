package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class NotificationMessagesTest extends BaseTest{

    NotificationMessages notificationMessages = new NotificationMessages();

    @BeforeMethod
    public void openPage(){
        open("/notification_message");
    }


    @Test(description = "Checking that Notification page is open")
    public void checkPageOpen(){
        Assert.assertEquals(notificationMessages.checkNotificationPageOpen(),
                "Notification Message");
    }

    @Test(description = "Checking Success message appears")
    public void checkSuccessMessage(){
        Assert.assertEquals(notificationMessages.checkSuccessMessage(),
                "Action successful\n" +
                        "×");
    }

    @Test(priority = 1, description = "Checking that Fail message appears")
    public void checkFailMessage(){
        Assert.assertEquals(notificationMessages.checkFailMessage(),
                "Action unsuccesful, please try again\n" +
                        "×");
    }

}