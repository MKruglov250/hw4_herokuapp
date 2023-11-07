package org.example;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class Hovers {

    ElementsCollection profiles = $$("div[class='figure']");

    SelenideElement hover1 = profiles.get(0);

    SelenideElement hover2 = profiles.get(1);

    SelenideElement hover3 = profiles.get(2);

    public String getNameProfileOne(){
        actions().moveToElement(hover1).build().perform();
        return hover1.find("div[class='figcaption']").find("h5").getText();
    }

    public String getNameProfileTwo(){
        actions().moveToElement(hover2).build().perform();
        return hover2.find("div[class='figcaption']").find("h5").getText();
    }

    public String getNameProfileThree(){
        actions().moveToElement(hover3).build().perform();
        return hover3.find("div[class='figcaption']").find("h5").getText();
    }

    public String pageProfileOne() throws InterruptedException {
        actions().moveToElement(hover1).build().perform();
        hover1.find("div[class='figcaption']").find("a").click();
        Thread.sleep(300);
        return $("h1").getText();
    }

    public String pageProfileTwo() throws InterruptedException {
        actions().moveToElement(hover2).build().perform();
        hover2.find("div[class='figcaption']").find("a").click();
        Thread.sleep(300);
        return $("h1").getText();
    }

    public String pageProfileThree() throws InterruptedException {
        actions().moveToElement(hover3).build().perform();
        hover3.find("div[class='figcaption']").find("a").click();
        Thread.sleep(300);
        return $("h1").getText();
    }
}
