package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest{

    Login login = new Login();

    @BeforeMethod
    public void openPage(){
        open("login");
    }

    @Test
    public void checkLoginWithBadUsername() throws InterruptedException {
        Assert.assertTrue(login.loginWithIncorrectUsername().contains("Your username is invalid!"));
    }

    @Test
    public void checkLoginWithBadPassword() throws InterruptedException {
        Assert.assertTrue(login.loginWithIncorrectPassword().contains("Your password is invalid!"));
    }

    @Test
    public void checkLoginWithGoodCredentials() throws InterruptedException {
        Assert.assertEquals(login.loginWithCorrectCredentials(),"Welcome to the Secure Area. When you are done click logout below.");
    }
}