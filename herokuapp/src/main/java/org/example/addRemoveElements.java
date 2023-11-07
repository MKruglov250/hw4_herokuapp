package org.example;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class addRemoveElements {

    SelenideElement pageName = $("h3");

    SelenideElement addButton = $("button[onclick='addElement()']");

    public static SelenideElement deleteButton;

    public String getPageName(){
        return pageName.getText();
    }

    public SelenideElement clickAddElementButton() throws InterruptedException {
        Thread.sleep(600);
        addButton.click();
        deleteButton = $("button[onclick='deleteElement']");
        return deleteButton;
    }

    public boolean clickDeleteButton() throws InterruptedException {
        Thread.sleep(600);
        deleteButton.click();
        return deleteButton.isDisplayed();
    }

}
