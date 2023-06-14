package PageObjects;

import Base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StoreScreen extends BasePage {
    public StoreScreen(AndroidDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Store\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement Store_icon;
    @FindBy(id = "com.gt.pi:id/itemsButton")
    private WebElement items_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[4]")
    private WebElement Purchase_ten_Lives;
    @FindBy(id = "com.gt.pi:id/livesHomeTV")
    private WebElement lives;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
    private WebElement Buy_Button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ImageView[2]")
    private WebElement Payment_Successful;

@FindBy(id = "com.gt.pi:id/btn_purchase")
private WebElement Purchase_Subscription;

@FindBy(id = "com.gt.pi:id/buyButton")
private WebElement BuySubscription_Button;

@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
private WebElement Subscribe_Button;

@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView")
private WebElement Subscribed;

@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[1]")
private WebElement Already_Subscribed;











    public void Click_on_store_icon() {

        Store_icon.click();
    }

    public void Click_on_items_Button() {
        items_Button.click();
    }

    public void Click_on_Purchase_ten_Lives() {
        Purchase_ten_Lives.click();
    }

    public WebElement Lives() {
        return lives;
    }

    public void Click_on_buy_button() {
        Buy_Button.click();
    }

    public WebElement Payment_Successful() {
        return Payment_Successful;
    }
    public void Click_on_Purchase_Subscription(){
        Purchase_Subscription.click();
    }
public void Click_On_BuySubscription_Button(){
        BuySubscription_Button.click();
}
public void Click_on_Subscribe_button(){
        Subscribe_Button.click();
}

public WebElement Subscribed(){
        return Subscribed;
}
public WebElement AlreadySubscribed(){
        return Already_Subscribed;
}















}
