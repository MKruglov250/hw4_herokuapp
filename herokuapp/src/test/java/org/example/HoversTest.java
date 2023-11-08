package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class HoversTest extends BaseTest {

    Hovers hoverPage = new Hovers();

    @BeforeMethod
    public void openPage(){
        open("./hovers");
    }

    @Test
    public void checkNameProfileOne(){
        Assert.assertEquals(hoverPage.getNameProfileOne(),"name: user1");
    }

    @Test
    public void checkNameProfileTwo(){
        Assert.assertEquals(hoverPage.getNameProfileTwo(),"name: user2");
    }

    @Test
    public void checkNameProfileThree(){
        Assert.assertEquals(hoverPage.getNameProfileThree(),"name: user3");
    }

    // Tests on checking Not Found are failing intentionally for now
    @Test
    public void checkPageProfileOneExists() throws InterruptedException {
        Assert.assertNotEquals(hoverPage.pageProfileOne(),"Not Found");
    }

    @Test
    public void checkPageProfileTwoExists() throws InterruptedException {
        Assert.assertNotEquals(hoverPage.pageProfileTwo(),"Not Found");
    }

    @Test
    public void checkPageProfileThreeExists() throws InterruptedException {
        Assert.assertNotEquals(hoverPage.pageProfileThree(),"Not Found");
    }

}