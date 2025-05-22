package Tests;

import Base.TestBase;
import Pages.*;
import org.testng.annotations.Test;

public class Test_case_hub extends TestBase
{
    HomePage homePage;
    Signup_or_Login_page signup_or_login_page;
    Signup_page signupPage;
    Contact_Us_page contact_us_page ;
    Products_Page products_page;
    @Test(description = "valdite that user can make an account")
    public void signup(){
        homePage=new HomePage(driver);
        signup_or_login_page = new Signup_or_Login_page(driver);
        signupPage=new Signup_page(driver);
        homePage.navigate();
        homePage.click_Signup_or_login();
        signup_or_login_page.enter_name_signup("diddy");
        signup_or_login_page.enter_email_signup("jo000@gmail");
        signup_or_login_page.Signup_button_click();
        signupPage.mr_click();
        signupPage.enter_Password_textbox("donkykong50");
        signupPage.select_Day_dropdown("27");
        signupPage.select_Months_dropdown("2");
        signupPage.select_Year_dropdown("2000");
        signupPage.enter_First_name_textbox("j");
        signupPage.enter_Last_name_textbox("o");
        signupPage.enter_company_textbox("ma");
        signupPage.enter_F_address_textbox("j");
        signupPage.enter_S_address_textbox("j");
        signupPage.select_country_dropdown("India");
        signupPage.enter_state_textbox("j");
        signupPage.enter_city_textbox("j");
        signupPage.enter_zip_code("j");
        signupPage.enter_mobile_numeber("123");
        signupPage.create_account_button_click();
        signupPage.Validate_signup();
    }
    @Test(description = "valdite that user can log in account with correct info")
    public void valid_login(){
        homePage=new HomePage(driver);
        signup_or_login_page = new Signup_or_Login_page(driver);

        homePage.navigate();
        homePage.click_Signup_or_login();
        signup_or_login_page.enter_login_email_textbox("jo000@gmail");
        signup_or_login_page.enter_login_password_textbox("donkykong50");
        signup_or_login_page.click_login_button();
        homePage.validate_logged_in_msg();
    }
    @Test(description = "invaild pass or email")
    public void Ivalid_login(){
        homePage=new HomePage(driver);
        signup_or_login_page = new Signup_or_Login_page(driver);

        homePage.navigate();
        homePage.click_Signup_or_login();
        signup_or_login_page.enter_login_email_textbox("jo000@gmail");
        signup_or_login_page.enter_login_password_textbox("donkllllykong50");
        signup_or_login_page.click_login_button();
        signup_or_login_page.Invalid_login();
    }
    @Test(description = "valdite that user can log in account with correct info so you can log out")
    public void vald_logout(){
        homePage=new HomePage(driver);
        signup_or_login_page = new Signup_or_Login_page(driver);

        homePage.navigate();
        homePage.click_Signup_or_login();
        signup_or_login_page.enter_login_email_textbox("jo000@gmail");
        signup_or_login_page.enter_login_password_textbox("donkykong50");
        signup_or_login_page.click_login_button();
        homePage.validate_logged_in_msg();
        homePage.click_Logout_Button();
        signup_or_login_page.login_text_verfcation();
    }
    @Test(description = "register user with exsiting email")
    public void invalid_signup(){
        homePage=new HomePage(driver);
        signup_or_login_page = new Signup_or_Login_page(driver);
        signupPage=new Signup_page(driver);
        homePage.navigate();
        homePage.click_Signup_or_login();
        signup_or_login_page.enter_name_signup("diddy");
        signup_or_login_page.enter_email_signup("jo000@gmail");
        signup_or_login_page.Signup_button_click();
        signup_or_login_page.invaild_signup_text_validation();
    }
    @Test(description ="contact Us form")
    public void Contact_us_form(){
        homePage=new HomePage(driver);
        contact_us_page=new Contact_Us_page(driver);
        homePage.navigate();
        homePage.Contact_Us_Button_click();
        contact_us_page.enter_name_text_box("diddy");
        contact_us_page.enter_Email_text_box("jo000@gmail");
        contact_us_page.enter_Subject_text_box("s");
        contact_us_page.enter_Your_Message_Here_text_box("sss");
        contact_us_page.click_Submit_Buttom();
        contact_us_page.Accept_Popup();
        contact_us_page.valided_the_submition();
    }
    @Test(description = "verfiy test case page")
    public void verfy_test_case(){
        homePage=new HomePage(driver);
        homePage.navigate();
        homePage.click_Test_case_button();
        homePage.validate_testcase_page();
    }
    @Test(description = "verfiy the frist product page")
    public void product_test(){
        homePage=new HomePage(driver);
        products_page=new Products_Page(driver);
        homePage.navigate();
        homePage.click_Products_button();
        products_page.press_view_prodcut_button();
        products_page.vaildite_add_to_cart_Text();
    }
}
