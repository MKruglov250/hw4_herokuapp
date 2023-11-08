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

    @Test
    public void testMandalorianImage() throws InterruptedException {
        while(mandalorianTest < 10 && !mandalorianBool){
            if (!dynamic.checkMandalorian()){
                Selenide.refresh();
                Thread.sleep(300);
                mandalorianTest++;
            } else {
                mandalorianBool = true;
                Thread.sleep(300);
            }
        }
        Assert.assertTrue(mandalorianBool);
    }

    @Test
    public void testMarioImage() throws InterruptedException {
        while(marioTest < 10 && !marioBool){
            if (!dynamic.checkMario()){
                Selenide.refresh();
                Thread.sleep(300);
                marioTest++;
            } else {
                marioBool = true;
                Thread.sleep(300);
            }
        }
        Assert.assertTrue(marioBool);
    }

    @Test
    public void testStormtrooperImage() throws InterruptedException {
        while(stormtrooperTest < 10 && !stormtrooperBool){
            if (!dynamic.checkStormtrooper()){
                Selenide.refresh();
                Thread.sleep(300);
                stormtrooperTest++;
            } else {
                stormtrooperBool = true;
                Thread.sleep(300);
            }
        }
        Assert.assertTrue(stormtrooperBool);
    }

    @Test
    public void testPunisherImage() throws InterruptedException {
        while(punisherTest < 10 && !punisherBool){
            if (!dynamic.checkPunisher()){
                Selenide.refresh();
                Thread.sleep(300);
                punisherTest++;
            } else {
                punisherBool = true;
                Thread.sleep(300);
            }
        }
        Assert.assertTrue(punisherBool);
    }

    @Test
    public void testWolverineImage() throws InterruptedException {
        while(wolverineTest < 10 && !wolverineBool){
            if (!dynamic.checkWolverine()){
                Selenide.refresh();
                Thread.sleep(300);
                wolverineTest++;
            } else {
                wolverineBool = true;
                Thread.sleep(300);
            }
        }
        Assert.assertTrue(wolverineBool);
    }
}