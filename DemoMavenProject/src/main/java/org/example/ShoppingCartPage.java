package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class ShoppingCartPage {
WebDriver driver;

    public ShoppingCartPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,2),this);
    }

      By totalValue = By.cssSelector("td[class='lead']");

      @FindBy(id="checkout-link")
      private WebElement checkout;

    public void cartValue() throws InterruptedException {

        String amount = driver.findElement(totalValue).getText();
        Assert.assertEquals( amount ,"$15.99");

        checkout.click();
        System.out.println("total amount is :" + amount);
    }
}
