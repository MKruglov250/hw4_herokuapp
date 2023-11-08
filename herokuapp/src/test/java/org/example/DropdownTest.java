package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class DropdownTest extends BaseTest{

    Dropdown dropdownList = new Dropdown();

    @BeforeMethod
    public void openPage(){
        open("dropdown");
    }
    @Test
    public void checkDefaultOption(){
        Assert.assertEquals(dropdownList.checkDefaultValue(),"Please select an option");
    }

    @Test
    public void checkOption1(){
        Assert.assertEquals(dropdownList.checkOption1(),"Option 1");
    }

    @Test
    public void checkOption2(){
        Assert.assertEquals(dropdownList.checkOption2(),"Option 2");
    }

}