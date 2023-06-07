package TestCases;

import Base.BaseTest;
import PageObjects.LoginScreen;
import PageObjects.SignupScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupTestCase extends BaseTest {
    SignupScreen signup;
    LoginScreen login;
    @Test(priority = 2)
    public void Signup_With_invalid_number(){
        login = new LoginScreen(driver);
        signup = new SignupScreen(driver);
        //login.Click_On_Allow();
        login.Click_On_Session_Button();
       signup=   login.Click_on_Sign_Up_Button();
        signup.Enter_Email("nada@gmail.com");
        signup.Enter_Phone_number("011233");
     signup.Click_on_checkBox();
    signup.Click_Signup();
         boolean x = signup.invalid_PhoneNumber_Message().isDisplayed();
        Assert.assertTrue(x);
    }
    @Test(priority = 3)
    public void Signup_With_invalid_Mail(){
        login = new LoginScreen(driver);
        //signup = new SignupScreen(driver);
        //login.Click_On_Allow();
        login.Click_On_Session_Button();
        signup=login.Click_on_Sign_Up_Button();
        signup.Enter_Email("nada@.com");
        signup.Enter_Phone_number("01141836355");
        signup.Click_on_checkBox();
        signup.Click_Signup();
        boolean x = signup.Signup_Text().isDisplayed();
        Assert.assertTrue(x);
    }
    @Test(priority = 4)
    public void Signup_With_leaving_CheckBox(){
        login = new LoginScreen(driver);
       //signup = new SignupScreen(driver);
        //login.Click_On_Allow();
        login.Click_On_Session_Button();
        signup= login.Click_on_Sign_Up_Button();
        signup.Enter_Email("nada@gmail.com");
        signup.Enter_Phone_number("01141836355");
        signup.Click_Signup();
        boolean x = signup.Signup_Text().isDisplayed();
        Assert.assertTrue(x);
    }
    @Test(priority = 1)
    public void Valid_signup(){
        login = new LoginScreen(driver);
        login.Click_On_Session_Button();
       signup= login.Click_on_Sign_Up_Button();
        signup.Enter_Email("eslam_shamy@hotmail.com");
        signup.Enter_Phone_number("01006838663");
        signup.Click_on_checkBox();
        signup.Click_Signup();
        boolean x = signup.Signin_Text().isDisplayed();
        Assert.assertTrue(x);
    }

    @Test(priority = 5)
    public void Open_Terms_Condition(){
        login= new LoginScreen(driver);
       // signup = new SignupScreen(driver);
        //login.Click_On_Allow();
        login.Click_On_Session_Button();
        signup=login.Click_on_Sign_Up_Button();
        signup.Terms_And_Condition();
        boolean playitlogo= signup.Playit_Logo().isDisplayed();
        Assert.assertTrue(playitlogo);

    }







}
