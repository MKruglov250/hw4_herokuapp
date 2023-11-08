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

    @Test(description = "Trying to log in with invalid username")
    public void checkLoginWithBadUsername() {
        Assert.assertTrue(login.loginWithIncorrectUsername()
                .contains("Your username is invalid!"));
    }

    @Test(description = "Trying to log in with valid username and invalid password")
    public void checkLoginWithBadPassword() {
        Assert.assertTrue(login.loginWithIncorrectPassword()
                .contains("Your password is invalid!"));
    }

    @Test(description = "Trying to log in with valid credentials")
    public void checkLoginWithGoodCredentials() {
        Assert.assertEquals(login.loginWithCorrectCredentials(),
                "Welcome to the Secure Area. When you are done click logout below.");
    }
}