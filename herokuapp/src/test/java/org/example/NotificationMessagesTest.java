package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class NotificationMessagesTest extends BaseTest{

    NotificationMessages notificationMessages = new NotificationMessages();

    @Test
    public void checkPageOpen(){
        open("/notification_message");
        Assert.assertEquals(notificationMessages.checkNotificationPageOpen(),
                "Notification Message");
    }

    @Test
    public void checkSuccessMessage(){
        open("/notification_message");
        Assert.assertEquals(notificationMessages.checkSuccessMessage(),
                "Action successful\n" +
                        "×");
    }

    @Test(priority = 1)
    public void checkFailMessage(){
        open("/notification_message");
        Assert.assertEquals(notificationMessages.checkFailMessage(),
                "Action unsuccesful, please try again\n" +
                        "×");
    }

}