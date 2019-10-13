package com.testeautomacao.verificationpoints;

import com.testeautomacao.utils.BasePageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmacaoProdutoVerificationPoint extends BasePageObject {

    public ConfirmacaoProdutoVerificationPoint(WebDriver navegador) {
        super(navegador);
    }

    public String getTitulo() {

        String titulo;
        titulo = navegador.findElement(By.linkText("Faded Short Sleeve T-shirts")).getText();
        Assert.assertEquals(titulo, "Faded Short Sleeve T-shirts");

        return titulo;
    }
}