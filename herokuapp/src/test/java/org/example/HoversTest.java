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

    @Test(description = "Hovering on Profile1 area makes corresponding" +
            "text elements visible")
    public void checkNameProfileOne(){
        Assert.assertEquals(hoverPage.getNameProfileOne(),"name: user1");
    }

    @Test(description = "Hovering on Profile2 area makes corresponding" +
            "text elements visible")
    public void checkNameProfileTwo(){
        Assert.assertEquals(hoverPage.getNameProfileTwo(),"name: user2");
    }

    @Test(description = "Hovering on Profile3 area makes corresponding" +
            "text elements visible")
    public void checkNameProfileThree(){
        Assert.assertEquals(hoverPage.getNameProfileThree(),"name: user3");
    }

    // Tests on checking Not Found are failing intentionally for now
    @Test(description = "Checking Profile1 page doesn't return error 404")
    public void checkPageProfileOneExists() {
        Assert.assertNotEquals(hoverPage.pageProfileOne(),"Not Found");
    }

    @Test(description = "Checking Profile2 page doesn't return error 404")
    public void checkPageProfileTwoExists() {
        Assert.assertNotEquals(hoverPage.pageProfileTwo(),"Not Found");
    }

    @Test(description = "Checking Profile3 page doesn't return error 404")
    public void checkPageProfileThreeExists() {
        Assert.assertNotEquals(hoverPage.pageProfileThree(),"Not Found");
    }

}