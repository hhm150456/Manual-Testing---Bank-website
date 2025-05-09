package Tests;

import Base.TestBase;
import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductsPage;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class CartTests extends TestBase {
    HomePage homePage;
    CartPage cartPage;
    ProductsPage productsPage;


    @Description("Verify Subscription in Cart page")
    @Test(priority = 0)

    public void VerifySubscription(){
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
        homePage.navigate();
        cartPage.VerifySub_scription("user@gmail.com");
        cartPage.VerifyTextSUBSCRIPTION();
        cartPage.VerifySuccessMessage();

    }

    @Description("Add Products in Cart")
    @Test(priority = 1)
    public void AddToCart(){
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
        productsPage = new ProductsPage(driver);
        homePage.navigate();
        productsPage.ADD_ToCart();
        cartPage.first_productElement ();
        cartPage.first_productElement ();
        cartPage.priceElement ();


    }

    @Description("Verify Product quantity in Cart")
    @Test(priority =2 )
    public void Verify_Product_quantity(){
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        homePage.navigate();
        cartPage.VerifyProductquantityinCart();
    }
    @Description("remove product from cart")
    @Test(priority = 3)
    public void Remove_Product(){
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage = new ProductsPage(driver);
        homePage.navigate();
        homePage.clickproductstButton();
        productsPage.ClickaddToCart();
        productsPage.ClickcontinueShopping();
        homePage.clickCartButton();
        cartPage.clickdeleteButton();
        cartPage.Verify_product_removed();

    }













}

