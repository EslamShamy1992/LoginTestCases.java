package PageObjects;

import Base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupScreen extends BasePage {
    public SignupScreen(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.gt.pi:id/emailET")
private WebElement Email;
@FindBy(id = "com.gt.pi:id/phoneET")
private WebElement Phone_Number;
@FindBy(id = "com.gt.pi:id/btn_verify_code")
private WebElement Signup_Button;
@FindBy(id = "com.gt.pi:id/termsAndCondition")
private WebElement CheckBox;
@FindBy(id ="com.gt.pi:id/snackbar_text")
private WebElement invalid_number_message;

@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
private WebElement Signup_Text;

@FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]")
private WebElement Signin_Text;

@FindBy(id = "com.gt.pi:id/text_to_terms_conditions")
private WebElement TermsANdCondition;
@FindBy(id = "com.gt.pi:id/toolbarLogoIV")
private WebElement PlayitLogo;



    public void Enter_Email(String mail){
        Email.sendKeys(mail);
    }
    public void Enter_Phone_number(String number){
       Phone_Number.sendKeys(number);
    }
public void Click_Signup(){
        Signup_Button.click();
}
public void Click_on_checkBox(){
        CheckBox.click();
}
public WebElement invalid_PhoneNumber_Message(){
        return invalid_number_message;
}
public WebElement Signup_Text(){
        return Signup_Text;
}
public WebElement Signin_Text(){
        return Signin_Text;
}
public void Terms_And_Condition(){

        TermsANdCondition.click();
}
public WebElement Playit_Logo(){
return PlayitLogo;
}
}
