package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
public class CartPage {
    WebDriver driver;
    WebDriverWait wait ;
    HomePage homePage;



    public CartPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver , Duration.ofSeconds(10));}


    //Locators
    private final By input_button = By.id("susbscribe_email");
    private final By arrow_button = By.id("subscribe");
    private final By SUBSCRIPTION_Text = By.xpath("//h2[normalize-space(text())='Subscription']");
    private final By Success_Alert = By.xpath("//div[contains(@class, 'alert-success') and contains(text(), 'successfully subscribed')]");
    private final By first_product = By.xpath("//a[contains(text(),'Blue Top')]");
    private final By second_product = By.xpath("//a[contains(text(), 'Men Tshirt')]");
    private final By  priceElement = (By.xpath("//p[text()='Rs. 400']"));
    private final By quantity_input = By.id("quantity");
    private final By Add_To_Cart_button = By.xpath("//button[@type='button' and contains(@class, 'cart')]");
    private final By view_cart = By.xpath("//u[text()='View Cart']");
    private final By Quantity = By.xpath("//button[contains(text(),'4')]");
    private final By checkoutButton = By.xpath("//a[@class='btn btn-default check_out']");
    private final By registerLogin = By.xpath("//u[text()='Register / Login']");
    private final By addressHeading = By.xpath("//h2[text()='Address Details']");
    private final By reviewOrderHeading = By.xpath("//h2[text()='Review Your Order']");
    private final By messageTextArea = By.name("message");
    private final By placeOrderButton = By.xpath("//a[contains(text(), 'Place Order') and contains(@class, 'check_out')]");
    private final By nameOnCardField = By.xpath("//input[@data-qa='name-on-card']");
    private final By cardNumberField = By.xpath("//input[@data-qa='card-number']");
    private final By cvcField = By.xpath("//input[@data-qa='cvc']");
    private final By expiryMonthField = By.className("card-expiry-month");
    private final By expiryYearField = By.className("card-expiry-year");
    private final By payButton = By.id("submit");
    private final By deleteAccountLink = By.xpath("//a[@href='/delete_account']");
    private final By deleteButton = By.xpath("//a[@class='cart_quantity_delete']");
    private final By emptyCartMessage = By.xpath("//b[text()='Cart is empty!']");







    //Actions
    public void clickArrowButton()
    {
        driver.findElement(arrow_button).click();
    }
    public void clickdeleteButton(){driver.findElement(deleteButton).click();}
    public void clickplaceOrderButton(){driver.findElement(placeOrderButton).click();}

    public void EnterEmail(String email){
        driver.findElement(input_button).sendKeys(email);
    }


    public void VerifySub_scription(String email)
    {
        homePage = new HomePage(driver);
        homePage.clickCartButton();
        EnterEmail(email);
        clickArrowButton();

    }

    public void Inc_quantity(){
        driver.findElement(quantity_input).clear();
        driver.findElement(quantity_input).sendKeys("4");
    }

    public void click_Add_To_Cart_button(){
        driver.findElement(Add_To_Cart_button).click();
    }

    public void click_view_cart(){
        driver.findElement(view_cart).click();
    }

    public void VerifyProductquantityinCart(){
        homePage = new HomePage(driver);
        homePage.clickviewProductButton();
        Inc_quantity();
        click_Add_To_Cart_button();
        click_view_cart();
        verify_quantity();


    }


    public void clickcheckoutButton(){
        driver.findElement(checkoutButton).click();
    }
    public void clickregisterLoginButton(){
        driver.findElement(registerLogin).click();
    }
    public void Enter_description(){driver.findElement(messageTextArea).sendKeys("description");}
    public void Enter_payment_details(){
        driver.findElement(nameOnCardField).sendKeys("rowyna");
        driver.findElement(cardNumberField).sendKeys("1111111");
        driver.findElement(cvcField).sendKeys("111");
        driver.findElement(expiryMonthField).sendKeys("123333334");
        driver.findElement(expiryYearField).sendKeys("345678");
        driver.findElement(payButton).click();


    }

    public void DeleteAccount(){
        driver.findElement(deleteAccountLink).click();
    }








    //Assertions
    public void VerifyTextSUBSCRIPTION(){
        Assert.assertEquals(driver.findElement(SUBSCRIPTION_Text).getText(),"SUBSCRIPTION");

    }
    public void VerifySuccessMessage(){
        Assert.assertEquals(driver.findElement(Success_Alert).getText(),"You have been successfully subscribed!");

    }
    public void  second_productElement (){
        driver.findElement(By.xpath("//a[text()='Men Tshirt']")).isDisplayed();
    }

    public void  first_productElement (){
        driver.findElement( By.xpath("//a[contains(text(),'Blue Top')]")).isDisplayed();
    }

    public void priceElement (){
        driver.findElement(  By.xpath("//p[text()='Rs. 400']")).isDisplayed();
    }
    
    public void verify_quantity(){
        Assert.assertEquals(driver.findElement(Quantity).getText(),"4");

    }
    public void  VerifyAddress_Details_and_Review_Your_Order(){
        Assert.assertEquals(driver.findElement(addressHeading).getText(),"Address Details");
        Assert.assertEquals(driver.findElement(reviewOrderHeading).getText(),"Review Your Order");

    }

    public void Verify_product_removed(){
        Assert.assertEquals(driver.findElement(emptyCartMessage).getText(),"");
    }


}
