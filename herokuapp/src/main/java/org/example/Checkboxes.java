package org.example;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Checkboxes {




    public boolean getCheckboxCheckedStatus(int checkboxNumber){
        return getCheckboxesContainer().find("input[type='checkbox']",
                checkboxNumber-1).isSelected();
    }

    public void clicksOnFirstCheckbox(){
        getCheckboxesContainer().find("input[type='checkbox']").click();
    }

    public void clicksOnSecondCheckbox(){
        getCheckboxesContainer().find("input[type='checkbox']", 1).click();
    }

    public SelenideElement getCheckboxesContainer (){
        return $x("//div[@class='example']");
    }
}
