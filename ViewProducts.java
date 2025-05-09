package Tests;

import Base.TestBase;
import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductsPage;
import Pages.RegisterLoginPages;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class ViewProducts extends TestBase {
    HomePage homePage;
    CartPage cartPage;
    RegisterLoginPages registerLoginPages;
    ProductsPage productsPage;

    @Description("View Category Products")
    @Test(priority = 0)
    public void View_Category_Products(){
        homePage = new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.navigate();
        productsPage.clickwomenLink();
        productsPage.clickdressLink();
        productsPage.clickmenCategoryLink();
        productsPage.clicktshirtsLink();





    }


}
