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
    @Test(description = "Check that input field is empty after typing text keys")
    public void checkTextEntering(){
        Assert.assertTrue(inputsPage.setTextValue());
    }

    @Test(description = "Checking that typing integers is possible")
    public void checkSetInteger(){
        Assert.assertEquals(inputsPage.setIntValue(),5);
    }

    @Test(description = "Checking that ArrowUP control increases input value by 1")
    public void checkArrowUp(){
        Assert.assertEquals(inputsPage.arrowUpValue(),6);
    }

    @Test(description = "Checking that ArrowDOWN control decreases input value by 1")
    public void checkArrowDown(){
        Assert.assertEquals(inputsPage.arrowDownValue(),4);
    }

}