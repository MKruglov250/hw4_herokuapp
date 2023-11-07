package org.example;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Login {

    SelenideElement usernameField = $("input[type='text'][name='username']");

    SelenideElement passwordField = $("input[type='password'][name='password']");

    SelenideElement loginButton = $("button[class='radius'][type='submit']");

    public String loginWithIncorrectUsername() throws InterruptedException {
        usernameField.setValue("123");
        passwordField.setValue("321");
        loginButton.click();
        Thread.sleep(600);
        return $("div[class='flash error']").getText();
    }

    public String loginWithIncorrectPassword() throws InterruptedException {
        usernameField.setValue("tomsmith");
        passwordField.setValue("321");
        loginButton.click();
        Thread.sleep(600);
        return $("div[class='flash error']").getText();
    }

    public String loginWithCorrectCredentials() throws InterruptedException {
        usernameField.setValue("tomsmith");
        passwordField.setValue("SuperSecretPassword!");
        loginButton.click();
        Thread.sleep(600);
        return $("h4[class='subheader']").getText();
    }
}
