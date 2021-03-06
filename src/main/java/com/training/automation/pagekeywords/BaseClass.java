package com.training.automation.pagekeywords;

import com.training.automation.utils.Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {

    private WebDriver driver;

    public LoginPage loginPage;
    public LandingPage landingPage;
    public Screenshot screenshot;

    public BaseClass() {
        this.driver = new ChromeDriver();
        this.loginPage = new LoginPage(driver);
        this.landingPage = new LandingPage(driver);
        this.screenshot = new Screenshot(driver);
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public void launchApplication() {
        launchApplication("https://the-internet.herokuapp.com/");
    }

    public void launchApplication(String url) {
        this.driver.get(url);
    }    

    public void closeTestSession() {
        this.driver.quit();
    }
}
