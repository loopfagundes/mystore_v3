package com.automationpractice.testcases;

import com.automationpractice.steps.MeuLoginStep;
import com.automationpractice.utils.BaseTest;
import com.automationpractice.utils.Property;
import com.automationpractice.webdrivers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CompraComSucessoTest extends BaseTest {

    @Test
    public void compraComSucessoTest() {
        WebDriver driver = DriverManager.getDriver();
        driver.get(Property.get("url"));
        MeuLoginStep meuLoginStep = new MeuLoginStep(driver);
        meuLoginStep.efeturaLogin();
    }
}
