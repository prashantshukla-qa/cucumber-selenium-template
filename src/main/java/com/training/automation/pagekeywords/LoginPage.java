package com.training.automation.pagekeywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "username")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;

    @FindBy(css = "div#flash-messages")
    WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void loginToTheApplication(String userName, String password) {
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
        this.loginButton.click();
    }

    public void enterusername(String userName) {
        this.userName.sendKeys(userName);
    }

    public void enterpassword(String pasword){
        this.password.sendKeys(pasword);
    }

    public void clickonsigninbutton() {
        this.loginButton.click();
    }
    
    public String verifySignInErrorMessage() {
        return errorMessage.getText();
    }

}
