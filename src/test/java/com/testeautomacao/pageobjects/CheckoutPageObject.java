package com.testeautomacao.pageobjects;

import com.testeautomacao.utils.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPageObject extends BasePageObject {

    public CheckoutPageObject(WebDriver navegador) {
        super(navegador);
    }

    public WebElement getProceedToCheckout(WebDriver navegador) {

        return navegador.findElement(By.linkText("Proceed to checkout"));
    }
}