package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class CheckboxesTest extends BaseTest {
    Checkboxes checkboxesPage = new Checkboxes();

    @Test
    public void checkDefaultValues(){
        open("checkboxes");
        Assert.assertFalse(checkboxesPage.getCheckboxCheckedStatus(1));
        Assert.assertTrue(checkboxesPage.getCheckboxCheckedStatus(2));
    }

    @Test
    public void checkClickOnFirstCheckbox(){
        open("checkboxes");
        checkboxesPage.clicksOnFirstCheckbox();
        Assert.assertTrue(checkboxesPage.getCheckboxCheckedStatus(1));
    }

    @Test (priority = 1)
    public void checkClickOnSecondCheckbox(){
        open("checkboxes");
        checkboxesPage.clicksOnSecondCheckbox();
        Assert.assertFalse(checkboxesPage.getCheckboxCheckedStatus(2));
    }
}