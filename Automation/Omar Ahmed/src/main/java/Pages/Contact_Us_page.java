package Pages;

import Utilities.Browser_Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Contact_Us_page {

    WebDriver driver ;

    public Contact_Us_page(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private final By name_text_box=By.cssSelector("[data-qa='name']");
    private final By Email_text_box=By.cssSelector("[data-qa='email']");
    private final By Subject_text_box=By.cssSelector("[data-qa='subject']");
    private final By Your_Message_Here_text_box=By.id("message");
    private final By Submit_Buttom=By.cssSelector("[data-qa='submit-button']");
    private final By success_text=By.cssSelector(".status.alert.alert-success");
    //Action
    public void enter_name_text_box(String name){
        driver.findElement(name_text_box).sendKeys(name);
    }
    public void enter_Email_text_box(String email){
        driver.findElement(Email_text_box).sendKeys(email);
    }
    public void enter_Subject_text_box(String subject){
        driver.findElement(Subject_text_box).sendKeys(subject);
    }
    public void enter_Your_Message_Here_text_box(String msg){
        driver.findElement(Your_Message_Here_text_box).sendKeys(msg);
    }
    public void click_Submit_Buttom(){
        driver.findElement(Submit_Buttom).click();
    }
    public void Accept_Popup(){
        Browser_Action.Accept_Alert(driver);
    }
    //Assertion
    public void valided_the_submition(){
        Assert.assertEquals(driver.findElement(success_text).getText(),"Success! Your details have been submitted successfully.");
    }
}
