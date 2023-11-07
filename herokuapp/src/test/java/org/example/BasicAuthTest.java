package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BasicAuthTest extends BaseTest {

    BasicAuth basicAuthPage = new BasicAuth();

    @Test
    public void loginWithValidCredentialsShouldSucceed(){
        open("/basic_auth", "", "admin", "admin");
        Assert.assertEquals(basicAuthPage.getPageName(), "Basic Auth");
        Assert.assertEquals(basicAuthPage.getPageMessage(), "Congratulations! You must have the proper credentials.");
    }

    @Test
    public void loginWithInvalidCredentialsShouldFail(){
        open("basic_auth");
        $("h3").shouldNotBe(exist);
    }

}