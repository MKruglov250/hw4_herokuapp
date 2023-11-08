package org.example;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Login {

    SelenideElement usernameField = $("input[type='text'][name='username']");

    SelenideElement passwordField = $("input[type='password'][name='password']");

    SelenideElement loginButton = $("button[class='radius'][type='submit']");

    public String loginWithIncorrectUsername(){
        usernameField.setValue("123");
        passwordField.setValue("321");
        loginButton.click();
        return $("div[class='flash error']").getText();
    }

    public String loginWithIncorrectPassword(){
        usernameField.setValue("tomsmith");
        passwordField.setValue("321");
        loginButton.click();
        return $("div[class='flash error']").getText();
    }

    public String loginWithCorrectCredentials() {
        usernameField.setValue("tomsmith");
        passwordField.setValue("SuperSecretPassword!");
        loginButton.click();
        return $("h4[class='subheader']").getText();
    }
}
