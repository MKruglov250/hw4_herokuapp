package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class addRemoveElementsTest extends BaseTest {

    public addRemoveElements addRemoveElementsPage = new addRemoveElements();

    @Test
    public void checkPageName(){
        open("add_remove_elements/");
        Assert.assertEquals(addRemoveElementsPage.getPageName(),"Add/Remove Elements");
    }

    @Test
    public void checkAddElementAddsDeleteButton() throws InterruptedException {
        open("add_remove_elements/");
        Assert.assertNotNull(addRemoveElementsPage.clickAddElementButton());
    }

    // Test is broken because page is reloaded after AddElement test for some reason...
//    @Test(priority=1)
//    public void checkSecondTimeAddElementAddsDeleteButton() throws InterruptedException {
//        Assert.assertFalse(addRemoveElementsPage.clickDeleteButton());
//    }





}