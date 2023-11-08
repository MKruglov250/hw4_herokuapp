package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class CheckboxesTest extends BaseTest {
    Checkboxes checkboxesPage = new Checkboxes();

    @BeforeMethod
    public void openPage(){
        open("checkboxes");
    }

    @Test(description = "Checkbox 1 must be unchecked, Checkbox 2 must be checked")
    public void checkDefaultValues(){
        Assert.assertFalse(checkboxesPage.getCheckboxCheckedStatus(1));
        Assert.assertTrue(checkboxesPage.getCheckboxCheckedStatus(2));
    }

    @Test(description = "Check clicking on first checkbox works")
    public void checkClickOnFirstCheckbox(){
        checkboxesPage.clicksOnFirstCheckbox();
        Assert.assertTrue(checkboxesPage.getCheckboxCheckedStatus(1));
    }

    @Test (priority = 1, description = "Check clicking on second checkbox works")
    public void checkClickOnSecondCheckbox(){
        checkboxesPage.clicksOnSecondCheckbox();
        Assert.assertFalse(checkboxesPage.getCheckboxCheckedStatus(2));
    }
}