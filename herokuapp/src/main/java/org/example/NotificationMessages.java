package org.example;

import static com.codeborne.selenide.Selenide.$;

public class NotificationMessages {

    public String checkNotificationPageOpen(){
        return $("h3").getText();
    }

    public String checkSuccessMessage (){
        loadNewMessage();
        String messageText = $("div[id='flash']").getText();
        int attempts = 0;
        while(!messageText.contains("Action successful") && attempts < 10) {
            loadNewMessage();
            messageText = $("div[id='flash']").getText();
            attempts++;
        }
        if (attempts == 10) {
            return "Maximum attempts reached: Success Message Did Not Appear";
        }
        return messageText;
    }

    public String checkFailMessage (){
        loadNewMessage();
        String messageText = $("div[id='flash']").getText();
        int attempts = 0;
        while(!messageText.contains("Action unsuccesful") && attempts < 10) {
            loadNewMessage();
            messageText = $("div[id='flash']").getText();
            attempts++;
        }
        if (attempts == 10) {
            return "Maximum attempts reached: Unsuccess Message Did Not Appear";
        }
        return messageText;
    }

    public void loadNewMessage (){
        $("a[href='/notification_message']").click();
    }
}
