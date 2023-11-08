package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TyposTest extends BaseTest{

    Typos typosPage = new Typos();

    @Test
    public void checkPageOpens(){
        open("typos");
        Assert.assertEquals(typosPage.checkPageOpens(),"Typos");
    }

    // Check for typos (almost) always fails - typo is likely to be found
    @Test
    public void checkMessageForTypos(){
        open("typos");
        Assert.assertFalse(typosPage.checkNoTypo());
    }

}