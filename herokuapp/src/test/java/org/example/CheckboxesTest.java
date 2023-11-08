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

    @Test
    public void checkDefaultValues(){
        Assert.assertFalse(checkboxesPage.getCheckboxCheckedStatus(1));
        Assert.assertTrue(checkboxesPage.getCheckboxCheckedStatus(2));
    }

    @Test
    public void checkClickOnFirstCheckbox(){
        checkboxesPage.clicksOnFirstCheckbox();
        Assert.assertTrue(checkboxesPage.getCheckboxCheckedStatus(1));
    }

    @Test (priority = 1)
    public void checkClickOnSecondCheckbox(){
        checkboxesPage.clicksOnSecondCheckbox();
        Assert.assertFalse(checkboxesPage.getCheckboxCheckedStatus(2));
    }
}