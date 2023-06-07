package TestCases;

import Base.BaseTest;
import PageObjects.GamesScreen;
import PageObjects.LoginScreen;
import PageObjects.ProfileScreen;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ProfileTestCases extends BaseTest {
    ProfileScreen profile;
    GamesScreen games;
    LoginScreen login;
    @Test
   public void EditProfileValidScenario(){
    profile=new ProfileScreen(driver);
    games = new GamesScreen(driver);
        login= new LoginScreen(driver);
        login.Click_On_Session_Button();
        login.Enter_Phone_Number("01006838663");
        WebElement signin=login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code("115599");
        games=login.Click_on_Verify_Button();
        games.Skip_Games_Tutorial();
        games.Menu().click();
profile.Click_on_profileButton();
profile.Username().clear();
profile.Username().sendKeys("Nada Muhammed");
profile.Email().clear();
profile.Email().sendKeys("NadaTest123@gmail.com");
profile.Click_on_Birthdate();
profile.Click_on_ok();
profile.Click_on_Female_Checkbox();
profile.Bio("anything");
profile.Click_on_save_button();
    }
    @Test
    public void EditProfile_INValidScenario(){
        profile=new ProfileScreen(driver);
        games = new GamesScreen(driver);
        login= new LoginScreen(driver);
        login.Click_On_Session_Button();
        login.Enter_Phone_Number("01006838663");
        WebElement signin=login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code("115599");
        games=login.Click_on_Verify_Button();
        games.Skip_Games_Tutorial();
        games.Menu().click();
        profile.Click_on_profileButton();
        profile.Username().clear();
        profile.Email().clear();
        profile.Click_on_Female_Checkbox();
        profile.Bio("anything");
        profile.Click_on_save_button();

    }





}
