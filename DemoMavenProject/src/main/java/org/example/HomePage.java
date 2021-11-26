package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class HomePage {
    WebDriver driver;
    //Constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,2),this);
    }

    By loginAlertMessage = By.cssSelector("div.alert.alert-success");
    By signupAlertMessage = By.cssSelector("div.alert.alert-notice");


    //Methods

    public void loginAlertMessage() {

        String loginValue = driver.findElement(loginAlertMessage).getText();
        Assert.assertEquals(loginValue, "Logged in successfully");
    }

    public void signupAlertMessage() {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String signupValue =  driver.findElement(signupAlertMessage).getText();
         Assert.assertEquals(signupValue,"Welcome! You have signed up successfully.");
    }
}