package com.testeautomacao.pageobjects;

import com.testeautomacao.utils.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RemessaPageObject extends BasePageObject {

    public RemessaPageObject(WebDriver navegador) {
        super(navegador);
    }


    public WebElement getCheckBox(WebDriver navegador) {

        return navegador.findElement(By.id("uniform-cgv"));

    }

    public WebElement getProceedToCheckout(WebDriver navegador) {

        return navegador.findElement(By.name("processCarrier"));
    }
}