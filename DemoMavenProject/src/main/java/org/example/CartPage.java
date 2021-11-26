package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CartPage {
WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20) ,this);
    }

    @FindBy(id = "update-cart")
    private WebElement cartPage;

    @FindBy(css = "button[name='checkout']")
    private WebElement checkoutFromCart;

    public void checkout()
    {
        checkoutFromCart.click();
    }

}
