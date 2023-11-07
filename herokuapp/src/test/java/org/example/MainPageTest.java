package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTest extends BaseTest {

    @Test
    public void headerMessageTest () {
        var messageText = new MainPage().getHeaderText();
        Assert.assertEquals(messageText, "Welcome to the-internet");
    }

    @Test
    public void examplesNameTest () {
        var messageText = new MainPage().getExamplesText();
        Assert.assertEquals(messageText, "Available Examples");
    }

    @Test
    public void checkNumberModulesIsFortyFour () {
        int modulesCount = new MainPage().getElementsListSize();
        Assert.assertEquals(modulesCount, 44);
    }

    @Test(priority = 1)
    public void checkABTestingPageOpens (){
        String expectedABTestingPageUrl = "http://the-internet.herokuapp.com/abtest";
        String realABTestingRageUrl = new MainPage().goToABTestingPage();
        Assert.assertEquals(expectedABTestingPageUrl, realABTestingRageUrl);
    }

}