package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Products_Page {
    WebDriver driver;

    public Products_Page(WebDriver driver) {
        this.driver = driver;
    }
    //locators
    private final By view_prduct_Button = By.xpath("//a[text()='View Product']");
    private final By add_to_cart_Text=By.cssSelector("button.btn.btn-default.cart");
    //Actions
    public void press_view_prodcut_button(){
        driver.findElement(view_prduct_Button).click();
    }
    //Assertion
    public void vaildite_add_to_cart_Text(){
        Assert.assertEquals(driver.findElement(add_to_cart_Text),"Add to cart");
    }
}
