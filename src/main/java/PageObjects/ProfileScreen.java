package PageObjects;

import Base.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileScreen extends BasePage {
    public ProfileScreen(AndroidDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[3]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.TextView")
private WebElement Profile_Button;
    @FindBy(id = "com.gt.pi:id/usernameET")
    private WebElement Username;

    @FindBy(id = "com.gt.pi:id/emailET")
    private WebElement Email;

@FindBy (id= "com.gt.pi:id/birthDate")
private WebElement BirthdateField;
@FindBy(id = "android:id/button1")
private WebElement ok_button;
@FindBy(id = "com.gt.pi:id/female")
private WebElement Female_Checkbox;

@FindBy(id = "com.gt.pi:id/bioET")
private WebElement Bio;
@FindBy(id = "com.gt.pi:id/submitBtn")
private WebElement Save_Button;




public void Click_on_profileButton(){
    Profile_Button.click();
}
public WebElement Username(){
    return Username;
}
public WebElement Email(){
    return Email;
}
public void Click_on_Birthdate(){
    BirthdateField.click();
    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Jan\"))"));
    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(1)).scrollIntoView(new UiSelector().text(\"12\"))"));
    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(2)).scrollIntoView(new UiSelector().text(\"2001\"))"));
}
public void Click_on_ok(){
    ok_button.click();
}
public void Click_on_Female_Checkbox()
{
    Female_Checkbox.click();
}
public void Bio(String bio){
    Bio.sendKeys(bio);
}
public void Click_on_save_button(){
    Save_Button.click();
}

    public WebElement Successful_message(){
       return driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Updated Successfully\"))"));
    }
}
