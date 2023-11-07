package org.example;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class BasicAuth {
    SelenideElement pageName = $("h3");

    SelenideElement pageMessage = pageName.sibling(0);

    public String getPageName(){
        return pageName.getText();
    }

    public String getPageMessage(){
        return pageMessage.getText();
    }

}
