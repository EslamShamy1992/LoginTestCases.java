package PageObjects;

import Base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GamesScreen extends BasePage {
    public GamesScreen(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.gt.pi:id/tv_skip")
    private WebElement SkipTutorialGames;

    @FindBy(id = "com.gt.pi:id/mission_rewards_iv")
    private WebElement RewardBox;
    @FindBy(id = "com.gt.pi:id/sideMenuIV")
    private WebElement Menu;
    @FindBy(id="com.gt.pi:id/item_home")
    private WebElement GamesButton;
    @FindBy(id="com.gt.pi:id/item_mission")
    private WebElement MissionButton;
    @FindBy(id="com.gt.pi:id/eventsTitle")
    private WebElement MissionTitle;
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[2]")
    private WebElement KunaiThrowGame;









    public void Skip_Games_Tutorial(){

        SkipTutorialGames.click();
    }

    public WebElement Reward_Box(){
        return RewardBox;
    }
    public WebElement Menu(){
        return Menu;
    }
    public WebElement TutorialGames(){
        return SkipTutorialGames;
    }
    public void Games_Button_is_displayed(){

         GamesButton.click();
    }

    public void Mission_Button(){
        MissionButton.click();
    }
    public WebElement Mission_Ttle(){
        return MissionTitle;
    }
    public void Click_On_Kunai_Throw_Game(){
        KunaiThrowGame.click();
    }

}

