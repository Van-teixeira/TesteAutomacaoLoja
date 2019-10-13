package com.testeautomacao.tasks;

import com.testeautomacao.pageobjects.ColocarProdutoNoCarrinhoObject;
import org.openqa.selenium.WebDriver;

public class ColocarProdutoNoCarrinhoTask {
    private WebDriver navegador;
    public ColocarProdutoNoCarrinhoObject buttonAddToCart;

    public ColocarProdutoNoCarrinhoTask(WebDriver navegador) {
        this.navegador = navegador;
        this.buttonAddToCart = new ColocarProdutoNoCarrinhoObject(navegador);
    }

    public void clicarBotao() {
        this.buttonAddToCart.getAddToCartButton(navegador).click();
    }
}