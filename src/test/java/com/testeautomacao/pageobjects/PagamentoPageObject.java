package com.testeautomacao.pageobjects;

import com.testeautomacao.utils.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PagamentoPageObject extends BasePageObject {

    public PagamentoPageObject(WebDriver navegador) {
        super(navegador);
    }

    public WebElement getPayByBankWire(WebDriver navegador) {

        return this.navegador.findElement(By.className("bankwire"));

    }

    public WebElement getIConfirmMyOrder(WebDriver navegador) {

        return this.navegador.findElement(By.cssSelector(".cart_navigation .button-medium"));

    }
}