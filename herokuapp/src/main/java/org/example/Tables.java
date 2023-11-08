package org.example;

import static com.codeborne.selenide.Selenide.$x;

public class Tables {

    public String getCellValue(int tableNumber, int tableRow, int tableCell){
        String xpath = "//table[@id='table" + tableNumber +
                "']//tr[" + tableRow + "]//td[" + tableCell +"]";
        return $x(xpath).getText();
    }
}
