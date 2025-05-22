package Utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Browser_Action {
    public static void Accept_Alert(WebDriver driver){
        WebDriverWait Wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        Wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public static String get_alret_text(WebDriver driver){
        WebDriverWait Wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        Wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }
}
