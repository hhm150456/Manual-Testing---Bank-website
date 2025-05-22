package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
    WebDriver driver ;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private final By Signup_or_login_button = By.cssSelector(".fa.fa-lock");
    private final By Logout_Button = By.cssSelector("a[href='/logout']");
    private final By Logged_in_msg = By.xpath("//a[contains(text(), 'Logged in as')]");
    private final By Contact_Us_Button=By.cssSelector("a[href='/contact_us']");
    private final By Test_case_button=By.cssSelector("a[href='/test_cases']");
    private final By Title=By.xpath("//h2[@class='title text-center']/b");
    private final By Products_button=By.cssSelector("a[href='/products']");
    //Actions
    public void navigate()
    {
        driver.get("https://www.automationexercise.com");
    }

    public void click_Signup_or_login(){
        driver.findElement(Signup_or_login_button).click();
    }
    public void click_Logout_Button(){
        driver.findElement(Logout_Button).click();
    }
    public void Contact_Us_Button_click(){
        driver.findElement(Contact_Us_Button).click();
    }
    public void click_Test_case_button(){
        driver.findElement(Test_case_button).click();
    }
    public void click_Products_button(){
        driver.findElement(Products_button).click();
    }
    //Assertion
    public void validate_logged_in_msg(){
        String actualText = driver.findElement(Logged_in_msg).getText();
        Assert.assertTrue(actualText.startsWith("Logged in as"), "Login message does not start with expected text.");
    }
    public void validate_testcase_page(){
        Assert.assertEquals(driver.findElement(Title).getText(),"TEST CASES");
    }
}
