package TestCases;

import Base.BaseTest;
import PageObjects.GamesScreen;
import PageObjects.LoginScreen;
import PageObjects.SettingScreen;
import PageObjects.StoreScreen;
import Utils.ConfigUtils;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class StoreTestCases extends BaseTest {
    LoginScreen login;
    GamesScreen game;
    StoreScreen store;


    @Test
    public void purchase_ten_lives() {
        SoftAssert soft = new SoftAssert();
        login = new LoginScreen(driver);
        game = new GamesScreen(driver);
        store = new StoreScreen(driver);
        login.Click_On_Session_Button();
        login.Enter_Phone_Number(ConfigUtils.getInstance().getPhoneNumber());
        WebElement signin = login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code(ConfigUtils.getInstance().getVerificationCode());
        game = login.Click_on_Verify_Button();
        store.Click_on_store_icon();
        store.Click_on_items_Button();
        String current_Lives = store.Lives().getText();
        int lives = Integer.parseInt(current_Lives);
        System.out.println(lives);
        store.Click_on_Purchase_ten_Lives();
        store.Click_on_buy_button();
        boolean X = store.Payment_Successful().isDisplayed();
        soft.assertTrue(X);
        game.Games_Button_is_displayed(); // click
        System.out.println(lives + 10);
        soft.assertEquals(current_Lives, lives + 10);


    }

    @Test
    public void Subscription() {
        login = new LoginScreen(driver);
        game = new GamesScreen(driver);
        store = new StoreScreen(driver);
        login.Click_On_Session_Button();
        login.Enter_Phone_Number(ConfigUtils.getInstance().getPhoneNumber());
        WebElement signin = login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code(ConfigUtils.getInstance().getVerificationCode());
        game = login.Click_on_Verify_Button();
        store.Click_on_store_icon();
        store.Click_on_Purchase_Subscription();
        store.Click_On_BuySubscription_Button();
        store.Click_on_Subscribe_button();
        String y = store.Subscribed().getText();
        System.out.println(y);
        boolean X = store.Subscribed().isDisplayed();
        Assert.assertTrue(X);

    }
   @Test
    public void the_user_cannot_subscribe_two_times() {
        login = new LoginScreen(driver);
        game = new GamesScreen(driver);
        store = new StoreScreen(driver);
        login.Click_On_Session_Button();
       login.Enter_Phone_Number(ConfigUtils.getInstance().getPhoneNumber());
        WebElement signin = login.SignIn_Button();
        signin.click();
       login.Enter_Verification_code(ConfigUtils.getInstance().getVerificationCode());
        game = login.Click_on_Verify_Button();
        store.Click_on_store_icon();
        store.Click_on_Purchase_Subscription();
        store.Click_On_BuySubscription_Button();
        store.Click_on_Subscribe_button();
boolean zeft = store.AlreadySubscribed().isDisplayed();
Assert.assertTrue(zeft);


    }

}
