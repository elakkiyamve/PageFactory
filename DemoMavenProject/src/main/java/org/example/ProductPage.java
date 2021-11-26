package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ProductPage {
    WebDriver driver;

    @FindBy(id="add-to-cart-button")
    private WebElement addToCart;

    public ProductPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,2),this);
    }

    public void selectProduct(){
        addToCart.click();
        System.out.println("Product added to cart");

    }

}
