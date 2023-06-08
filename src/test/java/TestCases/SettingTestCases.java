package TestCases;

import Base.BaseTest;
import PageObjects.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SettingTestCases extends BaseTest {
    LoginScreen login;
    GamesScreen game;
    SettingScreen setting;
    SignupScreen signup;
    KunaiThrowScreen kunai;

    @Test
    public void Check_That_Cancel_Button_Is_Working() {
        login = new LoginScreen(driver);
        game = new GamesScreen(driver);
        setting = new SettingScreen(driver);
        login.Click_On_Session_Button();
        login.Enter_Phone_Number("01006838663");
        WebElement signin = login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code("115599");
        game = login.Click_on_Verify_Button();
        //game.Skip_Games_Tutorial();
        game.Menu().click();
        setting.Click_on_Settings_Button();
        setting.Click_on_Logout_Button();
        setting.Click_on_Logout_Cancel();
        boolean X = setting.Playit_Logo().isDisplayed();
        Assert.assertTrue(X);
    }

    @Test
    public void The_User_Can_Logout_Successfully() {
        login = new LoginScreen(driver);
        game = new GamesScreen(driver);
        setting = new SettingScreen(driver);
        login.Click_On_Session_Button();
        login.Enter_Phone_Number("01006838663");
        WebElement signin = login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code("115599");
        game = login.Click_on_Verify_Button();
        //game.Skip_Games_Tutorial();
        game.Menu().click();
        setting.Click_on_Settings_Button();
        setting.Click_on_Logout_Button();
        setting.Click_on_logout_confirm();
        boolean X = login.SignIn_Button().isDisplayed();
        Assert.assertTrue(X);

    }

    @Test
    public void Terms_and_conditions() {
        login = new LoginScreen(driver);
        game = new GamesScreen(driver);
        setting = new SettingScreen(driver);
        login.Click_On_Session_Button();
        login.Enter_Phone_Number("01006838663");
        WebElement signin = login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code("115599");
        game = login.Click_on_Verify_Button();
        // game.Skip_Games_Tutorial();
        game.Menu().click();
        setting.Click_on_Settings_Button();
        setting.Click_on_Terms_Conditions_Button();
        String X = setting.Terms_and_conditions_Text().getText();
        System.out.println(X);
        Assert.assertTrue(X.contains("Terms and Conditions"));

    }

    @Test
    public void privacy_policy() {
        login = new LoginScreen(driver);
        game = new GamesScreen(driver);
        setting = new SettingScreen(driver);
        login.Click_On_Session_Button();
        login.Enter_Phone_Number("01006838663");
        WebElement signin = login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code("115599");
        game = login.Click_on_Verify_Button();
        // game.Skip_Games_Tutorial();
        game.Menu().click();
        setting.Click_on_Settings_Button();
        setting.Click_on_privacy_policy_button();
        String X = setting.privacy_Text().getText();
        System.out.println(X);
        Assert.assertTrue(X.contains("Policy"));


    }


    @Test
    public void User_Should_Be_able_To_Change_The_language_Successfully() {

        login = new LoginScreen(driver);
        game = new GamesScreen(driver);
        setting = new SettingScreen(driver);
        login.Click_On_Session_Button();
        login.Enter_Phone_Number("01006838663");
        WebElement signin = login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code("115599");
        game = login.Click_on_Verify_Button();
        // game.Skip_Games_Tutorial();
        game.Menu().click();
        setting.Click_on_Settings_Button();
        setting.Language_Button();
        setting.Choose_Arabic();
        setting.Confirm_Language_Button();
        game.Mission_Button();
        String missiontitle = game.Mission_Ttle().getText();
        Assert.assertEquals(missiontitle, "المهام");


    }

    @Test
    public void check_that_No_button_is_working() {
        login = new LoginScreen(driver);
        game = new GamesScreen(driver);
        setting = new SettingScreen(driver);
        login.Click_On_Session_Button();
        login.Enter_Phone_Number("01006838663");
        WebElement signin = login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code("115599");
        game = login.Click_on_Verify_Button();
        // game.Skip_Games_Tutorial();
        game.Menu().click();
        setting.Click_on_Settings_Button();
        setting.Click_on_Delete_Account_Button();
        setting.Click_on_No_DeleteAccount();
        boolean X = setting.Playit_Logo().isDisplayed();
        Assert.assertTrue(X);

    }

    @Test
    public void user_can_delete_account_successfully() {
        login = new LoginScreen(driver);
        game = new GamesScreen(driver);
        setting = new SettingScreen(driver);
        signup = new SignupScreen(driver);
        login.Click_On_Session_Button();
        login.Enter_Phone_Number("01006838663");
        WebElement signin = login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code("115599");
        game = login.Click_on_Verify_Button();
        // game.Skip_Games_Tutorial();
        game.Menu().click();
        setting.Click_on_Settings_Button();
        setting.Click_on_Delete_Account_Button();
        setting.Click_on_YES_DeleteAccount();
        boolean X = login.SignIn_Button().isDisplayed();
        Assert.assertTrue(X);
        signup = login.Click_on_Sign_Up_Button();
        signup.Enter_Email("eslam_shamy@hotmail.com");
        signup.Enter_Phone_number("01006838663");
        signup.Click_on_checkBox();
        signup.Click_Signup();

    }
    @Test
   public void The_user_Should_Be_Able_To_Uninstall_Games() throws InterruptedException {

       login = new LoginScreen(driver);
       game = new GamesScreen(driver);
       setting = new SettingScreen(driver);
       signup = new SignupScreen(driver);
       kunai= new KunaiThrowScreen(driver);
       login.Click_On_Session_Button();
       login.Enter_Phone_Number("01006838663");
       WebElement signin = login.SignIn_Button();
       signin.click();
       login.Enter_Verification_code("115599");
       game = login.Click_on_Verify_Button();
       game.Click_On_Kunai_Throw_Game();
       kunai.Click_On_Play_Button();
       Thread.sleep(9000);
       driver.terminateApp("com.gt.pi");
       driver.activateApp("com.gt.pi");
       game.Menu().click();
       setting.Click_on_Settings_Button();
       setting.Click_on_Game_Management();
       setting.Uninstall_KunaiThrow();
       boolean uninstallIsDisplayed= setting.Uninstalled_Successfully_Message().isDisplayed();
       Assert.assertTrue(uninstallIsDisplayed);


   }
}













