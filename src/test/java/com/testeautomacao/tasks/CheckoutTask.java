package com.testeautomacao.tasks;

import com.testeautomacao.pageobjects.CheckoutPageObject;
import org.openqa.selenium.WebDriver;

public class CheckoutTask {

    private WebDriver navegador;
    public CheckoutPageObject buttonAddToCart;

    public CheckoutTask(WebDriver navegador) {
        this.navegador = navegador;
        this.buttonAddToCart = new CheckoutPageObject(navegador);
    }

    public void clicarBotao() {
        this.buttonAddToCart.getProceedToCheckout(navegador).click();
    }
}