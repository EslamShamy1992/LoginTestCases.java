package TestCases;

import Base.BaseTest;
import PageObjects.GamesScreen;
import PageObjects.LoginScreen;
import PageObjects.TournamentsScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TournamentsTestCases extends BaseTest {
    LoginScreen login;
    TournamentsScreen Tournaments;
    GamesScreen game;

    @Test
    public void CreateNewTournament() throws InterruptedException {
        login = new LoginScreen(driver);
        Tournaments = new TournamentsScreen(driver);
        game = new GamesScreen(driver);
        login.Click_On_Session_Button();
        login.Enter_Phone_Number("01006838663");
        WebElement signin = login.SignIn_Button();
        signin.click();
        login.Enter_Verification_code("115599");
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
@Test
    public void DeleteTournament() throws InterruptedException {
    login = new LoginScreen(driver);
    Tournaments = new TournamentsScreen(driver);
    game = new GamesScreen(driver);
    Thread.sleep(3000);
    login.Click_On_Session_Button();
    login.Enter_Phone_Number("01006838663");
    WebElement signin = login.SignIn_Button();
    signin.click();
    login.Enter_Verification_code("115599");
    game = login.Click_on_Verify_Button();
    Tournaments.ClickOnTournamentsTab();
    Tournaments.ClickOnYourTournamentsTab();
    Tournaments.ClickOnTestTournament();
    Tournaments.ClickOnDeleteButton();
    Tournaments.Clickdelete();
    Assert.assertTrue(Tournaments.NoTournaments().isDisplayed());

    }

}
























































