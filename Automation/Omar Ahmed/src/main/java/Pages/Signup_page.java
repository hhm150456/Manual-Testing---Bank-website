package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Signup_page {
    WebDriver driver;

    public Signup_page(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private final By mr = By.id("id_gender1");
    private final By miss = By.id("id_gender2");
    private final By password_textbox =By.id("password");
    private final By day_dropdown=By.id("days");
    private final By months_dropdown=By.id("months");
    private final By year_dropdown=By.id("years");
    private final By First_name_textbox=By.id("first_name");
    private final By Last_name_textbox=By.id("last_name");
    private final By company_textbox=By.id("company");
    private final By address_textbox=By.id("address1");
    private final By address2_textbox=By.id("address2");
    private final By country_dropdown=By.id("country");
    private final By state_textbox=By.id("state");
    private final By city_textbox=By.id("city");
    private final By zipcode_textbox=By.id("zipcode");
    private final By mobile_number_textbox=By.id("mobile_number");
    private final By create_account_button=By.cssSelector("[data-qa='create-account']");
    private final By acc_created_msg=By.cssSelector("h2.title.text-center > b");
    //Actions
    public void mr_click(){
        driver.findElement(mr).click();
    }
    public void miss_click(){
        driver.findElement(miss).click();
    }
    public void enter_Password_textbox(String password){
        driver.findElement(password_textbox).sendKeys(password);
    }
    public void select_Day_dropdown(String day){
        Select select =new Select(driver.findElement(day_dropdown));
        select.selectByValue(day);
    }
    public void select_Months_dropdown(String month){
        Select select=new Select(driver.findElement(months_dropdown));
        select.selectByValue(month);
    }
    public void select_Year_dropdown(String year){
        Select select=new Select(driver.findElement(year_dropdown));
        select.selectByValue(year);
    }
    public void enter_First_name_textbox(String first_name){
       driver.findElement(First_name_textbox).sendKeys(first_name);
    }
    public void enter_Last_name_textbox(String last_name){
        driver.findElement(Last_name_textbox).sendKeys(last_name);
    }
    public void enter_company_textbox(String company){
        driver.findElement(company_textbox).sendKeys(company);
    }
    public void enter_F_address_textbox(String address){
        driver.findElement(address_textbox).sendKeys(address);
    }
    public void enter_S_address_textbox(String second_address){
        driver.findElement(address2_textbox).sendKeys(second_address);
    }
    public void select_country_dropdown(String country){
        Select select = new Select(driver.findElement(country_dropdown));
        select.selectByValue(country);
    }
    public void enter_state_textbox(String state){
        driver.findElement(state_textbox).sendKeys(state);
    }
    public void enter_city_textbox(String city){
        driver.findElement(city_textbox).sendKeys(city);
    }
    public void enter_zip_code(String zip_code){
        driver.findElement(zipcode_textbox).sendKeys(zip_code);
    }
    public void enter_mobile_numeber(String mobile_number){
        driver.findElement(mobile_number_textbox).sendKeys(mobile_number);
    }
    public void create_account_button_click(){
        driver.findElement(create_account_button).click();
    }
    //Assertion
    public void Validate_signup() {
        Assert.assertEquals(driver.findElement(acc_created_msg).getText(), "ACCOUNT CREATED!", "msg mismatch");
    }
}
