package PageObjects;

import Base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuestPage extends BasePage {
    public GuestPage(AndroidDriver driver) {
        super(driver);
    }
    @FindBy(id = "com.gt.pi:id/sideMenuIV")
    private WebElement Menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[3]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.TextView")
private WebElement Profile_Button;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.TextView")
    private WebElement Must_Signup_First;
    @FindBy(id = "com.gt.pi:id/tv_skip")
    private WebElement Skip;



    public void Click_On_Menu(){
        Menu.click();}
   public void Click_On_Profile_Button(){
        Profile_Button.click();
   }

   public WebElement Must_Signup_First(){
        return Must_Signup_First;
   }

   public void Click_On_Skip_Tutorial(){

        Skip.click();
   }


    }
