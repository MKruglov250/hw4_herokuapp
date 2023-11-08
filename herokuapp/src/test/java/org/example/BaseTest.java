package org.example;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    @BeforeSuite
    public void before() {

        Configuration.baseUrl = "http://the-internet.herokuapp.com/";
        Configuration.browser = "Chrome";
        Configuration.headless = false;
        open(".");
        getWebDriver().manage().window().maximize();
        getWebDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  //Does it mean it can be deleted?
    }
}