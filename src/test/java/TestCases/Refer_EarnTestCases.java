package TestCases;

import Base.BaseTest;
import PageObjects.GamesScreen;
import PageObjects.LoginScreen;
import PageObjects.ProfileScreen;
import PageObjects.Refer_EarnScreen;
import Utils.ConfigUtils;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Refer_EarnTestCases extends BaseTest {

    LoginScreen login;
    ProfileScreen profile;
    Refer_EarnScreen refer;
    GamesScreen game ;
    SoftAssert soft = new SoftAssert();
    @Test
    public void Refer_code_is_present(){
        login= new LoginScreen(driver);
        refer = new Refer_EarnScreen(driver);
        //soft = new SoftAssert();
        login.Click_On_Session_Button();
        login.Enter_Phone_Number(ConfigUtils.getInstance().getPhoneNumber());
        WebElement signin=login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code(ConfigUtils.getInstance().getVerificationCode());
        game=login.Click_on_Verify_Button();
        game.Skip_Games_Tutorial();
      game.Menu().click();
        refer.Click_on_Refer_and_earn();
        boolean X = refer.Refer_Code().isDisplayed();
        boolean Y = refer.Whatsapp().isDisplayed();
        soft.assertTrue(X,"First assertion");
        soft.assertTrue(Y,"Seconde Assertion");

    }

    @Test
    public void Send_Refer_code_via_Whatsapp() {
        login = new LoginScreen(driver);
        refer = new Refer_EarnScreen(driver);
        //soft = new SoftAssert();
        login.Click_On_Session_Button();
        login.Enter_Phone_Number(ConfigUtils.getInstance().getPhoneNumber());
        WebElement signin = login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code(ConfigUtils.getInstance().getVerificationCode());
        game = login.Click_on_Verify_Button();
        game.Skip_Games_Tutorial();
        game.Menu().click();
        refer.Click_on_Refer_and_earn();
        refer.Whatsapp().click();
        boolean X = refer.Sendto().isDisplayed();
        soft.assertTrue(X);

    }












}
