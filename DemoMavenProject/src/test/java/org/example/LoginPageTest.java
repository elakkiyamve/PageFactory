package org.example;

import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest{

    @Test
    public void userLoginTest() throws Exception {

       LoginPage loginpage = new LoginPage(driver);
        loginpage.userLogin("adhi@gmail.com","gmailcom");
       HomePage homepage = new HomePage(driver);
        homepage.loginAlertMessage();

    }
    //@Test
    public void createAccountTest() throws Exception {

       LoginPage loginpage = new LoginPage(driver);
        loginpage.createAccount("Raja@gmail.com","raja@1","raja@1");
       HomePage homepage = new HomePage(driver);
        homepage.signupAlertMessage();

    }

   //@Test
    public void productCategoryTest() throws InterruptedException {
      CategoryPage  categoryPage = new CategoryPage(driver);
       ProductPage productPage = new ProductPage(driver);
       ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);

        categoryPage.selectCategory();
        productPage.selectProduct();
        shoppingCartPage.cartValue();
    }
   // @Test
    public void orderSummaryTest(){
      AddressPage  addressPage = new AddressPage(driver);
      //  addressPage.userAddress();

    }

}
