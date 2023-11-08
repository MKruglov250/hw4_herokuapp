package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class InputsTest extends BaseTest {
    Inputs inputsPage = new Inputs();

    @BeforeMethod
    public void openPage(){
        open("inputs");
    }
    @Test
    public void checkTextEntering(){
        Assert.assertTrue(inputsPage.setTextValue());
    }

    @Test
    public void checkSetInteger(){
        Assert.assertEquals(inputsPage.setIntValue(),5);
    }

    @Test
    public void checkArrowUp(){
        Assert.assertEquals(inputsPage.arrowUpValue(),6);
    }

    @Test
    public void checkArrowDown(){
        Assert.assertEquals(inputsPage.arrowDownValue(),4);
    }

}