package com.testeautomacao.tasks;

import com.testeautomacao.pageobjects.SelecionaProdutoDaLojaObject;
import org.openqa.selenium.WebDriver;

public class SelecionaProdutoDaLojaTask {

    private WebDriver navegador;
    public SelecionaProdutoDaLojaObject produtoPageObject;

    public SelecionaProdutoDaLojaTask(WebDriver navegador) {
        this.navegador = navegador;
        this.produtoPageObject = new SelecionaProdutoDaLojaObject(this.navegador);
    }

    public void clicarImagem() {
        this.produtoPageObject.imagemDoProduto(navegador).click();
    }
}