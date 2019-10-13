package com.testeautomacao.pageobjects;

import com.testeautomacao.utils.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ColocarProdutoNoCarrinhoObject extends BasePageObject {

    public ColocarProdutoNoCarrinhoObject(WebDriver navegador) {
        super(navegador);
    }

    public WebElement getAddToCartButton(WebDriver navegador) {

        return navegador.findElement(By.name("Submit"));
    }

}