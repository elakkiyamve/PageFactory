package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LogoutPage {
WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,2),this);
    }

    @FindBy(css = "input[value='Logout']")
    private WebElement logout;
    public void logout(){
        logout.click();

    }

}
