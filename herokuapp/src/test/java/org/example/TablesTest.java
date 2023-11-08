package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TablesTest extends BaseTest{

    Tables tablesPage = new Tables();


    @BeforeMethod
    public void openPage(){
        open("tables");
    }


    @Test
    public void checkTableOneCellOneOne(){
        Assert.assertEquals(tablesPage.getCellValue(1,1,1),
                "Smith");
    }

    @Test
    public void checkTableOneCellTwoTwo(){
        Assert.assertEquals(tablesPage.getCellValue(1,2,2),
                "Frank");
    }

    @Test
    public void checkTableOneCellThreeThree(){
        Assert.assertEquals(tablesPage.getCellValue(1,3,3),
                "jdoe@hotmail.com");
    }

    @Test
    public void checkTableTwoCellFourFour(){
        Assert.assertEquals(tablesPage.getCellValue(2,4,4),
                "$50.00");
    }

    @Test
    public void checkTableTwoCellThreeFive(){
        Assert.assertEquals(tablesPage.getCellValue(2,3,5),
                "http://www.jdoe.com");
    }

    @Test
    public void checkTableTwoCellTwoSix(){
        Assert.assertEquals(tablesPage.getCellValue(2,2,6),
                "edit delete");
    }

}