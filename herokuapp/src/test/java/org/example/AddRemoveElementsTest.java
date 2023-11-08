package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class AddRemoveElementsTest extends BaseTest {

    public AddRemoveElements addRemoveElementsPage = new AddRemoveElements();

    @Test
    public void checkPageName(){
        open("add_remove_elements/");
        Assert.assertEquals(addRemoveElementsPage.getPageName(),"Add/Remove Elements");
    }

    @Test
    public void checkAddElementAddsDeleteButton() throws InterruptedException {
        open("add_remove_elements/");
        Assert.assertTrue(addRemoveElementsPage.clickAddElementButton());
    }

    @Test
    public void checkDeleteButtonWorks() throws InterruptedException{
        open("add_remove_elements/");
        Assert.assertFalse(addRemoveElementsPage.clickDeleteButton());
    }





}