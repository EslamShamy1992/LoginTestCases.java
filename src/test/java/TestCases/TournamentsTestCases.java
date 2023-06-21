package TestCases;

import Base.BaseTest;
import PageObjects.GamesScreen;
import PageObjects.LoginScreen;
import PageObjects.TournamentsScreen;
import Utils.ConfigUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TournamentsTestCases extends BaseTest {
    LoginScreen login;
    TournamentsScreen Tournaments;
    GamesScreen game;

    @Test(priority = 1)
    public void CreateNewTournament()  {
        login = new LoginScreen(driver);
        Tournaments = new TournamentsScreen(driver);
        game = new GamesScreen(driver);
        login.Click_On_Session_Button();
        login.Enter_Phone_Number(ConfigUtils.getInstance().getPhoneNumber());
        WebElement signin = login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code(ConfigUtils.getInstance().getVerificationCode());
        game = login.Click_on_Verify_Button();
        Tournaments.ClickOnTournamentsTab();
        Tournaments.ClickOnYourTournamentsTab();
        Tournaments.ClickOnCreateTournament();
        Tournaments.ClickOnSelectGame();
        Tournaments.EnterTournamentName("test");
        Tournaments.GameTime();
        Tournaments.ClickOnCreateButton();
        Tournaments.ClickOnBack();
        String X = Tournaments.NameOfTournament().getText();
        Assert.assertEquals(X, "test");
    }

    @Test(priority = 2)
    public void JoinTournament()  {
        login = new LoginScreen(driver);
        Tournaments = new TournamentsScreen(driver);
        game = new GamesScreen(driver);
        login.Click_On_Session_Button();
        login.Enter_Phone_Number(ConfigUtils.getInstance().getPhoneNumber());
        WebElement signin = login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code(ConfigUtils.getInstance().getVerificationCode());
        game = login.Click_on_Verify_Button();
        Tournaments.ClickOnTournamentsTab();
        Tournaments.ClickOnYourTournamentsTab();
        Tournaments.ClickOnTestTournament();
        Tournaments.ClickOnShareButton();
        String X = Tournaments.Code().getText();
        Tournaments.ClickCloseCode();
        Tournaments.ClickOnBack();
        Tournaments.ClickOnJoinButton();
        Tournaments.EnterCode().sendKeys(X);
        Tournaments.ClickOnJoinTournament();


    }

    @Test(priority = 4)
        public void DeleteTournament()  {
        login = new LoginScreen(driver);
        Tournaments = new TournamentsScreen(driver);
        game = new GamesScreen(driver);
        login.Click_On_Session_Button();
        login.Enter_Phone_Number(ConfigUtils.getInstance().getPhoneNumber());
        WebElement signin = login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code(ConfigUtils.getInstance().getVerificationCode());
        game = login.Click_on_Verify_Button();
        Tournaments.ClickOnTournamentsTab();
        Tournaments.ClickOnYourTournamentsTab();
        Tournaments.ClickOnTestTournament();
        Tournaments.ClickOnDeleteButton();
        Tournaments.Clickdelete();
        Assert.assertTrue(Tournaments.NoTournaments().isDisplayed());

    }

    @Test(priority = 3)
    public void EnterInvalidCode() {
        login = new LoginScreen(driver);
        Tournaments = new TournamentsScreen(driver);
        game = new GamesScreen(driver);
        login.Click_On_Session_Button();
        login.Enter_Phone_Number(ConfigUtils.getInstance().getPhoneNumber());
        WebElement signin = login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code(ConfigUtils.getInstance().getVerificationCode());
        game = login.Click_on_Verify_Button();
        Tournaments.ClickOnTournamentsTab();
        Tournaments.ClickOnYourTournamentsTab();
        Tournaments.ClickOnJoinButton();
        Tournaments.EnterCode().sendKeys("abcdef");
        Tournaments.ClickOnJoinTournament();
        boolean X = Tournaments.IncorrectCodeMessagE().isDisplayed();
        Assert.assertTrue(X);


    }
}
























































