package PageObjects;

import Base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class KunaiThrowScreen extends BasePage {





    public KunaiThrowScreen(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(id="com.gt.pi:id/playBtn")
    private WebElement ClickOnPlayButton;

    @FindBy(id="com.gt.pi:id/mainBackIV")
    private WebElement ClickOnBackButton;




    public void Click_On_Play_Button(){

       ClickOnPlayButton.click();

    }

    public void Click_On_Back_Button(){

        ClickOnPlayButton.click();
    }







}
