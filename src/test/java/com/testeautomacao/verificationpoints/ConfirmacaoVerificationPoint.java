package com.testeautomacao.verificationpoints;

import com.testeautomacao.utils.BasePageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ConfirmacaoVerificationPoint extends BasePageObject {

    public ConfirmacaoVerificationPoint(WebDriver navegador) {
        super(navegador);
    }

    public String getTitulo() {

        String titulo;
        titulo = navegador.findElement(By.linkText("Proceed to checkout")).getText();
        Assert.assertEquals(titulo, "Proceed to checkout");

        return titulo;
    }
}