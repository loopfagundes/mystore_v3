package com.automationpractice.steps;

import com.automationpractice.pageobjects.MeuLoginPageObject;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MeuLoginStep {
    private final WebDriver driver;
    private final MeuLoginPageObject meuLoginPageObject;

    public MeuLoginStep(WebDriver _driver) {
        driver = _driver;
        meuLoginPageObject = new MeuLoginPageObject(_driver);
    }

    public MeuLoginStep efeturaLogin() {
        acessaLogin();
       return this;
    }

    private MeuLoginStep acessaLogin() {
        ExtentTestManager.getTest().log(Status.PASS, "Acessa na tela de login.");
        meuLoginPageObject.acessaMeuLoginButton().click();
        Assert.assertEquals(meuLoginPageObject.validadoTelaDeLogin().getText(), "AUTHENTICATION");
        return this;
    }
}
