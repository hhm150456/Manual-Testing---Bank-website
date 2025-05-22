package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBase {

    public WebDriver driver;

//    @Parameters("browser")
    @BeforeMethod
    public void preconditions()
    {
//        if(browser.equalsIgnoreCase("chrome"))
//        {
//            driver = new ChromeDriver();
//        }
//        else if (browser.equalsIgnoreCase("firefox"))
//        {
//            driver = new FirefoxDriver();
//        }
//        else if (browser.equalsIgnoreCase("edge"))
//        {
//            driver = new EdgeDriver();
//        }
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }
}
