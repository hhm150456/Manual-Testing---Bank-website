package Pages;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import org.openqa.selenium.WebElement;

public class RegisterLoginPages {
    WebDriver driver;
    WebDriverWait wait ;
    HomePage homePage;
    CartPage cartPage;


    public RegisterLoginPages(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver , Duration.ofSeconds(10));}


    //Locators

    private final By nameField = By.name("name");
    private final By emailField = By.xpath("//input[@data-qa='signup-email']");
    private final By signupButton = By.xpath("//button[@data-qa='signup-button']");
    private final By Password = By.id("password");
    private final By first_name = By.id("first_name");
    private final By last_name = By.id("last_name");
    private final By address1 = By.id("address1");
    private final By country = By.id("country");
    private final By State = By.id("state");
    private final By City = By.id("city");
    private final By Zipcode = By.id("zipcode");
    private final By mobile_number = By.id("mobile_number");
    private final By createAccountButton = By.xpath("//button[text()='Create Account']");
    private final By accountCreatedMessage = By.xpath("//b[text()='Account Created!']");
    private final By continueButton = By.xpath("//a[text()='Continue']");
    private final By emailFieldlogin = By.xpath("//input[@data-qa='login-email']");
    private final By passwordField = By.xpath("//input[@data-qa='login-password']");
    private final By loginButton = By.xpath("//button[@data-qa='login-button']");










    //Actions

    public void login(String email , int password){
        driver.findElement(emailFieldlogin).sendKeys(email);
        driver.findElement(passwordField).sendKeys((String.valueOf(password)));



    }

    public void clicklogin(){
        driver.findElement(loginButton).click();
    }
    public void navigate()
    {
        driver.get("https://automationexercise.com/login");
    }
    public  void clicksignupButton(){
        driver.findElement(signupButton).click();
    }

    public  void Signup(String name , String email){
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(emailField).sendKeys(email);
        clicksignupButton();

    }
    public void clickcreateAccountButton(){
        driver.findElement(createAccountButton).click();
    }

    public void continueSignup(  String password , String firstname ,String lastname ,String address , String state , String city , int zipcode, int number)
    {


        driver.findElement(Password).sendKeys(password);
        driver.findElement(first_name).sendKeys(firstname);
        driver.findElement(last_name).sendKeys(lastname);
        driver.findElement(address1).sendKeys(address);
        select_country();
        driver.findElement(State).sendKeys(state);
        driver.findElement(City).sendKeys(city);
        driver.findElement(Zipcode).sendKeys((String.valueOf(zipcode)));
        driver.findElement(mobile_number).sendKeys((String.valueOf(number)));
        clickcreateAccountButton();



    }

    public void select_country(){
        WebElement countryDropdown = driver.findElement(country);
        Select select = new Select(countryDropdown);
        select.selectByVisibleText("Canada");
    }
    public void click_continueButton(){
        driver.findElement(continueButton).click();
    }



    //Assertions
    public void verify_ACCOUNTCREATED(){
        Assert.assertEquals(driver.findElement(accountCreatedMessage).getText(),"ACCOUNT CREATED!");
    }
}
