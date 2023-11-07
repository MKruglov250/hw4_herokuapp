package org.example;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DynamicContent {


    public Boolean checkMandalorian(){
        SelenideElement mandalorianImg = $("img[src='/img/avatars/Original-Facebook-Geek-Profile-Avatar-2.jpg']");
        return mandalorianImg.exists();
    }

    public Boolean checkMario(){
        SelenideElement marioImg = $("img[src='/img/avatars/Original-Facebook-Geek-Profile-Avatar-1.jpg']");
        return marioImg.exists();
    }

    public Boolean checkWolverine(){
        SelenideElement wolverineImg = $("img[src='/img/avatars/Original-Facebook-Geek-Profile-Avatar-5.jpg']");
        return wolverineImg.exists();
    }

    public Boolean checkPunisher(){
        SelenideElement punisherImg = $("img[src='/img/avatars/Original-Facebook-Geek-Profile-Avatar-3.jpg']");
        return punisherImg.exists();
    }

    public Boolean checkStormtrooper(){
        SelenideElement stormtrooperImg = $("img[src='/img/avatars/Original-Facebook-Geek-Profile-Avatar-6.jpg']");
        return stormtrooperImg.exists();
    }
}
