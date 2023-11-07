package org.example;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Dropdown {

    SelenideElement dropdown = $("select[id='dropdown']");

    public String checkDefaultValue(){
        return dropdown.find("option[selected='selected']").getText();
    }

    public String checkOption1(){
        dropdown.selectOption(1);
        return dropdown.find("option[selected='selected']").getText();
    }

    public String checkOption2(){
        dropdown.selectOption(2);
        return dropdown.find("option[selected='selected']").getText();
    }
}
