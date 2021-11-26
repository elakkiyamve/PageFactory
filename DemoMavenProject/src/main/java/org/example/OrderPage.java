package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class OrderPage {
WebDriver driver;
    public OrderPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20) ,this);
    }
    @FindBy(xpath = "//div[text()='Your order has been processed successfully']")
    private WebElement orderSucessMessage;

   public String getConfirmationMessage()
    {
        return orderSucessMessage.getText();
    }

}
