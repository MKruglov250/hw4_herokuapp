package org.example;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class JavascriptAlerts {

    ElementsCollection popupButtons = $$("li");

    SelenideElement jsAlertButton = popupButtons.get(0).find("button");

    SelenideElement jsConfirmButton = popupButtons.get(1).find("button");

    SelenideElement jsPromptButton = popupButtons.get(2).find("button");

    SelenideElement resultMessage = $(By.id("result"));

    public String jsAlertButtonClick() throws InterruptedException {
        jsAlertButton.click();
        Thread.sleep(300);
        Alert alert = switchTo().alert();
        alert.accept();
        return resultMessage.getText();
    }

    public String jsConfirmButtonOkClick() throws InterruptedException {
        jsConfirmButton.click();
        Thread.sleep(300);
        Alert alert = switchTo().alert();
        alert.accept();
        return resultMessage.getText();
    }


    public String jsConfirmButtonCancelClick() throws InterruptedException {
        jsConfirmButton.click();
        Thread.sleep(300);
        Alert alert = switchTo().alert();
        alert.dismiss();
        return resultMessage.getText();
    }

    public String jsPromptButtonTest123Click() throws InterruptedException {
        jsPromptButton.click();
        Thread.sleep(300);
        Alert alert = switchTo().alert();
        alert.sendKeys("Test123");
        alert.accept();
        return resultMessage.getText();
    }

    public String jsPromptButtonCancelClick() throws InterruptedException {
        jsPromptButton.click();
        Thread.sleep(300);
        Alert alert = switchTo().alert();
        alert.dismiss();
        return resultMessage.getText();
    }

}
