package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TyposTest extends BaseTest{

    Typos typosPage = new Typos();

    @BeforeMethod
    public void openPage(){
        open("typos");
    }

    @Test
    public void checkPageOpens(){
        Assert.assertEquals(typosPage.checkPageOpens(),"Typos");
    }

    // Check for typos (almost) always fails - typo is likely to be found
    @Test
    public void checkMessageForTypos(){
        Assert.assertFalse(typosPage.checkNoTypo());
    }

}