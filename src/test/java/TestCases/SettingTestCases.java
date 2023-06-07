package TestCases;

import Base.BaseTest;
import PageObjects.GamesScreen;
import PageObjects.LoginScreen;
import PageObjects.SettingScreen;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SettingTestCases extends BaseTest {
    LoginScreen login;
    GamesScreen game;
    SettingScreen setting;
    @Test
    public void Logout_TC_1(){
        login= new LoginScreen(driver);
        game = new GamesScreen(driver);
        setting = new SettingScreen(driver);
        login.Click_On_Session_Button();
        login.Enter_Phone_Number("01006838663");
        WebElement signin=login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code("115599");
        game=login.Click_on_Verify_Button();
        //game.Skip_Games_Tutorial();
        game.Menu().click();
        setting.Click_on_Settings_Button();
        setting.Click_on_Logout_Button();
        setting.Click_on_Logout_Cancel();
        boolean X = setting.Playit_Logo().isDisplayed();
        Assert.assertTrue(X);
    }
    @Test
    public void Logout_TC_2(){
        login= new LoginScreen(driver);
        game = new GamesScreen(driver);
        setting = new SettingScreen(driver);
        login.Click_On_Session_Button();
        login.Enter_Phone_Number("01006838663");
        WebElement signin=login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code("115599");
        game=login.Click_on_Verify_Button();
        //game.Skip_Games_Tutorial();
        game.Menu().click();
        setting.Click_on_Settings_Button();
        setting.Click_on_Logout_Button();
        setting.Click_on_logout_confirm();
        boolean X = login.SignIn_Button().isDisplayed();
        Assert.assertTrue(X);

    }
@Test
    public void Terms_and_conditions(){
    login= new LoginScreen(driver);
    game = new GamesScreen(driver);
    setting = new SettingScreen(driver);
    login.Click_On_Session_Button();
    login.Enter_Phone_Number("01006838663");
    WebElement signin=login.SignIn_Button();
    signin.click();
    login.Enter_Verification_code("115599");
    game=login.Click_on_Verify_Button();
   // game.Skip_Games_Tutorial();
    game.Menu().click();
    setting.Click_on_Settings_Button();
setting.Click_on_Terms_Conditions_Button();
String X = setting.Terms_and_conditions_Text().getText();
    System.out.println(X);
Assert.assertTrue(X.contains("Terms and Conditions"));

}

@Test
    public void privacy_policy(){
    login= new LoginScreen(driver);
    game = new GamesScreen(driver);
    setting = new SettingScreen(driver);
    login.Click_On_Session_Button();
    login.Enter_Phone_Number("01006838663");
    WebElement signin=login.SignIn_Button();
    signin.click();
    login.Enter_Verification_code("115599");
    game=login.Click_on_Verify_Button();
    // game.Skip_Games_Tutorial();
    game.Menu().click();
    setting.Click_on_Settings_Button();
    setting.Click_on_privacy_policy_button();
    String X = setting.privacy_Text().getText();
    System.out.println(X);
    Assert.assertTrue(X.contains("Policy"));

}









}
