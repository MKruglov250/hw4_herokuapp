package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class DropdownTest extends BaseTest{

    Dropdown dropdownList = new Dropdown();
    @Test
    public void checkDefaultOption(){
        open("dropdown");
        Assert.assertEquals(dropdownList.checkDefaultValue(),"Please select an option");
    }

    @Test
    public void checkOption1(){
        open("dropdown");
        Assert.assertEquals(dropdownList.checkOption1(),"Option 1");
    }

    @Test
    public void checkOption2(){
        open("dropdown");
        Assert.assertEquals(dropdownList.checkOption2(),"Option 2");
    }

}