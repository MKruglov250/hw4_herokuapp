package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class AddRemoveElementsTest extends BaseTest {

    public AddRemoveElements addRemoveElementsPage = new AddRemoveElements();

    @BeforeMethod
    public void openPage(){
        open("add_remove_elements/");
    }

    @Test
    public void checkPageName(){
        Assert.assertEquals(addRemoveElementsPage.getPageName(),"Add/Remove Elements");
    }

    @Test
    public void checkAddElementAddsDeleteButton() {
        Assert.assertTrue(addRemoveElementsPage.clickAddElementButton());
    }

    @Test
    public void checkDeleteButtonWorks() {
        Assert.assertFalse(addRemoveElementsPage.clickDeleteButton());
    }

}