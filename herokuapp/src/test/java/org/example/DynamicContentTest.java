package org.example;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class DynamicContentTest extends BaseTest{

    DynamicContent dynamic = new DynamicContent();
    int mandalorianTest = 0;
    Boolean mandalorianBool = false;
    int marioTest = 0;
    Boolean marioBool = false;
    int stormtrooperTest = 0;
    Boolean stormtrooperBool = false;
    int wolverineTest = 0;
    Boolean wolverineBool = false;
    int punisherTest = 0;
    Boolean punisherBool = false;

    @BeforeMethod
    public void openPage(){
        open("dynamic_content");
    }

    @Test(description = "Check that Mandalorian image can appear on this page")
    public void testMandalorianImage() {
        while(mandalorianTest < 10 && !mandalorianBool){
            if (!dynamic.checkMandalorian()){
                Selenide.refresh();
                mandalorianTest++;
            } else {
                mandalorianBool = true;
            }
        }
        Assert.assertTrue(mandalorianBool);
    }

    @Test(description = "Check that Mario image can appear on this page")
    public void testMarioImage() {
        while(marioTest < 10 && !marioBool){
            if (!dynamic.checkMario()){
                Selenide.refresh();
                marioTest++;
            } else {
                marioBool = true;
            }
        }
        Assert.assertTrue(marioBool);
    }

    @Test(description = "Check that Stormtrooper image can appear on this page")
    public void testStormtrooperImage() {
        while(stormtrooperTest < 10 && !stormtrooperBool){
            if (!dynamic.checkStormtrooper()){
                Selenide.refresh();
                stormtrooperTest++;
            } else {
                stormtrooperBool = true;
            }
        }
        Assert.assertTrue(stormtrooperBool);
    }

    @Test(description = "Check that Punisher image can appear on this page")
    public void testPunisherImage() {
        while(punisherTest < 10 && !punisherBool){
            if (!dynamic.checkPunisher()){
                Selenide.refresh();
                punisherTest++;
            } else {
                punisherBool = true;
            }
        }
        Assert.assertTrue(punisherBool);
    }

    @Test(description = "Check that Wolverine image can appear on this page")
    public void testWolverineImage() {
        while(wolverineTest < 10 && !wolverineBool){
            if (!dynamic.checkWolverine()){
                Selenide.refresh();
                wolverineTest++;
            } else {
                wolverineBool = true;
            }
        }
        Assert.assertTrue(wolverineBool);
    }
}