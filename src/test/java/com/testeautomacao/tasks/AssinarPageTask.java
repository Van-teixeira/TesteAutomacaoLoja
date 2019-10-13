package com.testeautomacao.tasks;

import com.testeautomacao.pageobjects.AssinaturaPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class AssinarPageTask {

    private WebDriver navegador;
    public AssinaturaPageObject campoCadastrarEmail, buttonCreateAccount, radioButton, campoCustomerFirstName, campoCustomerLastName, campoPassword,
            comboDay, comboMonth, comboYear, campoFirstName, campoLastName, campoCompany, campoAdress, campoAdress2, campoCity, comboState, campoPostalCode, comboCountry,
            campoAdditionalInformation, campoHomePhone, campoMobilePhone, campoAdressAlias, registerButton;

    public AssinarPageTask(WebDriver navegador) {
        this.navegador = navegador;
        this.campoCadastrarEmail = new AssinaturaPageObject(navegador);
        this.buttonCreateAccount = new AssinaturaPageObject(navegador);
        this.radioButton = new AssinaturaPageObject(navegador);
        this.campoCustomerFirstName = new AssinaturaPageObject(navegador);
        this.campoCustomerLastName = new AssinaturaPageObject(navegador);
        this.campoPassword = new AssinaturaPageObject(navegador);
        this.comboDay = new AssinaturaPageObject(navegador);
        this.comboMonth = new AssinaturaPageObject(navegador);
        this.comboYear = new AssinaturaPageObject(navegador);
        this.campoFirstName = new AssinaturaPageObject(navegador);
        this.campoLastName = new AssinaturaPageObject(navegador);
        this.campoCompany = new AssinaturaPageObject(navegador);
        this.campoAdress = new AssinaturaPageObject(navegador);
        this.campoAdress2 = new AssinaturaPageObject(navegador);
        this.campoCity = new AssinaturaPageObject(navegador);
        this.comboState = new AssinaturaPageObject(navegador);
        this.campoPostalCode = new AssinaturaPageObject(navegador);
        this.comboCountry = new AssinaturaPageObject(navegador);
        this.campoAdditionalInformation = new AssinaturaPageObject(navegador);
        this.campoHomePhone = new AssinaturaPageObject(navegador);
        this.campoMobilePhone = new AssinaturaPageObject(navegador);
        this.campoAdressAlias = new AssinaturaPageObject(navegador);
        this.registerButton = new AssinaturaPageObject(navegador);

    }

    public void cadastrarEmail() {

        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();

        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();

        this.campoCadastrarEmail.setEmailAdress(this.navegador).sendKeys(saltStr + "@gmail.com");

    }

    public void clicarBotao() {
        this.buttonCreateAccount.getSubmitCreateButton(navegador).click();
    }

    public void preencherFormulario() {
        this.radioButton.getRadioButton(navegador).click();
        this.campoCustomerFirstName.setFirstCustomerName(navegador).sendKeys("Vanessa");
        this.campoCustomerLastName.setLastCustomerName(navegador).sendKeys("Teixeira");
        this.campoPassword.setPasswd(navegador).sendKeys("Teste123456");
        this.comboDay.comboDay(navegador).click();
        new Select(comboDay.comboDay(navegador)).selectByValue("4");
        navegador.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        this.comboMonth.comboMonth(navegador).click();
        new Select(comboMonth.comboMonth(navegador)).selectByVisibleText("November ");
        navegador.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.comboYear.comboYear(navegador).click();
        new Select(comboYear.comboYear(navegador)).selectByVisibleText("1989  ");
        this.campoCompany.setCompany(navegador).sendKeys("DbServer");
        this.campoAdress.setAdress(navegador).sendKeys("Avenida Ipiranga, número 17");
        this.campoAdress2.setAdress2(navegador).sendKeys("Próximo a PUCRS");
        this.campoCity.setCity(navegador).sendKeys("Porto Alegre");
        this.comboState.comboState(navegador).click();
        new Select(comboState.comboState(navegador)).selectByVisibleText("Alabama");
        this.campoPostalCode.setPostalCode(navegador).sendKeys("29150");
        this.comboCountry.setComboCountry(navegador).click();
        new Select(comboCountry.setComboCountry(navegador)).selectByVisibleText("United States");
        this.campoAdditionalInformation.setAdditionalInformation(navegador).sendKeys("Moro no Brasil, porém este form só aceita Estados Unidos no ComboBox!");
        this.campoHomePhone.setHomePhone(navegador).sendKeys("2230907510");
        this.campoMobilePhone.setMobilePhone(navegador).sendKeys("36995322514");
        this.campoAdressAlias.setAdressAlias(navegador).sendKeys("vanessat@dbserver.com.br");
        this.registerButton.getRegisterButton(navegador).click();


    }
}