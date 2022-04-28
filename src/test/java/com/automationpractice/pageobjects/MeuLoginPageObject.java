package com.automationpractice.pageobjects;

import com.automationpractice.utils.WaitElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MeuLoginPageObject {
    private final WebDriver driver;
    private final WaitElement waitElement;

    public MeuLoginPageObject(WebDriver _driver) {
        driver = _driver;
        waitElement = new WaitElement(_driver);
    }

    public WebElement acessaMeuLoginButton() {
        return waitElement.toBeClickable(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a"));
    }

    public WebElement validadoTelaDeLogin() {
        return waitElement.visibilityOf(By.cssSelector("div[id='center_column'] h1"));
    }

//    public WebElement criarUmaContaTextField() {
//        return waitElement.visibilityOf(By)
//    }
}