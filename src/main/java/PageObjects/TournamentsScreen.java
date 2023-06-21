package PageObjects;

import Base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TournamentsScreen extends BasePage {
    public TournamentsScreen(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Tournaments\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement Tournaments_Tab;
    @FindBy(id = "com.gt.pi:id/yourTournamentsBtn")
    private WebElement YourTournamentsTab;
    @FindBy(id = "com.gt.pi:id/createNewTournament")
    private WebElement CreateTournament;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.FrameLayout[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.Spinner[1]/android.widget.TextView")
    private WebElement SelectGame;
    @FindBy(id = "com.gt.pi:id/et_tournament_name")
    private WebElement TournamentName;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.FrameLayout[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.Spinner[2]/android.widget.TextView")
    private WebElement Time;
    @FindBy(id = "com.gt.pi:id/tv_create")
    private WebElement CreateButton;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]")
    private WebElement BubbleShooter;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")
    private WebElement SelectTime;
    @FindBy(id = "com.gt.pi:id/mainBackIV")
    private WebElement Back;

    @FindBy(id = "com.gt.pi:id/userTournamentNameTV")
    private WebElement NameOfTournamentS;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup")
    private WebElement testtournament;
    @FindBy(id = "com.gt.pi:id/delete_tournament_btn")
    private WebElement DeleteIcon;
    @FindBy(id = "com.gt.pi:id/tv_delete")
    private WebElement delete;
    @FindBy(id = "com.gt.pi:id/noTournaments")
    private WebElement NoTournamentsmessage;
    @FindBy(id = "com.gt.pi:id/share_tournament_btn")
    private WebElement ShareButton;
    @FindBy(id = "com.gt.pi:id/text_copy_referal_code")
    private WebElement Code;

    @FindBy(id = "com.gt.pi:id/btn_close_dialog")
    private WebElement CloseCopyCode;

    @FindBy(id = "com.gt.pi:id/joinTournamentBtn")
    private WebElement JoinButton;
    @FindBy(id = "com.gt.pi:id/tournamentCodeTV")
    private WebElement EnterCode;

    @FindBy(id = "com.gt.pi:id/joinTV")
    private WebElement JoinTournament;
    @FindBy(id = "com.gt.pi:id/text_message_")
    private WebElement IncorrectCodeMessage;


    public void ClickOnTournamentsTab() {
        Tournaments_Tab.click();
    }

    public void ClickOnYourTournamentsTab() {
        YourTournamentsTab.click();
    }

    public void ClickOnCreateTournament() {
        CreateTournament.click();
    }

    public void ClickOnSelectGame() {
        SelectGame.click();
        BubbleShooter.click();
    }

    public void EnterTournamentName(String name) {
        TournamentName.sendKeys(name);
    }

    public void GameTime() {
        Time.click();
        SelectTime.click();
    }

    public void ClickOnCreateButton() {
        CreateButton.click();
    }

    public void ClickOnBack() {
        Back.click();
    }

    public WebElement NameOfTournament() {
        return NameOfTournamentS;
    }

    public void ClickOnTestTournament() {
        testtournament.click();
    }

    public void ClickOnDeleteButton() {
        DeleteIcon.click();
    }

    public void Clickdelete() {
        delete.click();
    }

    public WebElement NoTournaments() {
        return NoTournamentsmessage;
    }

    public void ClickOnShareButton() {
        ShareButton.click();
    }

    public WebElement Code() {
        return Code;
    }

    public void ClickCloseCode() {
        CloseCopyCode.click();
    }

    public void ClickOnJoinButton() {
        JoinButton.click();
    }

    public WebElement EnterCode() {
        return EnterCode;
    }

    public void ClickOnJoinTournament() {
        JoinTournament.click();
    }

    public WebElement IncorrectCodeMessagE() {
        return IncorrectCodeMessage;
    }


}
