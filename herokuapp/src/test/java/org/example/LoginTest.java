package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest{

    Login login = new Login();
    @Test
    public void checkLoginWithBadUsername() throws InterruptedException {
        open("login");
        Assert.assertTrue(login.loginWithIncorrectUsername().contains("Your username is invalid!"));
    }

    @Test
    public void checkLoginWithBadPassword() throws InterruptedException {
        open("login");
        Assert.assertTrue(login.loginWithIncorrectPassword().contains("Your password is invalid!"));
    }

    @Test
    public void checkLoginWithGoodCredentials() throws InterruptedException {
        open("login");
        Assert.assertEquals(login.loginWithCorrectCredentials(),"Welcome to the Secure Area. When you are done click logout below.");
    }
}