package org.example;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeClass
    public void before() {

        Configuration.baseUrl = "http://the-internet.herokuapp.com/";
        Configuration.browser = "Chrome";
        Configuration.headless = false;
        open(".");
    }
}