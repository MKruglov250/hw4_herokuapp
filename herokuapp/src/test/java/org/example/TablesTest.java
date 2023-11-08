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


    @Test(description = "Checking value in Table 1, row 1, cell 1")
    public void checkTableOneCellOneOne(){
        Assert.assertEquals(tablesPage.getCellValue(1,1,1),
                "Smith");
    }

    @Test(description = "Checking value in Table 1, row 2, cell 2")
    public void checkTableOneCellTwoTwo(){
        Assert.assertEquals(tablesPage.getCellValue(1,2,2),
                "Frank");
    }

    @Test(description = "Checking value in Table 1, row 3, cell 3")
    public void checkTableOneCellThreeThree(){
        Assert.assertEquals(tablesPage.getCellValue(1,3,3),
                "jdoe@hotmail.com");
    }

    @Test(description = "Checking value in Table 2, row 4, cell 4")
    public void checkTableTwoCellFourFour(){
        Assert.assertEquals(tablesPage.getCellValue(2,4,4),
                "$50.00");
    }

    @Test(description = "Checking value in Table 2, row 3, cell 5")
    public void checkTableTwoCellThreeFive(){
        Assert.assertEquals(tablesPage.getCellValue(2,3,5),
                "http://www.jdoe.com");
    }

    @Test(description = "Checking value in Table 2, row 2, cell 6")
    public void checkTableTwoCellTwoSix(){
        Assert.assertEquals(tablesPage.getCellValue(2,2,6),
                "edit delete");
    }

}