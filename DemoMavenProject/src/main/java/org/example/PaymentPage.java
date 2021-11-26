package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PaymentPage {
     WebDriver driver;

    public PaymentPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20) ,this);
    }

        @FindBy(id="order_payments_attributes__payment_method_id_2")
        private WebElement creditPaymentMethod;

        @FindBy(id="order_payments_attributes__payment_method_id_3")
        private WebElement checkPaymentMethod;

        @FindBy(name="commit")
        private WebElement saveAndContinue;

        public void choosePaymentMode()
        {
            checkPaymentMethod.click();
              saveAndContinue.click();
        }


    }
