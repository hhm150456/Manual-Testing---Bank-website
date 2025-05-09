package Tests;

import Base.TestBase;
import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductsPage;
import Pages.RegisterLoginPages;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceOrder extends TestBase {
    HomePage homePage;
    CartPage cartPage;
    RegisterLoginPages registerLoginPages;
    ProductsPage productsPage;

    @Description("Register while Checkout")
    @Test(priority = 0)
    public void Register_while_Checkout(){
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage=new ProductsPage(driver);
        registerLoginPages=new RegisterLoginPages(driver);
        homePage.navigate();
        homePage.clickproductstButton();
        productsPage.ClickaddToCart();
        productsPage.ClickcontinueShopping();
        homePage.clickCartButton();
        cartPage.clickcheckoutButton();
        cartPage.clickregisterLoginButton();
        String uniqueTimestamp = String.valueOf(System.currentTimeMillis());
        String uniqueUser = "user" + uniqueTimestamp;
        String uniqueEmail = "user" + uniqueTimestamp + "@gmail.com";
        registerLoginPages.Signup(uniqueUser, uniqueEmail);
        registerLoginPages.continueSignup("kkkkk","rowyna","mohamed","hfuhf","canada","kgjgk",1233,010);
        registerLoginPages.verify_ACCOUNTCREATED();
        registerLoginPages.click_continueButton();
        Assert.assertEquals(homePage.GetText(),uniqueUser );
        homePage.clickCartButton();
        cartPage.clickcheckoutButton();
        cartPage.VerifyAddress_Details_and_Review_Your_Order();
        cartPage.Enter_description();
        cartPage.clickplaceOrderButton();
        cartPage.Enter_payment_details();
        cartPage.DeleteAccount();

    }
    @Description("Register before Checkout")
    @Test(priority = 1)
    public void Register_before_Checkout(){
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage=new ProductsPage(driver);
        registerLoginPages=new RegisterLoginPages(driver);
        homePage.navigate();
        registerLoginPages.navigate();
        String uniqueTimestamp = String.valueOf(System.currentTimeMillis());
        String uniqueUser = "user" + uniqueTimestamp;
        String uniqueEmail = "user" + uniqueTimestamp + "@gmail.com";
        registerLoginPages.Signup(uniqueUser, uniqueEmail);
        registerLoginPages.continueSignup("kkkkk","rowyna","mohamed","hfuhf","canada","kgjgk",1233,010);
        registerLoginPages.verify_ACCOUNTCREATED();
        registerLoginPages.click_continueButton();
        Assert.assertEquals(homePage.GetText(),uniqueUser );
        homePage.clickproductstButton();
        productsPage.ClickaddToCart();
        productsPage.ClickcontinueShopping();
        homePage.clickCartButton();
        cartPage.clickcheckoutButton();
        cartPage.VerifyAddress_Details_and_Review_Your_Order();
        cartPage.Enter_description();
        cartPage.clickplaceOrderButton();
        cartPage.Enter_payment_details();
        cartPage.DeleteAccount();
    }
    @Description("login before Checkout")
    @Test(priority = 2)
    public void login_before_Checkout(){
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage=new ProductsPage(driver);
        registerLoginPages=new RegisterLoginPages(driver);
        homePage.navigate();
        registerLoginPages.navigate();
        registerLoginPages.login("user875@gmail.com" , 1234);
        registerLoginPages.clicklogin();
        Assert.assertEquals(homePage.GetText(),"user875");
        homePage.clickproductstButton();
        productsPage.ClickaddToCart();
        productsPage.ClickcontinueShopping();
        homePage.clickCartButton();
        cartPage.clickcheckoutButton();
        cartPage.VerifyAddress_Details_and_Review_Your_Order();
        cartPage.Enter_description();
        cartPage.clickplaceOrderButton();
        cartPage.Enter_payment_details();
        cartPage.DeleteAccount();
    }






}
