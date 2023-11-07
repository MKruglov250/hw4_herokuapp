package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class HoversTest extends BaseTest {

    Hovers hoverPage = new Hovers();

    @Test
    public void checkNameProfileOne(){
        open("hovers");
        Assert.assertEquals(hoverPage.getNameProfileOne(),"name: user1");
    }

    @Test
    public void checkNameProfileTwo(){
        open("hovers");
        Assert.assertEquals(hoverPage.getNameProfileTwo(),"name: user2");
    }

    @Test
    public void checkNameProfileThree(){
        open("hovers");
        Assert.assertEquals(hoverPage.getNameProfileThree(),"name: user3");
    }

    // Tests on checking Not Found are failing intentionally for now
    @Test
    public void checkPageProfileOneExists() throws InterruptedException {
        open("hovers");
        Assert.assertNotEquals(hoverPage.pageProfileOne(),"Not Found");
    }

    @Test
    public void checkPageProfileTwoExists() throws InterruptedException {
        open("hovers");
        Assert.assertNotEquals(hoverPage.pageProfileTwo(),"Not Found");
    }

    @Test
    public void checkPageProfileThreeExists() throws InterruptedException {
        open("hovers");
        Assert.assertNotEquals(hoverPage.pageProfileThree(),"Not Found");
    }

}