package TestCases;

import Base.BaseTest;
import PageObjects.GamesScreen;
import PageObjects.LoginScreen;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestCases extends BaseTest {
  LoginScreen login;
  GamesScreen game;

    @Test
    public void Login_with_invalid_Verification_Number(){

        login= new LoginScreen(driver);
        //login.Click_On_Allow();
        login.Click_On_Session_Button();
        login.Enter_Phone_Number("01006838663");
       WebElement signin= login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code("123456");
        login.Click_on_Verify_Button();
        boolean textDigits=login.We_Sent_Digits_Number().isDisplayed();
        Assert.assertTrue(textDigits);
    }
    @Test
    public void Login_With_Invalid_phone_Number(){
        login= new LoginScreen(driver);
        //login.Click_On_Allow();
        login.Click_On_Session_Button();
        login.Enter_Phone_Number("00000000000");
        login.SignIn_Button();
        boolean X = login.SignIn_Button().isDisplayed();
        Assert.assertTrue(X);
    }

    @Test
    public void Login_With_Valid_Phone_Number(){
        login= new LoginScreen(driver);
        //login.Click_On_Allow();
        login.Click_On_Session_Button();
        login.Enter_Phone_Number("01006838663");
        WebElement signin=login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code("115599");
        game=login.Click_on_Verify_Button();
        game.Skip_Games_Tutorial();
        boolean RewardBox=game.Reward_Box().isDisplayed();
        Assert.assertTrue(RewardBox);

    }
    @Test
    public void Login_With_Empty_phone_number_Field(){
        login= new LoginScreen(driver);
        //login.Click_On_Allow();
        login.Click_On_Session_Button();
       WebElement Sign_in = login.SignIn_Button();
              Sign_in.click();
        boolean X = login.SignIn_Button().isDisplayed();
        Assert.assertTrue(X);
    }

    @Test
    public void Login_with_Google(){ //BLOCKED
        login= new LoginScreen(driver);
        //login.Click_On_Allow();
        login.Click_On_Session_Button();
        login.Click_on_google_button();
        login.Click_on_Eslam_account();
    }


}
