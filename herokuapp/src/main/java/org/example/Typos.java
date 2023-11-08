package org.example;

import com.codeborne.selenide.Selenide;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Typos {

    public String checkPageOpens(){
        return $("h3").getText();
    }

    public boolean checkNoTypo() {
        int attempts = 0;
        boolean typoFound = false;
        String message = getMessageText();
        while (attempts < 10 && !typoFound) {
            typoFound = (Objects.equals(message,
                    "Sometimes you'll see a typo, other times you won't."));
            attempts++;
            Selenide.refresh();
            message = getMessageText();
        }
        return typoFound;
    }

    public String getMessageText(){
        return $$("p").get(1).getText();
    }
}
