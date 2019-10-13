package com.testeautomacao.tasks;

import com.testeautomacao.pageobjects.PagamentoPageObject;
import org.openqa.selenium.WebDriver;

public class PagamentoTask {

    private WebDriver navegador;
    public PagamentoPageObject buttonPayByBankWire;

    public PagamentoTask(WebDriver navegador) {
        this.navegador = navegador;
        this.buttonPayByBankWire = new PagamentoPageObject(navegador);
    }

    public void clicarBotao() {
        this.buttonPayByBankWire.getPayByBankWire(navegador).click();
    }

    public void clicarBotaoConfirmandoPagamento() {
        this.buttonPayByBankWire.getIConfirmMyOrder(navegador).click();
    }

}