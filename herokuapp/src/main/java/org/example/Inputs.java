package org.example;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.$;

public class Inputs {

    SelenideElement inputField = $("input[type='number']");

    public boolean setTextValue(){
        inputField.sendKeys("Test-value.%^& rrr");
        return inputField.getText().isEmpty();
    }

    public int setIntValue(){
        inputField.sendKeys("5");
        return Integer.parseInt(Objects.requireNonNull(inputField.getValue()));
    }

    public int arrowUpValue(){
        inputField.sendKeys("5");
        inputField.sendKeys(Keys.ARROW_UP);
        return Integer.parseInt(Objects.requireNonNull(inputField.getValue()));
    }

    public int arrowDownValue(){
        inputField.setValue("5");
        inputField.sendKeys(Keys.ARROW_DOWN);
        return Integer.parseInt(Objects.requireNonNull(inputField.getValue()));
    }
}
