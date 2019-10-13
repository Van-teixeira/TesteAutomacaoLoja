package com.testeautomacao.tasks;

import com.testeautomacao.pageobjects.RemessaPageObject;
import org.openqa.selenium.WebDriver;


public class RemessaTask {

    private WebDriver navegador;
    public RemessaPageObject buttonProceedToCheckout;
    public RemessaPageObject marcarCheckBox;

    public RemessaTask(WebDriver navegador) {
        this.navegador = navegador;
        this.buttonProceedToCheckout = new RemessaPageObject(navegador);
        this.marcarCheckBox = new RemessaPageObject(navegador);
    }

    public void marcarCheckBox() {

        this.marcarCheckBox.getCheckBox(navegador).click();


    }

    public void clicarBotao() {
        this.buttonProceedToCheckout.getProceedToCheckout(navegador).click();
    }

}