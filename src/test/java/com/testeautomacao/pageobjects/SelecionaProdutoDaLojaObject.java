package com.testeautomacao.pageobjects;

import com.testeautomacao.utils.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class SelecionaProdutoDaLojaObject extends BasePageObject {


    public SelecionaProdutoDaLojaObject(WebDriver navegador) {
        super(navegador);
    }

    public WebElement imagemDoProduto(WebDriver navegador) {

        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this.navegador.findElement(By.linkText("Faded Short Sleeve T-shirts"));

    }

}