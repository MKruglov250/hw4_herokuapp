package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class MainPageTest extends BaseTest {

    MainPage mainPage = new MainPage();

    @BeforeMethod
    public void openPage(){
        open(".");
    }


    @Test(description = "Checking name of page in Header")
    public void headerMessageTest () {
        Assert.assertEquals(mainPage.getHeaderText(), "Welcome to the-internet");
    }

    @Test(description = "Checking text in Examples control")
    public void examplesNameTest () {
        Assert.assertEquals(mainPage.getExamplesText(), "Available Examples");
    }

    @Test(description = "Checking number of examples present")
    public void checkNumberModulesIsFortyFour () {
        Assert.assertEquals(mainPage.getElementsListSize(), 44);
    }

    @Test(priority = 1, description = "Checking going to A/B Testing Page")
    public void checkABTestingPageOpens (){
        Assert.assertEquals(mainPage.goToABTestingPage(),
                "http://the-internet.herokuapp.com/abtest");
    }

}