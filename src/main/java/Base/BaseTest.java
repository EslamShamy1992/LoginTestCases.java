package Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

     public AndroidDriver driver;
    @BeforeMethod
    public void Launch_Playit_Android() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"AFMEUT1B15004272");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability("appActivity","com.gt.pi.ui.main.MainActivity");
        caps.setCapability("appPackage","com.gt.pi");
        driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
    }

   /* @AfterMethod
    public void tearDown(){
        driver.quit();
    }*/
}
