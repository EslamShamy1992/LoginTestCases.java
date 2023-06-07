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
}

