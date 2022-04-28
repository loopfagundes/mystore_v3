package com.automationpractice.webdrivers;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static final ThreadLocal<WebDriver> _driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return _driver.get();
    }

    public static void setDriver(WebDriver driver) {
        _driver.set(driver);
    }

    public static void quitDriver() {
        if(getDriver() != null) {
            getDriver().quit();
            ExtentTestManager.getTest().log(Status.INFO, "Terminou de Teste.");
        }
    }
}