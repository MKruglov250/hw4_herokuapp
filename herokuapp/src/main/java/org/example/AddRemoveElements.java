package org.example;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AddRemoveElements {

    SelenideElement pageName = $("h3");

    SelenideElement addButton = $("button[onclick='addElement()']");

   SelenideElement deleteButton;

    public String getPageName(){
        return pageName.getText();
    }

    public boolean clickAddElementButton() throws InterruptedException {
        Thread.sleep(600);
        addButton.click();
        addButton.click();
        deleteButton = $("button[onclick='deleteElement()']");
        return deleteButton.isDisplayed();
    }

    public boolean clickDeleteButton() throws InterruptedException {
        Thread.sleep(600);
        addButton.click();
        deleteButton = $("button[onclick='deleteElement()']");
        deleteButton.click();
        return deleteButton.isDisplayed();
    }

}
