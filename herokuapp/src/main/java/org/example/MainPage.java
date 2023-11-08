package org.example;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    SelenideElement headerText = $("h1[class='heading']");

    SelenideElement examplesText = $("h2");

    ElementsCollection numberElements = $$("li");

    SelenideElement secondAbTestElement = numberElements.first().find("a");

    public String getHeaderText(){
        return headerText.getText();
    }
    public String getExamplesText(){
        return examplesText.getText();
    }

    public int getElementsListSize(){
        return numberElements.size();
    }

    public String goToABTestingPage(){
        secondAbTestElement.click();
        secondAbTestElement.should(disappear);
        return webdriver().object().getCurrentUrl();
    }
}
