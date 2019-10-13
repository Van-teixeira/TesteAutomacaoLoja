package com.testeautomacao.pageobjects;

import com.testeautomacao.utils.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class EnderecoPageObject extends BasePageObject {

    public EnderecoPageObject(WebDriver navegador) {
        super(navegador);
    }

    public WebElement getProceedToCheckout(WebDriver navegador) {

        return this.navegador.findElement(By.name("processAddress"));

    }


}