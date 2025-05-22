package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class ProductsPage {
    WebDriver driver;
    WebDriverWait wait ;
    HomePage homePage;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver , Duration.ofSeconds(10));
    }

    //Locators
    private final By addToCartButton = By.xpath("//a[@data-product-id='1']");
    private final By continueShoppingButton = By.xpath("//button[text()='Continue Shopping' and @data-dismiss='modal']");
    private final By addToCartButton2 = By.xpath("//a[@data-product-id='2']");
    private final By viewCartLink = By.xpath("//a[u[text()='View Cart']]");
    private final By womenLink = By.xpath("//a[@data-toggle='collapse' and @href='#Women']");
    private final By dressLink = By.xpath("//a[@href='/category_products/1']");
    private final By titleElement = By.xpath("//h2[@class='title text-center' and text()='Women - Dress Products']");
    private final By menCategoryLink = By.xpath("//h4[@class='panel-title']/a[@href='#Men']");
    private final By tshirtsLink = By.xpath("//a[@href='/category_products/3' and normalize-space(text())='Tshirts']");









    // Actions


    public void ClickaddToCart(){
        driver.findElement(addToCartButton).click();
    }

    public void ClickcontinueShopping(){
        driver.findElement(continueShoppingButton).click();
    }

    public void ClickaddToCart2(){
        driver.findElement(addToCartButton2).click();
    }

    public void clickviewCart(){
        driver.findElement(viewCartLink).click();
    }

    public void clickwomenLink(){driver.findElement(womenLink).click();}

    public void clickdressLink(){driver.findElement(dressLink).click();}

    public void clickmenCategoryLink(){driver.findElement(menCategoryLink).click();}

    public void clicktshirtsLink(){driver.findElement(tshirtsLink).click();}
    



    public void ADD_ToCart(){
        homePage = new HomePage(driver);
        homePage.clickproductstButton();
        ClickaddToCart();
        ClickcontinueShopping();
        ClickaddToCart2();
        clickviewCart();

    }




    //Assertions






}


