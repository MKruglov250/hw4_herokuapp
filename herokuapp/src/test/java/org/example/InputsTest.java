package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class InputsTest extends BaseTest {
    Inputs inputsPage = new Inputs();

    @Test
    public void checkTextEntering(){
        open("inputs");
        Assert.assertTrue(inputsPage.setTextValue());
    }

    @Test
    public void checkSetInteger(){
        open("inputs");
        Assert.assertEquals(inputsPage.setIntValue(),5);
    }

    @Test
    public void checkArrowUp(){
        open("inputs");
        Assert.assertEquals(inputsPage.arrowUpValue(),6);
    }

    @Test
    public void checkArrowDown(){
        open("inputs");
        Assert.assertEquals(inputsPage.arrowDownValue(),4);
    }

}