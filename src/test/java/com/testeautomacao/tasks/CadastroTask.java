package com.testeautomacao.tasks;

import com.testeautomacao.pageobjects.CadastroPageObject;
import org.openqa.selenium.WebDriver;

public class CadastroTask {
    private WebDriver navegador;
    public CadastroPageObject buttonProceedToCheckout;

    public CadastroTask(WebDriver navegador) {
        this.navegador = navegador;
        this.buttonProceedToCheckout = new CadastroPageObject(navegador);
    }

    public void clicarBotao() {
        this.buttonProceedToCheckout.getProceedToCheckout(navegador).click();
    }
}