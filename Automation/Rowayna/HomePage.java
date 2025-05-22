package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait ;




    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver , Duration.ofSeconds(10));
    }


    //Locators
    private final By Cart_button=By.xpath("//a[contains(text(), 'Cart')]");
    private final By products_button=By.xpath("//a[contains(text(),'Products')]");
    private final By viewProduct_button = By.xpath("//a[@href='/product_details/4' and contains(text(),'View Product')]");
    private final By loggedInUser = By.xpath("//a[contains(text(), 'Logged in as')]//b");



    //Actions
    public void navigate()
    {
        driver.get("https://automationexercise.com/");
    }
    public void clickCartButton()
    {
        driver.findElement(Cart_button).click();
    }
    public void clickproductstButton(){driver.findElement(products_button).click();}
    public void clickviewProductButton(){driver.findElement(viewProduct_button).click();}
    public String  GetText(){
        return driver.findElement(loggedInUser).getText();
    }







    //Assertions







}
