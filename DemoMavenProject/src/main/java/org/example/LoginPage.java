package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage {
    WebDriver driver;

    //Constructor
    public LoginPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(new AjaxElementLocatorFactory( driver, 20) ,this);
    }

    @FindBy(css = "a[href= '/login']")
    private WebElement login;

    @FindBy(id = "spree_user_email")
    private WebElement getUserEmail;

    @FindBy(id = "spree_user_password")
    private WebElement getUserPassword;

    @FindBy(id = "spree_user_password_confirmation")
    private WebElement getUserPasswordConfirmation;

    @FindBy(id = "spree_user_remember_me")
    private WebElement checkbox;

    @FindBy(xpath = "//input[@value='Create']")
    private WebElement create;

    @FindBy(xpath = "//div[@class = 'text-center']/a[@href = '/signup']")
    private WebElement signUp;

    @FindBy(xpath = "//input[@name='commit']")
    private WebElement submit;


    //Methods

    public void createAccount(String userEmail, String userPassword,String userPasswordConfirmation) {
        login.click();
        signUp.click();
        getUserEmail.sendKeys(userEmail);
        getUserPassword.sendKeys(userPassword);
        getUserPasswordConfirmation.sendKeys(userPasswordConfirmation);
        create.click();
    }

    public void userLogin(String userEmail, String userPassword){
        login.click();
        getUserEmail.sendKeys(userEmail);
        getUserPassword.sendKeys(userPassword);
        checkbox.click();
        submit.click();
    }

}


