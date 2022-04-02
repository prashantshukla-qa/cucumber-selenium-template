package com.training.automation.pagekeywords;

import com.training.automation.utils.Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

    private WebDriver driver;

    LoginPage loginPage;
    LandingPage landingPage;
    Screenshot screenshot;


    private final String URL = "http://automationpractice.com/index.php";

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.loginPage = new LoginPage(driver);
        this.landingPage = new LandingPage(driver);
        this.screenshot = new Screenshot(driver);
    }

    @After
    public void teardown() {
        this.driver.quit();
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public void launchApplication() {
        launchApplication(this.URL);
    }

    public void launchApplication(String url) {
        this.driver.get(url);
    }    
}
