package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {
WebDriver driver;
    public AddressPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20) ,this);
    }
        @FindBy(id ="order_bill_address_attributes_firstname")
        private WebElement firstNameTextBox;

        @FindBy(id="order_bill_address_attributes_lastname")
        private  WebElement lastNameTextBox;

        @FindBy(id = "order_bill_address_attributes_address1")
        private WebElement billingAddressTextBox;

        @FindBy(id = "order_bill_address_attributes_city")
        private WebElement billingCityTextBox;

        @FindBy(id="order_bill_address_attributes_country_id")
        private WebElement billingCountryDropDownList;

        @FindBy(css = "[name='order[bill_address_attributes][state_id]']")
        private WebElement billingStateDropDownList;

        @FindBy(id="order_bill_address_attributes_zipcode")
        private  WebElement billingZipCodeTextBox;

        @FindBy(id="order_bill_address_attributes_phone")
        private WebElement PhoneNumberTextBox;

        @FindBy(id="order_use_billing")
        private WebElement billingSameShippingAddCheckBox;

        @FindBy(css= "[name='save_user_address']")
        private WebElement saveAddressCheckBox;

        @FindBy(id="order_bill_address_id_375")
        private WebElement CheckRadio;

        @FindBy(id="order_bill_address_id_0")
        private WebElement otherAddressRadio;

        @FindBy(css ="input[value='Save and Continue']")
        public WebElement saveAndContinue;

        public void userAddress(String firstName, String lastName, String billingAddress, String billingCity,
            String billingCountry,String billingState, String billingZipCode, String PhoneNumber)
        {
            firstNameTextBox.sendKeys(firstName);
            lastNameTextBox.sendKeys(lastName);
            billingAddressTextBox.sendKeys(billingAddress);
            billingCityTextBox.sendKeys(billingCity);

            Select dropCountry = new Select(billingCountryDropDownList);
            dropCountry.selectByVisibleText(billingCountry);

            Select dropState = new Select(billingStateDropDownList);
            dropState.selectByVisibleText(billingState);

            billingZipCodeTextBox.sendKeys(billingZipCode);
            PhoneNumberTextBox.sendKeys(PhoneNumber);
            saveAddressCheckBox.click();
            saveAndContinue.click();
        }

    }

