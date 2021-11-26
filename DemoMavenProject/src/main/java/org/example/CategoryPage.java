package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CategoryPage {
    WebDriver driver;
    //Constructor
    public CategoryPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,2),this);
    }

    @FindBy(xpath = "//h4[contains(text(),'Categories')]/following-sibling::div[@class='list-group']/a[1]")
    private WebElement selectCategory;

    @FindBy(xpath = "//a[@class='d-block text-center']/span[1]")
    private WebElement bagsFirstProduct;

    @FindBy(xpath = "//h4[contains(text(),'Brands')]/following-sibling::div[@class='list-group']/a[1]")
    private WebElement selectBrands;

    @FindBy(xpath = "//span[@class = 'info mt-3 d-block']")
    private WebElement rubyFirstProduct;

    //Methods
    public void selectCategory () {

        selectCategory.click();
        bagsFirstProduct.click();
    }
    public void selectBrands (WebDriver driver){
        selectBrands.click();
        rubyFirstProduct.click();

         }
}
