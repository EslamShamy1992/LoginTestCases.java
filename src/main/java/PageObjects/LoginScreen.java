package PageObjects;

import Base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginScreen extends BasePage {


    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    private WebElement allow;
    @FindBy(id = "com.gt.pi:id/text_ok")
    private WebElement Session_Button;
    @FindBy(id = "com.gt.pi:id/phoneET")
    private WebElement Phone_Number;
    @FindBy(id = "com.gt.pi:id/btn_verify_code")
    private WebElement SignIn_Button;
    @FindBy(id = "com.gt.pi:id/otpEt")
    private WebElement Enter_verification_code;
    @FindBy(id = "com.gt.pi:id/verifyAndLoginBtn")
    private WebElement Verify_Button;
    @FindBy(id = "com.gt.pi:id/hintCode")
    private WebElement Sent_digits_message;
    @FindBy(id = "com.gt.pi:id/googleLoginBtn")
    private WebElement Google_Account_Button;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout")
    private WebElement Eslam_Account;
    @FindBy(id = "com.gt.pi:id/btn_login_as_guest")
    private WebElement Enter_As_Guest;
    @FindBy(id = "com.gt.pi:id/sideMenuIV")
    private WebElement MENU;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[3]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.TextView")
    private WebElement profile_button;
    @FindBy(id = "com.gt.pi:id/tv_signup")
    private WebElement Sign_Up_Button;

    public void Click_On_Allow() {
        allow.click();
    }

    public void Click_On_Session_Button() {
        Session_Button.click();
    }

    public void Enter_Phone_Number(String phone) {
        Phone_Number.sendKeys(phone);
    }

    public WebElement SignIn_Button() {
        return SignIn_Button;
    }

    public void Enter_Verification_code(String verifycode) {

        Enter_verification_code.sendKeys(verifycode);
    }

    public GamesScreen Click_on_Verify_Button() {

        Verify_Button.click();
        return new GamesScreen(driver);
    }

    public WebElement We_Sent_Digits_Number() {

        return Sent_digits_message;
    }

    public void Click_on_google_button() {
        Google_Account_Button.click();
    }

    public void Click_on_Eslam_account() {
        Eslam_Account.click();
    }

    public void Click_on_Enter_As_Guest() {
        Enter_As_Guest.click();

    }

    public SignupScreen Click_on_Sign_Up_Button() {
        Sign_Up_Button.click();
        return new SignupScreen(driver);
    }
}
