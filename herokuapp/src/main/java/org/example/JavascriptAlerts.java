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

    public String jsAlertButtonClick(){
        jsAlertButton.click();
        Alert alert = switchTo().alert();
        alert.accept();
        return resultMessage.getText();
    }

    public String jsConfirmButtonOkClick() {
        jsConfirmButton.click();
        Alert alert = switchTo().alert();
        alert.accept();
        return resultMessage.getText();
    }


    public String jsConfirmButtonCancelClick() {
        jsConfirmButton.click();
        Alert alert = switchTo().alert();
        alert.dismiss();
        return resultMessage.getText();
    }

    public String jsPromptButtonTest123Click() {
        jsPromptButton.click();
        Alert alert = switchTo().alert();
        alert.sendKeys("Test123");
        alert.accept();
        return resultMessage.getText();
    }

    public String jsPromptButtonCancelClick() {
        jsPromptButton.click();
        Alert alert = switchTo().alert();
        alert.dismiss();
        return resultMessage.getText();
    }

}
