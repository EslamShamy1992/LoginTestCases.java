package PageObjects;

import Base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingScreen extends BasePage {
    public SettingScreen(AndroidDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[3]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.TextView")
private WebElement Settings_Button;
@FindBy(id = "com.gt.pi:id/LogOutSetting")
private WebElement Logout_button;
@FindBy(id="com.gt.pi:id/text_confirm")
private WebElement Logout_Confirm;
@FindBy(id="com.gt.pi:id/text_cancle")
private WebElement Logout_Cancel;
@FindBy(id = "com.gt.pi:id/toolbarLogoIV")
private WebElement playit_Logo;
    @FindBy(id = "com.gt.pi:id/termsTV")
    private WebElement Terms_Conditions_Button;

@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView[1]")

private WebElement Terms_and_conditions_Text;

@FindBy(id = "com.gt.pi:id/privacyTV")
private WebElement privacy_policy_button;

@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView[1]")
private WebElement privacy_text;



    public void Click_on_Settings_Button(){
        Settings_Button.click();
    }
public void Click_on_Logout_Button(){
        Logout_button.click();
}
public void Click_on_logout_confirm(){
        Logout_Confirm.click();
}
public void Click_on_Logout_Cancel(){
        Logout_Cancel.click();
}
public WebElement Playit_Logo(){
    return playit_Logo;
    }
   public void Click_on_Terms_Conditions_Button(){
        Terms_Conditions_Button.click();
   }
public WebElement Terms_and_conditions_Text(){
        return Terms_and_conditions_Text;
}
public void Click_on_privacy_policy_button(){
        privacy_policy_button.click();
}
public WebElement privacy_Text(){
        return privacy_text;
}
}
