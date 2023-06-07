package PageObjects;

import Base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Refer_EarnScreen extends BasePage {
    public Refer_EarnScreen(AndroidDriver driver) {
        super(driver);
    }

   @FindBy(id = "com.gt.pi:id/referWinTV")
    private WebElement Refer_and_earn;
    @FindBy (id = "com.gt.pi:id/text_copy_referal_code")
    private WebElement Refer_Code;
@FindBy(id = "com.gt.pi:id/image_whatsapp")
private WebElement whatsapp_icon;
@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
private WebElement SendTo_Whatsapp;

public void Click_on_Refer_and_earn(){
    Refer_and_earn.click();
}
public WebElement Refer_Code(){
return  Refer_Code;
}
public WebElement Whatsapp(){
return  whatsapp_icon; }
    public WebElement Sendto(){
    return SendTo_Whatsapp;
    }



}