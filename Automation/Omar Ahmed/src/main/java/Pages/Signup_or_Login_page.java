package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Signup_or_Login_page {
    WebDriver driver;

    public Signup_or_Login_page(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private final By invaild_signup_text=By.xpath("//p[text()='Email Address already exist!']");
    private final By Text_login=By.xpath("//h2[text()='Login to your account']");
    private final By login_email_textbox = By.cssSelector("[data-qa='login-email']");
    private final By login_password_textbox = By.cssSelector("[data-qa='login-password']");
    private final By login_button = By.cssSelector("[data-qa='login-button']");
    private final By signup_name_textbox = By.cssSelector("[data-qa='signup-name']");
    private final By Signup_email_textbox = By.cssSelector("[data-qa='signup-email']");
    private final By signup_button =By.cssSelector("[data-qa='signup-button']");
    private final By Invaild_login =By.xpath("//p[text()='Your email or password is incorrect!']");
    //Actions
    public void enter_name_signup(String name ){
        driver.findElement(signup_name_textbox).sendKeys(name);
    }
    public void enter_email_signup(String email ){
        driver.findElement(Signup_email_textbox).sendKeys(email);
    }
    public void Signup_button_click(){
        driver.findElement(signup_button).click();
    }
    public void enter_login_email_textbox(String email){
        driver.findElement(login_email_textbox).sendKeys(email);
    }
    public void enter_login_password_textbox(String password){
        driver.findElement(login_password_textbox).sendKeys(password);
    }
    public void click_login_button(){
        driver.findElement(login_button).click();
    }
    //Assertion
    public void Invalid_login() {
        String actualText = driver.findElement(Invaild_login).getText();
        Assert.assertEquals(actualText, "Your email or password is incorrect!");
    }
    public void login_text_verfcation(){
        Assert.assertEquals(driver.findElement(Text_login).getText(),"Login to your account");
    }
    public void invaild_signup_text_validation(){
        Assert.assertEquals(driver.findElement(invaild_signup_text).getText(),"Email Address already exist!");

    }
}
