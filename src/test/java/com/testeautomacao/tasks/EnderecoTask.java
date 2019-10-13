package com.testeautomacao.tasks;

import com.testeautomacao.pageobjects.EnderecoPageObject;
import org.openqa.selenium.WebDriver;

public class EnderecoTask {

    private WebDriver navegador;
    public EnderecoPageObject buttonProceedToCheckout;

    public EnderecoTask(WebDriver navegador) {
        this.navegador = navegador;
        this.buttonProceedToCheckout = new EnderecoPageObject(navegador);
    }

    public void clicarBotao() {
        this.buttonProceedToCheckout.getProceedToCheckout(navegador).click();
    }
}
