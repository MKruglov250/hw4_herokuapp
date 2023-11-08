package org.example;

import static com.codeborne.selenide.Selenide.$x;

public class Tables {

    public String getCellValue(int tableNumber, int tableRow, int tableCell){
        String xpath = String.format("//table[@id='table%d']//tr[%d]//td[%d]",
                tableNumber, tableRow, tableCell);
        return $x(xpath).getText();
    }
}
